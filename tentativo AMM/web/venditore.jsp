<%-- 
    Document   : venditore
    Created on : Jun 8, 2016, 10:51:25 PM
    Author     : Matth
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <c:choose>
            <c:when test="${sessionScope.venditore==null}">
                <p>Spiacente, non hai i permessi per visualizzare questa pagina!</p>
            </c:when>
            <c:otherwise>
        <div>
        <label for="NomeOggetto">Nome Oggetto</label>
        <input type="text" name="nomeOggetto" id="nomeOggetto" />
        </div>
        
        <!--Url -->
        <div>
        <label for="url">URL Oggetto</label>
        <input type="url" name="url" id="url" />
        </div>
    
            
        <!--Descrizione -->
        <div>
            <label for="decrizione">Descrizione oggetto</label>
        <textarea name="Descrizione" id="Descrizione"
                  rows="10" cols="40">Qui!</textarea>
        </div>
        
        <!--Prezzo -->
        <div>
        <label for="prezzo">Prezzo Oggetto</label>
        <input type="number" name="prezzo" id="prezzo" />
        </div>
        
        <!--Quantità -->
        <div>
        <label for="quantità">Quantità Oggetti</label>
        <input type="range" min='1' max='100'
               name="quantita" id="quantita" />
        </div>
        <div>
            <input type="submit" name="SubmitOggetto" value="Invia"/>
            <input type="reset" value="Reimposta"/>
        </div>
        
        <div style="margin: 0 auto; text-align: center">
        <a class="button" href="descrizione.jsp"> Pagina della descrizione </a>
        <a class="button" href="login.jsp"> Pagina del login </a>
        </div>
        </form>
            </c:otherwise>
    </c:choose>
        </body>
</html>

