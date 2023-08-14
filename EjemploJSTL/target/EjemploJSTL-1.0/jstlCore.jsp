<%-- 
    Document   : jstlCore
    Created on : 14 ago. 2023, 12:43:18
    Author     : CAMI-Informatica
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core </title>
    </head>
    <body>
        <h1>JSTL Core (Japs Stardand Tag Library)</h1>
        <!-- Manipulacion de Variables -->

        <!-- Definimos el valor de la variable -->
        <c:set var="nombre" value="Ernesto" />
        <!-- Desplegamos el valor de la variable -->
        Variable nombre: <c:out value="${nombre}"/>
        <br/>
        <br/>
        Variable con codigo HTML:
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br/>
        <br/>
        <!-- Codigo condicionado, uso de if -->
        <c:set var="bandera" value="true"/>

        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <!<!-- Codigo condicionado, uso de switch -->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opcion 1 selecionada
                </c:when>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opcion 2 selecionada
                </c:when>
                <c:otherwise>
                    <br/>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <!-- Iteracion de un articulo -->
        <%
            String nombres[] = {"Claudia", "Pedro", "Juan"};
            request.setAttribute("nombres", nombres);
        %>
        <br/>
        Lista de nombres:
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>Nombre: ${persona}</li>
                </c:forEach>
        </ul>
        <br/>
        <br/>
        <a href="index.jsp">Regreso al inicio</a>
    </body>
</html>
