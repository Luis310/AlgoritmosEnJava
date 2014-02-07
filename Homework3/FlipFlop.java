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
			int contador;
			
numeroActual = Integer.parseInt(args[0].toString());


        System.out.println(" ");
        for (contador = 0; contador <= numeroActual; contador++) {
            if (contador%5==0 & contador%3==0) {
                System.out.print("FlipFlop");
            }else if (contador%3==0) {
                System.out.print("Flip");
            }else if (contador%5==0) {
                System.out.print("Flop");
            }else{
                System.out.print(contador);
            }

	   		
	   }
	
	}
	}