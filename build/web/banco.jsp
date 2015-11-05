<%-- 
    Document   : banco
    Created on : 1/11/2015, 10:21:18 PM
    Author     : saytron
--%>

<%@page import="Grupo4.Modelo.Cola"%>
<%@page import="Grupo4.Servlets.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="estilo.css"/>
    </head>
    <body>
        <h1>PANEL DE ADMINISTRACION</h1>
        <div id="formul">
            <form name="form3" action="Acolar" method="POST">
                <br>Nombre:</br> <input class="campos" type="text" name="nombre" value="" />
                <br>DPI</br><input class="campos" type="text" name="dpi" value="" />
                <br>Correo</br><input class="campos" type="text" name="correo" value="" />
                <br>Contraseña</br><input class="campos" type="password" name="passwd" value="" />
                <div id="b_submit">
                <input class="boton" type="submit" name="enviar" value="Enviar a la cola" />
                </div>
            </form>
           
           
                    
                    
        </div>
        
        
        
    </body>
</html>
