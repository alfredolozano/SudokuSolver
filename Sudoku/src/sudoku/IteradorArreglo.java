package sudoku;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Define la clase IteradorArreglo.
 * Tiene como atributos: <ul>
 * <li> El arreglo que funciona como colección de datos.</li>
 * <li> El número total de elementos.</li>
 * <li> El número o posición en la que se encuentra.</li>
 * </ul>
 * @author CARLOS OCTAVIO ORDAZ BERNAL
 * @author ALFREDO LOZANO ORTEGA
 * @author GUILLERMO CARMONA OLIVERA
 */
public class IteradorArreglo<T> implements Iterator<T>{
    
    private T[] coleccion;
    private int total;
    private int actual;
    
    /**
     * Constructor que inicializa el arreglo, el tamaño del arreglo y la posición.
     * @param a - T[], arreglo de cualquier tipo
     * @param tamaño - int, tamaño total de elementos
     */
    public IteradorArreglo(T a[], int tamaño){
        coleccion = a;
        total = tamaño;
        actual = 0;
    }
    
    /**
     * Método que revisa si exite un siguiente elemento en la colección de datos.
     * @return boolean <ul>
     * <li> true - si hay otro elemento.
     * <li> false - si no hay otro elemento.
     * </ul>
     */
    public boolean hasNext(){
        return actual < total;
    }
    
    /**
     * Método que devuelve el siguiente elemento de la colección.
     * @return resul - T, el elemento siguiente en la colección
     */
    public T next(){
        if(!hasNext()){
            throw new NoSuchElementException("-");
        }
        else{
            T resul = coleccion[actual];
            actual++;
            return resul;
        }        
    }
    
    /**
     * Método que devuelve una excepción si se intenta eliminar un dato de la colección.
     */
    public void remove(){
        throw new UnsupportedOperationException();
    }

}
