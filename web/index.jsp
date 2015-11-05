<%-- 
    Document   : index
    Created on : 1/11/2015, 05:57:40 PM
    Author     : saytron
--%>

<%@page import="Grupo4.Modelo.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="estilo.css"/>
    </head>
    <body>
        <h1>GRUPO 04 SIMULADOR DE COLAS DE UN BANCO</h1>
        <p><h2>USUARIO Y CONTRASEÑA PARA INGRESAR</h2></p>
    <div id="formul">
    <form name="login" action="Login" method="POST">
        <p> Usuario: </p><input class="campos" type="text" name="usuario" value="" />
        <p> Contraseña: </p><input class="campos" type="password" name="passwd" value="" />
        <div id="b_submit">
            <input class ="boton" type="submit" name="B1" value="Enviar" />
        </div>
    </form>
</div>
        
    </body>
</html>
