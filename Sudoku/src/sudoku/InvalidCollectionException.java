
package sudoku;

/**
 * Define la clase InvalidCollectionException que hereda de Runtime Exception.
 * @author CARLOS OCTAVIO ORDAZ BERNAL
 * @author ALFREDO LOZANO ORTEGA
 * @author GUILLERMO CARMONA OLIVERA
 */
public class InvalidCollectionException extends RuntimeException{
    
    
    public InvalidCollectionException(){
        super("Error: Sudoku inválido.");
    }
    
    public InvalidCollectionException(String message){
        super(message);
    }
}
