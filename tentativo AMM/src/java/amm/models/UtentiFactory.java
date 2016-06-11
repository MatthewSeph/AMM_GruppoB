/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.models;

import java.util.ArrayList;

/**
 *
 * @author Matth
 */
public class UtentiFactory {
    private static UtentiFactory singleton;
    public static UtentiFactory getInstance(){
        if (singleton == null){
            singleton = new UtentiFactory();
        }
        return singleton;
    }

    public static UtentiFactory singleton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private ArrayList<Utente> listaVenditore= new ArrayList<Utente>();
    private ArrayList<Utente> listaCliente= new ArrayList<Utente>();
    
    //Costruttore
    public UtentiFactory(){
        
        //Clienti
        Cliente cliente_1 = new Cliente();
        cliente_1.setId(0);
        cliente_1.setNome("Davide");
        cliente_1.setCognome("Spano");
        cliente_1.setUsername("DavideSpano");
        cliente_1.setPassword("1");
        listaCliente.add(cliente_1);
        
        Cliente cliente_2 = new Cliente();
        cliente_2.setId(1);
        cliente_2.setNome("Alessandro");
        cliente_2.setCognome("Carcangiu");
        cliente_2.setUsername("AlessandroCarcangiu");
        cliente_2.setPassword("2");
        listaCliente.add(cliente_2);
        
        //Venditori
        Venditore venditore_1 = new Venditore();
        venditore_1.setId(0);
        venditore_1.setNome("Matteo");
        venditore_1.setCognome("Pes");
        venditore_1.setUsername("MatthewSeph");
        venditore_1.setPassword("1");
        listaVenditore.add(venditore_1);
        
        Venditore venditore_2 = new Venditore();
        venditore_2.setId(1);
        venditore_2.setNome("Gastani");
        venditore_2.setCognome("Frinzi");
        venditore_2.setUsername("DottoressaGastaniFrinzi");
        venditore_2.setPassword("1");
        listaVenditore.add(venditore_2);
    }
    /* Metodi */


    public ArrayList<Utente> getVenditoreList(){
        return listaVenditore;
    }
    public Utente getVenditore(int id){
        for(Utente u : listaVenditore){
            if(u.id == id)
                return u;
        }
        return null;
    }
    public ArrayList<Utente> getClienteList(){
        return listaCliente;
    }
    public Utente getCliente(int id){
        for(Utente u : listaCliente){
            if(u.id == id)
                return u;
        }
        return null;
    }
    
    public ArrayList<Utente> getUserList(){
        ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
        
        listaUtenti.addAll(listaVenditore);
        listaUtenti.addAll(listaCliente);
        
        return listaUtenti; 
    } 

}
