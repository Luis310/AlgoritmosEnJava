/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   
	
	   public static void main(String[] args) {
	   		    int numero;
                int resultado=1;
            
        
        java.util.Scanner x= new java.util.Scanner(System.in);
        System.out.println("Ingrese un numero mayor a cero");
        numero = x.nextInt();
        System.out.println(" ");
        
        for (int i = 1; i <= numero; i++) {
           resultado*=i;
            System.out.print("x"+i);
       }
        System.out.print("="+resultado);
	      
	   }
	
	}