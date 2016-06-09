<%-- 
    Document   : login
    Created on : Jun 8, 2016, 10:51:08 PM
    Author     : Matth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>login</title>
        <meta charset="UTF-8">
        <jsp:include page="meta.jsp" />
    </head>
    <body id="blocco">
        <h1>Pagina Login</h1>
        <form method="GET">
        <div id="centralo">
        <!-- Inserimento username e password -->
        <div>
        <label for="username">username</label>
        <input type="text" name="username" id="username" />
        <label for="password">password</label>
        <input type="text" name="password" id="password" />
        </div>
        
        <!-- Tasti di invio e reset -->
        <div>
            <input type="submit" value="Invia"/>
            <input type="reset" value="Reimposta"/>
        </div>
            
            
        <!-- Link alle altre pagine html -->
        <div style="margin: 0 auto; text-align: center">
        <a class="button" href="descrizione.jsp"> Pagina della descrizione </a>
        <a class="button" href="venditore.jsp"> Pagina del venditore </a>
        <a class="button" href="cliente.jsp"> Pagina del cliente </a>
        </div>
        </div>
        </form>
        
    </body>
</html>