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

public class Lista {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private String nombre;
    int size;
    
    public Lista()
    {
        this ("lista");
    }
    
    public Lista(String nombreLista)
    {
        nombre = nombreLista;
        primerNodo = ultimoNodo = null;
        size = 0;
    }
    
    public void insertarAlFrente(Object elementoInsertar)
    {
        if(estaVacia())
            primerNodo = ultimoNodo = new Nodo(elementoInsertar);
        
        else
            primerNodo = new Nodo(elementoInsertar, primerNodo);
        size++;
    }
    
    public void insertarAlFinal(Object elementoInsertar)
    {
        if(estaVacia())
            primerNodo = ultimoNodo = new Nodo(elementoInsertar);
        else
            ultimoNodo = ultimoNodo.siguienteNodo = new Nodo(elementoInsertar);
        size++;
    }
    
    public Object eliminarDelFrente()
    {
        if(estaVacia())
            return "esta vacia";
        
        Object elementoEliminado = primerNodo.datos;
        
        if (primerNodo == ultimoNodo)
            primerNodo = ultimoNodo = null;
        else
            primerNodo = primerNodo.siguienteNodo;
        size--;
        return elementoEliminado;   
    }
    
    public Object eliminarDelFinal()
    {
        if(estaVacia())
            return "esta vacia";
        Object elementoEliminado = ultimoNodo.datos;
        if(primerNodo == ultimoNodo)
            primerNodo = ultimoNodo = null;
        else
        {
            Nodo actual = primerNodo;
            
            while(actual.siguienteNodo != ultimoNodo)
                actual = actual.siguienteNodo;
            ultimoNodo = actual;
            actual.siguienteNodo = null;
            size--;
        }
        return elementoEliminado;
    }
    public boolean estaVacia()
    {
        return primerNodo == null;
        
    }
    
    public Object Obtener(int index)
    {
        int contador = 0;
        Nodo temporal = primerNodo;
        while (contador < index)
        {
            temporal = temporal.ObtenerSiguiente();
            contador++;
        }
        return temporal.obtenerObject();
    }
    
    public void addPrimero(Object obj){
        if(primerNodo == null){
            primerNodo = new Nodo(obj);
        }
        else{
            Nodo temp = primerNodo;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            primerNodo = nuevo;
        }
        size++;
    }
    
    public int size()
    {
        return size;
    }
}
