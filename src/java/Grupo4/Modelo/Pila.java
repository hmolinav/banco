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
public class Pila extends Lista{
    public Pila()
    {
        super("pila");
    }
    
    public void push(Object objeto)
    {
        insertarAlFrente(objeto);
    }
    public Object pop()
    {
        return eliminarDelFrente();
    }
}
