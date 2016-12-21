package sudoku;

/**
 * Define la clase Sudoku.
 * Tiene como atributos: <ul>
 * <li> Un boolean que permite avanzar al método solve().</li>
 * <li> Un arreglo bidimensional, matriz, con los números del sudoku.</li>
 * <li> El conjunto del tipo integer de cajas o cuadros del sudoku.</li>
 * <li> El conjunto del tipo integer de renglones de la matriz.</li>
 * <li> El conjunto del tipo integer de columnas de la matriz.</li>
 * </ul>
 * @author CARLOS OCTAVIO ORDAZ BERNAL
 * @author ALFREDO LOZANO ORTEGA
 * @author GUILLERMO CARMONA OLIVERA
 */
public class Sudoku {
    
    private boolean execution; 
    public int[][] matriz;
    private ConjuntoA<Integer>[] cajas;
    private ConjuntoA<Integer>[] renglones;
    private ConjuntoA<Integer>[] columnas;
    
    /**
     * Constructor por omisión que inicializa los atributos.
     */
    public Sudoku(){
        matriz=new int[9][9];
        cajas= new ConjuntoA[9];
        renglones= new ConjuntoA[9];
        columnas= new ConjuntoA[9];
    }
  
    /**
     * Constructor que crea el sudoku y lo valida a partir del parámetro de la matriz.
     * @param mat - int[][], arreglo bidimensional con los números de la solución del sudoku.
     */
    public Sudoku(int mat[][]){
        matriz=mat;
        cajas= new ConjuntoA[9];
        renglones= new ConjuntoA[9];
        columnas= new ConjuntoA[9];
        
        for(int i=0;i<9;i++){
            cajas[i]= new ConjuntoA();
            renglones[i]= new ConjuntoA();
            columnas[i]= new ConjuntoA();
        }
            
//        vacia los valores del sudoku en los conjuntos renglon,
//        columna y cuadrante.
        try {
            int multiploi=1;
            for(int i = 0;i<9;i++){
                for(int j = 0;j<9;j++){
                    if(matriz[i][j]>0){
                        agregaS(matriz[i][j], renglones[i]);
                        agregaS(matriz[i][j], columnas[j]);
//                        cuadrantes[cuadrante(i, j)].agregaS(matriz[i][j]);
                        if(j<3)
                            agregaS(matriz[i][j], cajas[(multiploi)-1]);                           
                        if(j>2 && j<6)
                            agregaS(matriz[i][j], cajas[(multiploi)]);
                        if(j>5)
                            agregaS(matriz[i][j], cajas[(multiploi)+1]);
                        matriz[i][j]= matriz[i][j] *(-1);
                    }
            }
            if(i==2 || i==5)
                multiploi += 3;
            }    
            this.setExecution(true);
        } 
        
        catch (Exception e) {
            System.out.println(e);
            this.setExecution(false);
            //Arroja error si el valor ya pertenece a un conjunto o si no es un
        } 
    } 
    
    /**
     * Método privado que agrega al sudoku los valores validando si son mayores que cero pero menores que nueve.
     * @param dato - int, el número que se desea agregar.
     * @param c - ConjuntoA, el conjunto al cual el número se desea agregar.
     */
    private void agregaS(int dato, ConjuntoA<Integer> c){
        if(c.contains(dato) ||dato < 0 || dato > 9)
            throw new InvalidCollectionException();
        else
            c.add(dato);
    }    
         
    /**
     * Método get del boolean execution.
     * @return execution - boolean
     */
    public boolean getExecution(){
        return execution;
    }
    
    
    /**
     * Método set del boolean execution.
     * @param execution - boolean
     */
    public void setExecution(boolean execution) {
        this.execution = execution;
    }

    /**
     * Método público que resuelve el sudoku usando recursividad y backtracking.
     * @return boolean <ul>
     * <li> true - si encontró solución al sudoku.
     * <li> false - si no encontró solución al sudoku.
     * </ul>
     */
    public boolean solve(){
        if(execution){
            return solve(0,0,1);
        }
        else{
            return false;
        }        
    }
    
    /**
     * Método privado que resuelve el sudoku usando recursividad y backtracking.
     * @return boolean <ul>
     * <li> true - si encontró solución al sudoku.
     * <li> false - si no encontró solución al sudoku.
     * </ul>
     */
    private boolean solve(int i, int j, int valor) {  
        //Determina el indice correcto.
        if (j == 9) {  
            j = 0;
            i++;
            if (i == 9)  
                return true;  
        }  
        
        //Si el valor a intentar es mayor a nueve no es solución.
        if(valor>9)
            return false;
        
        //Evita modificar los valores introducidos por el usuario que fueron
        //marcados negativos en el constructor.
        if (matriz[i][j] < 0)   
            return solve(i, j+1, 1); 
        
        //Si es valido lo marca y prueba con resolver la siguiente casilla
        //de derecha a izquierda de arriba a abajo.
        if (valido(i, j, valor)) { 
            renglones[i].add(valor);
            columnas[j].add(valor);
            cajas[numCaja(i,j)].add(valor);
            matriz[i][j] = valor;
            
            //Llamado recursivo para probar si es un camino solución.
            if (solve(i, j+1, 1))  
                return true;  
            //Si no es solución lo quita.
            renglones[i].remove(valor);
            columnas[j].remove(valor);
            cajas[numCaja(i,j)].remove(valor);
        }
        
        //Llamado recursivo para probar si el siguiente valor si es la solucion.
        return solve(i,j,valor+1);
    }  
  
  /**
     * Método que devuelve si el valor en una determinada posición i,j es válido para ser agregado como solución
     * @return boolean <ul>
     * <li> true - si es válido.
     * <li> false - si no es válido.
     * </ul>
     */
    private boolean valido(int i, int j, int valor) { 
        return!renglones[i].contains(valor)
                && !columnas[j].contains(valor)
                && !cajas[numCaja(i,j)].contains(valor)
                && valor < 10;
             
    }
    
    /**
     * Método que calcula dado unas coordenadas, el número de caja o cuadrante de las coordenadas.
     * @param i - int, número de renglón.
     * @param j - int, número de columna.
     * @return sol - int, número de la caja o cuadrante de las ooordenadas i,j.
     */
    public int numCaja(int i, int j){
        int sol = 0;
        if(i<3){
            if(j<3)
                sol=0;
            if(j>2 && j<6)
                sol=1;
            if(j>5)
                sol=2;
        }
        if(i>2 && i<6){
            if(j<3)
                sol=3;
            if(j>2 && j<6)
                sol=4;
            if(j>5)
                sol=5;
        }
        
        if(i>5){
            if(j<3)
                sol=6;
            if(j>2 && j<6)
                sol=7;
            if(j>5)
                sol=8;
        }
        return sol;
    }
    
}
