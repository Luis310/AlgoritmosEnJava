/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
   		
		java.util.Scanner x= new java.util.Scanner(System.in);
		System.out.println("Ingrese un numero mayor a cero");
        valorActual = x.nextInt();
        System.out.println(" ");        
        for (int i =0; i <valorActual; i++) {
            System.out.println("El valor actual es: "+ i);
        }         
   }

}