/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import amm.models.Utente;
import amm.models.UtentiFactory;
import amm.models.Venditore;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Matth
 */
@WebServlet(urlPatterns = {"/login.html"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");


        //Dati utili per la servlet
        HttpSession session = request.getSession();
        ArrayList<Utente> listaUtenti = UtentiFactory.getInstance().getUserList();        
        String username=null;
        String password=null;
        
        //Se vengono inviati dei dati salvo i dati inseriti nelle variabili precedentemente create
        if(request.getParameter("Submit")!=null){ 
            username=request.getParameter("username");
            password=request.getParameter("password");
        }
        
        //Scorro la lista fino a trovare (se esistono) i dati di un utente
            for(Utente u:listaUtenti){
                if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                    session.setAttribute("loggedIn", true);
                    session.setAttribute("id", u.getId());
                    
                    //Attribuisco alle due parti dell'if-else il venditore e il cliente, lasciando il caso in cui non sia autenticato a dopo
                    
                    //se è un venditore, carico la pagina venditore.jsp
                    if(u instanceof Venditore){
                        session.setAttribute("venditore", u);
                        response.sendRedirect("venditore.jsp");
                        return;
                    }
                    //altrimenti, carico la pagina cliente.jsp
                    else{
                        session.setAttribute("cliente", u);
                        response.sendRedirect("cliente.jsp");
                        return;
                    }
                }
            }
            //Nel caso in cui i dati siano errati mostro un messaggio di errore e permetto di riprovare
            request.setAttribute("datiErrati", "Hai inserito dei dati sbagliati, riprova!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
    
    
    
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
            
}