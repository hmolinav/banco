
package Grupo4.Modelo;

/**
 *
 * @author saytron
 */
public class Cola {
    private Lista listaCola;
    
    public Cola()
    {
        listaCola = new Lista("cola");
        
    }
    public void enqueue(Object objeto)
    {
        listaCola.insertarAlFinal(objeto);
    }
    
    public Object dequeue()
    {
        return listaCola.eliminarDelFrente();
    }
    
    public boolean estaVacia()
    {
        return listaCola.estaVacia();
    }
    public Object imprimir(int i)
    {
        return listaCola.Obtener(i);
    }
   
    
}
