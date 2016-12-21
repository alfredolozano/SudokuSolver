package sudoku;

import java.util.Iterator;

/**
 * Define la interfaz ConjuntoADT.
 * @author CARLOS OCTAVIO ORDAZ BERNAL
 * @author ALFREDO LOZANO ORTEGA
 * @author GUILLERMO CARMONA OLIVERA
 */
public interface ConjuntoADT<T> extends Iterable<T> {
    
    /**
     * Método que revisa si el conjunto está vacío.
     * @return boolean <ul>
     * <li> true - si está vacío.
     * <li> false - si no está vacío.
     * </ul>
     */
    public boolean isEmpty();
    
    /**
     * Método que devuelve el número de elementos en el conjunto
     * @return cardinalidad - int, el número de elementos en el conjunto
     */
    public int getCardinalidad();
    
    /**
     * Método que revisa si el conjunto contiene cierto dato.
     * @param dato - T, el dato a buscar en el conjunto
     * @return boolean <ul>
     * <li> true - si sí lo contiene.
     * <li> false - si no lo contiene.
     * </ul>
     */
    public boolean contains(T dato);
    
    /**
     * Método que agreaga cierto dato al conjunto.
     * @param dato - T, el dato por agregar.
     * @return boolean <ul>
     * <li> true - si sí lo agregó.
     * <li> false - si no lo agregó.
     * </ul>
     */
    public boolean add(T dato);
    
    /**
     * Método que elimina cierto dato del conjunto.
     * @param dato - T, el dato por eliminar.
     * @return result - T, con el dato eliminado.
     */
    public T remove(T dato);
    
    /**
     * Método que devuelve la unión de dos conjuntos.
     * @param otro - ConjuntoADT, otro conjunto parra operar.
     * @return resul - ConjuntoADT, conjunto con la unión de dos conjuntos.
     */
    public ConjuntoADT<T> union(ConjuntoADT<T> otro);
    
    /**
     * Método que devuelve la intersección de dos conjuntos.
     * @param otro - ConjuntoADT, otro conjunto parra operar.
     * @return resul - ConjuntoADT, conjunto con la intersección de dos conjuntos.
     */
    public ConjuntoADT<T> intersection(ConjuntoADT<T> otro);
    
    /**
     * Método que devuelve la diferencia de dos conjuntos.
     * @param otro - ConjuntoADT, otro conjunto parra operar.
     * @return resul - ConjuntoADT, conjunto con la diferencia de dos conjuntos.
     */
    public ConjuntoADT<T> difference(ConjuntoADT<T> otro);   
    
    /**
     * Método que crea un iterador del arreglo del conjunto.
     * @return Iterator, con el iterador del arreglo del conjunto.
     */
    public Iterator<T> iterator();
        
}
