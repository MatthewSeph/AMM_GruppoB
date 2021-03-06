/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.models;

/**
 *
 * @author Matth
 */
public abstract class Utente {
    /* Attributi */
    protected int id;
    protected String nome;
    protected String cognome;
    protected String username;
    protected String password;
    protected Saldo saldo;
    
    
    /* Costruttore */
    public Utente()
    {
        id = 0;
        nome = "";
        cognome = "";
        username="";
        password="";
    }
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCognome() {
        return cognome;
    }


    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }
}
