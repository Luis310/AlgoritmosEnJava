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
            
        
        java.util.Scanner x= new java.util.Scanner(System.in);
        System.out.println("Ingrese el limite inferior");
        limInferior = x.nextInt();
        System.out.println("Ingrese el limite superior");
        limSuperior = x.nextInt();
        System.out.println(" ");
        for (int i =limInferior+1; i <limSuperior; i++) {
            System.out.println(i);
        }         
	      
	   }
	
	}