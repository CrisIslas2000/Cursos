<%-- 
    Document   : getterJsp
    Created on : 14 ago. 2023, 10:51:22
    Author     : CAMI-Informatica
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del JavaBean</title>
    </head>
    <body>
        <h1>JSP que lee valores del JavaBean</h1>
        <jsp:useBean id="rectangulo" class="Beans.Rectangulo" scope="session"/>
        <br/>
        Valor base: <jsp:getProperty name="rectangulo" property="base"/>
        <br/>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura"/>
        <br/>
        Valor area: <jsp:getProperty name="rectangulo" property="area"/>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
