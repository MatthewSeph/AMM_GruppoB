<%-- 
    Document   : descrizione
    Created on : Jun 8, 2016, 10:50:42 PM
    Author     : Matth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Anime & Manga Shop</title>
        <jsp:include page="meta.jsp" />
    </head>
    <body>
        <!-- Titolo -->
        <h1>Anime & Manga Shop</h1>
        <p>Benvenuto sul nuovissimo ed efficientissimo sito di vendita online dei tuoi anime e manga preferiti!</p>
        
        <!-- Link alle sezioni di descrizione.html -->
        <ol>
            <div style="margin: 0 auto; text-align: center">
                <a class="button" href="#primo">Link per convincerti </a> 
                <a class="button" href="#secondo">Link per convincerti di più </a> 
                <a class="button" href="#terzo">Link per i dati </a> 
                <a class="button" href="#quarto">Link per i tempi </a> 
            </div>
            </ol>
        
        <div id="centralo">
        <!--Sezioni di descrizione.html -->
        <h2 id="primo">Perchè scegliere il nostro sito?</h2>
        <p>Efficienza, massima qualità e rapidità di consegna, e queste sono soltanto alcune delle caratteristiche chiave che ci contraddistinguono!</p>
        
        <h2 id="secondo">Tieniti sempre aggiornato!</h2>
        <p>Ogni circa tre settimane, il nostro shop online verrà rinnovato con nuovi articoli, sempre al miglior prezzo sul mercato dei siti abusivi!</p>
        
        <h3 id="terzo">FAQ: quali sono i metodi di pagamento?</h3>
        <p>Potrai usare tutte le carte di credito in tuo possesso, Postepay inclusa, oppure Paypal o qualunque sito che ci fornisca tutti i tuoi dati personali. 
            Ti assicuriamo che i dati che inserisci su questo sito sono protetti grazie al nostro server criptato.</p>
        
        <h3 id="quarto">FAQ: quali sono i tempi di consegna?</h3>
        <p>Nel caso in cui il pacco dovesse partire, dipenderà dalla velcità del taxi che ti consegnerà il pacco. 
            Vi sarà comunque possibile effettuare un ricorso a qualcuno, con la speranza che abbia successo.
            Potremmo decidere di rispedire il vostro pacco, o di spedirvi dei simpaticissimi portachiavi che vi permetteranno di mostrare ai vostri
            amici l'efficienza degli acquisti in rete.</p>
            
        <!--Link a login.html -->
        <div style="margin: 0 auto; text-align: center">
        <li><a class="button" href="login.jsp"> Link per accedere! </a></li>
        </div>
        </div>
    </body>
</html>

