/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

	public class FlipFlop {   
	
	   public static void main(String[] args) {
	   		int numeroActual = 0;
			
			java.util.Scanner x= new java.util.Scanner(System.in);
        System.out.println("Ingrese un numero mayor a cero");
        numeroActual = x.nextInt();
        System.out.println(" ");
        for (int i = 0; i <= numeroActual; i++) {
            if (i%5==0 & i%3==0) {
                System.out.print("FlipFlop");
            }else if (i%3==0) {
                System.out.print("Flip");
            }else if (i%5==0) {
                System.out.print("Flop");
            }else{
                System.out.print(i);
            }

	   		
	   }
	
	}
	}