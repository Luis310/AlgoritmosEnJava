/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   
	
	   public static void main(String[] args) {
	           int limInferior;
               int limSuperior;

        limInferior = Integer.parseInt(args[0].toString());    
        limSuperior = Integer.parseInt(args[1].toString());
        
        System.out.println(" ");
        for (int i =limInferior+1; i <limSuperior; i++) {
            System.out.println(i);
        }         
	      
	   }
	
	}