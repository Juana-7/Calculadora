
package calculador;

public class Operaciones {
  
    public int suma(int nume1, int nume2){
return nume1 + nume2;
}
    
    public int resta(int nume1, int nume2){
return nume1 - nume2;
}
    
    public int multiplicacion(int nume1, int nume2){
return nume1 * nume2;
}
    
    public int division(int nume1, int nume2){
return nume1/nume2;
}
    
    public int exponente(int nume1, int nume2){
return (int) Math.pow(nume1, nume2);
}
    
}
