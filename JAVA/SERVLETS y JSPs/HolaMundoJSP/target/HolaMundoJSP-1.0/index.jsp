<%-- 
    Document   : index
    Created on : 8 ago. 2023, 12:24:06
    Author     : INFORMATICA CRIS
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>HolaMundo JSPs</h1>
        <ul>
            <li> <% out.print("HolaMundo con Scriplets"); %> </li>
            <li> ${ "HolaMundo con Expression Languaje (EL)" } </li>
            <li> <%= "HolaMundo con Expression" %> </li>
            <li> <c:out value="HolaMundo con JDTL"/> </li>
        </ul>

    </body>
</html>
