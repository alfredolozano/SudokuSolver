package sudoku;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Define la clase ConjuntoA.
 * Tiene como atributos: <ul>
 * <li> El arreglo que funciona como conjunto.</li>
 * <li> El número de elmentos del conjunto.</li>
 * <li> Una constante del tamaño máximo del conjunto.</li>
 * </ul>
 * @author CARLOS OCTAVIO ORDAZ BERNAL
 * @author ALFREDO LOZANO ORTEGA
 * @author GUILLERMO CARMONA OLIVERA
 */
public class ConjuntoA<T> implements ConjuntoADT<T> {
    
    private T[] conjunto;
    private int cardinalidad;
    private final int MAX = 9;
    
    /**
     * Constructor que inicializa el arreglo del conjunto.
     */
    public ConjuntoA(){
        conjunto = (T[]) new Object[MAX];
        cardinalidad = 0;
    }
    
    /**
     * Constructor que inicializa el arreglo del conjunto con un máximo dado.
     * @param max - int, el máximo de tamaño del conjunto. 
     */
    public ConjuntoA(int max){
        conjunto = (T[]) new Object[max];
        cardinalidad = 0;
    }
    
    /**
     * Método que revisa si el conjunto está vacío.
     * @return boolean <ul>
     * <li> true - si está vacío.
     * <li> false - si no está vacío.
     * </ul>
     */
    public boolean isEmpty(){
        return cardinalidad == 0;
    }
    
    /**
     * Método que devuelve el número de elementos en el conjunto
     * @return cardinalidad - int, el número de elementos en el conjunto
     */
    public int getCardinalidad(){
        return cardinalidad;
    }
    
    /**
     * Método que revisa si el conjunto contiene cierto dato.
     * @param dato - T, el dato a buscar en el conjunto
     * @return boolean <ul>
     * <li> true - si sí lo contiene.
     * <li> false - si no lo contiene.
     * </ul>
     */
    public boolean contains(T dato){
        boolean resp = false;
        Iterator <T> it = iterator();
        while(it.hasNext() && !resp){
            resp = it.next().equals(dato);
        }
        return resp;
    }
    
    /**
     * Método que agreaga cierto dato al conjunto.
     * @param dato - T, el dato por agregar.
     * @return boolean <ul>
     * <li> true - si sí lo agregó.
     * <li> false - si no lo agregó.
     * </ul>
     */
    public boolean add(T dato){
        boolean resp = false;
        if(!contains(dato)){
            resp = true;
            if(cardinalidad == conjunto.length){
                expandCapacity(conjunto.length * 2);                
            }
            conjunto[cardinalidad] = dato;
            cardinalidad++;
        }
        return resp;
    }
 
    /**
    * Método que expande a un nuevo tamaño el conjunto.
    * @param tamaño - int, es el nuevo tamaño del conjunto.
    */
    private void expandCapacity(int tamaño){
        T[] nuevo = (T[]) new Object[tamaño];
        for(int i = 0; i < cardinalidad; i++){
            nuevo[i] = conjunto[i];
        }
        conjunto = nuevo;
    }
    
    /**
     * Método que elimina cierto dato del conjunto.
     * @param dato - T, el dato por eliminar.
     * @return result - T, con el dato eliminado.
     */
    public T remove(T dato){
        T result = null;
        int i = 0;
        while(i < cardinalidad && !conjunto[i].equals(dato)){
            i++;
        }
        if(i < cardinalidad){
            result = conjunto[i];
            cardinalidad--;
            conjunto[i] = conjunto[cardinalidad];
            conjunto[cardinalidad] = null;
        }
            return result;
    }

    /**
     * Método recursivo que dice si un conjunto es igual a otro.
     * @param otro - Object, el conjunto por comparar.
     * @return boolean <ul>
     * <li> true - si sí son iguales.
     * <li> false - si no son iguales.
     * </ul>
     */
    public boolean equals(Object otro) {
        boolean resp = false;
        if(otro != null && otro instanceof ConjuntoADT){
            ConjuntoADT<T> c = (ConjuntoADT) otro;
            if(cardinalidad == c.getCardinalidad()){
                resp = equals(c.iterator());
            }
        }
        return resp;
    }
    private boolean equals(Iterator<T> it){
        if(it.hasNext()){
            if(this.contains(it.next())){
                return equals(it);
            }
            else{
                return false;
            }
        }
        else{
            return true;
        }
    }

    /**
     * Método que crea un iterador del arreglo del conjunto.
     * @return Iterator, con el iterador del arreglo del conjunto.
     */
    public Iterator<T> iterator(){
        return new IteradorArreglo(conjunto, cardinalidad);
    }
    
    /**
     * Método recursivo que devuelve una cadena con todos los elementos del conjunto.
     * @return String, con los datos que el iterador reunió.
     */
    public String toString(){
        Iterator <T> it = this.iterator();
        return toString(it);
    }    
    private String toString(Iterator<T> it){
        if(!it.hasNext()){
            return "";
        }
        else{
            return it.next() + "\n" + toString(it);
        }
    }
    
    /**
     * Método que devuelve la unión de dos conjuntos.
     * @param otro - ConjuntoADT, otro conjunto parra operar.
     * @return resul - ConjuntoADT, conjunto con la unión de dos conjuntos.
     */
    public ConjuntoADT<T> union(ConjuntoADT<T> otro){
        ConjuntoADT <T> resul = new ConjuntoA();
        if(otro != null){
            Iterator <T> it = this.iterator();
            while(it.hasNext()){
                resul.add(it.next());
            }
            it = otro.iterator();
            while(it.hasNext()){
                resul.add(it.next());
            }
        }
        return resul;
    }
    
    /**
     * Método que devuelve la intersección de dos conjuntos.
     * @param otro - ConjuntoADT, otro conjunto parra operar.
     * @return resul - ConjuntoADT, conjunto con la intersección de dos conjuntos.
     */
    public ConjuntoADT<T> intersection(ConjuntoADT<T> otro){
        ConjuntoADT <T> resul = new ConjuntoA();
        if(otro != null){
            T aux;
            Iterator <T> it = this.iterator();
            while(it.hasNext()){
                aux = it.next();
                if(otro.contains(aux)){
                    resul.add(aux);
                }
            }
        }
        return resul;
    }
    
    /**
     * Método que devuelve la diferencia de dos conjuntos.
     * @param otro - ConjuntoADT, otro conjunto parra operar.
     * @return resul - ConjuntoADT, conjunto con la diferencia de dos conjuntos.
     */
    public ConjuntoADT<T> difference(ConjuntoADT<T> otro){
        ConjuntoADT <T> resul = new ConjuntoA();
        if(otro != null){
            T aux;
            Iterator <T> it = this.iterator();
            while(it.hasNext()){
                aux = it.next();
                if(!otro.contains(aux)){
                    resul.add(aux);
                }
            }
        }
        return resul;
    } 

}
