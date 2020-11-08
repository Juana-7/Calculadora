
package calculador;

public class Calculadora {
    public static void main(String [] args){
        Operaciones calculadora1 = new Operaciones();
        System.out.println("El resultado de la primer suma es " + calculadora1.suma(6, 4));
        System.out.println("El resultado de la segunda suma es " + calculadora1.suma(3, 2));
        
        System.out.println("El resultado de la primer resta es " + calculadora1.resta(6, 3));
        System.out.println("El resultado de la segunda resta es " + calculadora1.resta(8, 3));
        
        System.out.println("El resultado de la primer multiplicacion es " + calculadora1.multiplicacion(2, 4));
        System.out.println("El resultado de la segunda multiplicacion es " + calculadora1.multiplicacion(5, 2));
        
        System.out.println("El resultado de la primer division es " + calculadora1.division(12, 2));
        System.out.println("El resultado de la segunda division es " + calculadora1.division(24, 2));
        
        System.out.println("El resultado del primer exponente es " + calculadora1.exponente(4, 2));
        System.out.println("El resultado del segundo exponente es " + calculadora1.exponente(2, 2));
        
        
    }
}
