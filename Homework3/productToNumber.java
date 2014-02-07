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
                int respuesta=1;
            
        
        numero= Integer.parseInt(args[0].toString());
        System.out.println(" ");
        
        for (int i = 1; i <= numero; i++) {
          if(numero>i){
            System.out.print(i+"x");
           }else{
           System.out.print(i+"=");
           }
           respuesta*=i;
       }
        System.out.print(respuesta);
	      
	   }
	
	}