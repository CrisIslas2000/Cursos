<%-- 
    Document   : recursoPrivado
    Created on : 14 ago. 2023, 9:21:19
    Author     : CAMI-Informatica
--%>

<%
    String colorFondo = request.getParameter("colorFondo");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor='<%=colorFondo%>'>
    </body>
</html>
