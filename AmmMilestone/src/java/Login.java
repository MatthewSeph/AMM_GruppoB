/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import amm.models.Utente;
import amm.models.UtentiFactory;
import amm.models.Venditore;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/Login"})
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
        
        /*Creo la sessione*/
        HttpSession session = request.getSession();
        
        /*Se non è stato premuto il bottone*/
        if(request.getParameter("Submit")==null){
            /*Se non ci sono utenti loggati mostro Login.jsp*/
            if(session.getAttribute("loggedIn")==null){
                response.sendRedirect("Login.jsp");
                return;
            }
        }   
        
        /*Se c'è già un venditore connesso*/
        if(session.getAttribute("venditore")!=null){
            response.sendRedirect("Venditore.jsp");
        }
        
        /*Se c'è già un cliente connesso*/
        if(session.getAttribute("cliente")!=null){
            response.sendRedirect("Cliente.jsp");
        }
        
        String username = null;
        String password = null;
        
        /*Se viene premuto il bottone..*/
        if(request.getParameter("Submit")!=null){
            /*Leggo il valore dei campi Username e Password*/
            username = request.getParameter("Username");
            password = request.getParameter("Password");
        }
        /*Genero la lista degli utenti tramite UtentiFactory*/
        ArrayList<Utente> listaUtenti = UtentiFactory.getInstance().getUserList();
        
        /*Scorro la lista degli utenti per trovare una corrispondenza*/
            for(Utente u : listaUtenti){
                /*Se trovo una corrispondenza imposto le variabili di sessione...*/
                if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                    session.setAttribute("loggedIn", true);
                    session.setAttribute("id", u.getId());
                    /*...Se è un venditore...*/
                    if(u instanceof Venditore){         
                        if(session.getAttribute("cliente")!=null){  /*Controllo che non ci siano clienti connessi*/
                           session.setAttribute("cliente", null);
                        }
                        /*...Passo l'oggetto venditore alla sessione e visualizzo Venditore.jsp*/
                        session.setAttribute("venditore", u);
                        response.sendRedirect("Venditore.jsp");
                        return;
                    }
                    /*...Se è un cliente...*/
                    else{
                        if(session.getAttribute("venditore")!=null){ /*Controllo che non ci siano venditori connessi*/
                            session.setAttribute("venditore", null); /*                                             */
                        }
                        /*...Passo l'oggetto cliente alla sessione e visualizzo Cliente.jsp*/
                        session.setAttribute("cliente", u);
                        response.sendRedirect("Cliente.jsp");
                        return;
                    }
                }
            }
    /*Se non ho trovato corrispondenze passo un errore alla JSP*/
            request.setAttribute("Errore", "Inserire credenziali corrette.");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
    
    
    
    
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
