<%-- 
    Document   : desplegarVariables
    Created on : 09-mar-2020, 2:34:04
    Author     : estel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Desplegar variables</title>
    </head>
    <body>
        <h1>Despligue de variables</h1>
        
        <p>Variable en alcance request: ${mensaje}</p>
        <br/>
        <br/>
        Variable en alcance session:
        <br/>
        Rectangulo:
        Base: ${rectangulo.base}<br/>
        Altura: ${rectangulo.altura}<br/>
        Area: ${rectangulo.area}<!-- Metodo get Area-->
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">
        Regresar al inicio
        </a>
        
    </body>
</html>
