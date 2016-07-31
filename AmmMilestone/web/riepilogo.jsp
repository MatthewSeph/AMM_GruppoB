<%-- 
    Document   : riepilogo
    Created on : Jun 16, 2016, 4:38:17 PM
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
        <h2>Riepilogo</h2>
                <h2>Nome prodotto - </h2><h3>${nuovoOggetto.Nome}</h3> 
                <h2>Descrione - </h2><h3>${nuovoOggetto.Descrizione}</h3>
                <h2>Immagine - </h2><h3>${nuovoOggetto.ImageURL}</h3>
                <h2>Prezzo - </h2><h3>${nuovoOggetto.Prezzo}</h3>
                <h2>Quantita - </h2><h3>${nuovoOggetto.Quantita}</h3>
    </body>
</html>
