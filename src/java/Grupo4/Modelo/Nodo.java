/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupo4.Modelo;

/**
 *
 * @author saytron
 */
public class Nodo {
    Object datos;
    Nodo siguienteNodo;
    
    //Constructores
    Nodo (Object objeto)
    {
        this(objeto, null);
    }
    
    Nodo(Object objeto, Nodo nodo)
    {
        datos = objeto;
        siguienteNodo = nodo;
    }
    //Fin de los constructores
    Object obtenerObject()
    {
        return datos;
    }
    
        Nodo ObtenerSiguiente()
    {
        return siguienteNodo;
    }
    
    public void enlazarSiguiente(Nodo n)
   {
       siguienteNodo = n;
   }
}
