<%-- 
    Document   : cliente
    Created on : Jun 8, 2016, 10:49:40 PM
    Author     : Matth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente</title>
        <jsp:include page="meta.jsp" />
    </head>
    <body>
        <h1>Pagina cliente</h1>
    
    <!-- Tabella con le varie sezioni -->
        <c:choose>
            <c:when test="${sessionScope.cliente==null}">           
                <p>Spiacente, non hai i permessi per visualizzare questa pagina!</p>
            </c:when>
            <c:when test="${sessionScope.cliente!=null}" >
                <jsp:include page="tabella.jsp" />
            </c:when>
        </c:choose>
    </body>
</html>
