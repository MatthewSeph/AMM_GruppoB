/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import amm.models.Oggetti;
import amm.models.OggettiFactory;
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
@WebServlet(urlPatterns = {"/Venditore"})
public class Venditore extends HttpServlet {

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
       
        HttpSession session = request.getSession();
        ArrayList<Oggetti> listaOggetti = OggettiFactory.getInstance().getOggettiList();
        String nomeOggetto;
        String url;
        String Descrizione; 
        Double prezzo;
        int quantità;
        
        //Come per la servlet Login.java, se viene premuto il bottone salvo i dati inseriti dal venditore
        if(request.getParameter("Submit")!=null){ 
            Oggetti nuovoOggetto=new Oggetti();
            
            nomeOggetto=request.getParameter("nomeOggetto");
            url=request.getParameter("url");
            Descrizione=request.getParameter("Descrizione");
            prezzo=Double.parseDouble(request.getParameter("prezzo"));
            quantità=Integer.parseInt(request.getParameter("quantità"));
            
            nuovoOggetto.setNome(nomeOggetto);
            nuovoOggetto.setDescrizione(Descrizione);
            nuovoOggetto.setQuantita(quantità);
            nuovoOggetto.setImageURL(url);
            nuovoOggetto.setPrezzo(Double.parseDouble(request.getParameter("prezzo")));
            
            
            
            
        
            request.setAttribute("conferma", "Oggetto aggiunto alla vendita!");
            request.getRequestDispatcher("venditore.jsp").forward(request, response);
    }
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
