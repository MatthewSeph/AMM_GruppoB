<%-- 
    Document   : venditore
    Created on : Jun 8, 2016, 10:51:25 PM
    Author     : Matth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>venditore</title>
        <jsp:include page="meta.jsp" />
    </head>
    <body>
        <form method="GET">
        <h1>Pagina Venditore</h1>
        <!--Nome -->    
        <div>
        <label for="NomeOggetto">Nome Oggetto</label>
        <input type="text" name="NomeOggetto" id="NomeOggetto" />
        </div>
        
        <!--Url -->
        <div>
        <label for="url">URL Oggetto</label>
        <input type="url" name="url" id="url" />
        </div>
    
            
        <!--Descrizione -->
        <div>
        <textarea name="Descrizione" id="Descrizione"
                  rows="10" cols="40">Descrizione Oggetto</textarea>
        </div>
        
        <!--Prezzo -->
        <div>
        <label for="prezzo">Prezzo Oggetto</label>
        <input type="number" name="url" id="prezzo" />
        </div>
        
        <!--Quantità -->
        <div>
        <label for="quantità">Quantità Oggetti</label>
        <input type="range" min='1' max='100'
               name="quantità" id="quantità" />
        </div>
        
        <div style="margin: 0 auto; text-align: center">
        <a class="button" href="descrizione.jsp"> Pagina della descrizione </a>
        <a class="button" href="login.jsp"> Pagina del login </a>
        </div>
        </form>
        </body>
</html>

