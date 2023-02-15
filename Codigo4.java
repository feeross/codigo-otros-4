/*
 * Vi que faltaban cerrar algunas llaves ami como importar algunas librerias
 * algo me fallo en la comparación por lo que siempre me arroja que gana el jugador 2
 *
 * */
package com.generation;

import java.util.Scanner; //faltaba importar util scanner

public class Codigo4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //faltaba System.in
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
		
		System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //tenia 1 en vez de dos
	    Scanner s2 = new Scanner(System.in);//faltaba system.in
	    String j2 = s2.nextLine(); //se tiene que hacer refencia al jugador 2
	    
	    if (j1 == j2) { //sobraba un parentesis
	        System.out.println("Empate");
	      } else {
	    	  int g=1;
		        switch(j1) {
		          case "piedra":
		            if (j2 == "tijeras") {
		              g = 1;
		              break;
		            }

		          case "papel":
		            if (j2 == "piedra") {
		              g = 2;
		              break;
		              }
		            
		          case "tijera":
		            if (j2.equals("papel")) {
		              g = 1;
		              break;
		            }
		          default:
		        
		         
		        } //llave del switch
		        System.out.println("Gana el jugador " + g);
	      }//faltaba cerrar la llave del else
	        
	s.close();//faltaba cerrar el scanner
	s2.close();
	}//parentesis del static void
}//parentesis de class
