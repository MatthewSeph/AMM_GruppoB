<%-- 
    Document   : conferma
    Created on : Jun 16, 2016, 3:59:09 PM
    Author     : Matth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina di conferma</h1>
            <table>
                <tr>
                    <th>Nome</th>
                    <th>Descrizione</th>
                    <th>Link Immagine</th>
                    <th>Prezzo</th>
                    <th>Quantita</th>
                </tr>
                <tr>
                    <td>${requestScope.conferma}</td>
                    <td>${sessionScope.nuovoOggetto.Nome}</td>
                    <td>${sessionScope.nuovoOggetto.Descrizione}</td>
                    <td>${sessionScope.nuovoOggetto.ImageURL}</td>
                    <td>${sessionScope.nuovoOggetto.Prezzo}</td>
                    <td>${sessionScope.nuovoOggetto.Quantita}</td>
                </tr>
             </table>
        
    </body>
</html>
