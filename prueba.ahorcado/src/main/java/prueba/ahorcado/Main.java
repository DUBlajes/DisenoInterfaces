package prueba.ahorcado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String palabraAAcertar="perro";
	 boolean palabraAcertada=false;
	 byte intentos=(byte)6;
	 System.out.println("Bienvenido al juego del ahorcado. Te quedan "+intentos+ " intentos para adivinar la palabra.");
	 byte longitudPalabra=(byte)palabraAAcertar.length();
	 char[] palabraGuiones=new char[longitudPalabra];
	 for (int i = 0; i < palabraGuiones.length; i++) {
		palabraGuiones[i]='_';
	}
	 System.out.println(palabraGuiones);
	 
	 do {
		System.out.println("Elige una letra");
		String eleccion=sc.nextLine();
		char letraElegida=eleccion.charAt(0);
		for (int i = 0; i < palabraAAcertar.length(); i++) {
			if (palabraAAcertar.charAt(i)==letraElegida) {
				System.out.println("La letra está en la palabra.");
				break;
			}else {
				intentos--;
				System.out.println("La letra elegida no está en la palabra. Te quedan "+intentos+" intentos para adivinar la palabra.");
			}
		}
		if(intentos==0) {
			 System.out.println("No has conseguido adivinar la palabra. La palabra era "+palabraAAcertar+".");
			 sc.close();
			 break;
		 }
		 

	} while (palabraAcertada==false||intentos!=0);
	 
	 
	 
	 
	 
	 
	 
	}

}
