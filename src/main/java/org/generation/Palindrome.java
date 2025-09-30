package org.generation;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	
	public boolean isPalindrome (String text) {
		/*
		//1. Cambiar entrada a minusculas para poder comparar
		String cambio = text.toLowerCase();
		// 2. Declarar un String vacio para poder guardar los caracteres que recorreremos del string original text
		String emptyString = "";
		// 3. Recorrer el String original de acuerdo a su longitud y guardar en el emptyString el valor de cada caracter. 
		for (int i = 0; i < text.length(); i++) {
			if (emptyString.charAt(i) == 0) {
				emptyString.toUpperCase().charAt(0);
			}
			else { 
				emptyString = i + emptyString;
			}
			
			
		}
		
		// Preguntar si empetyString es igual a text
		if(emptyString == text) { 
			return true;
		}
		else { 
			return false;
		}
		*/
		/* Opción Completa pero complicada no la termino de entender 
		text = text.toLowerCase().replaceAll("[^a-záéíóúüñ]", "");

		
		String invertido = "";
		for (int i = text.length() - 1; i >= 0; i--) {
		    invertido += text.charAt(i);
		}
		return text.equals(invertido);
		*/
		
		/**
		 * Using StringBuilder
		 * Es una clase especial de java que hace mas facil trabajar con cadenas de texto para 
		 * cambiarlas (Por ejemplo voltear la palabra)
		 */
		// 1. Normalizar el texto: Quitar mayúsculas y reemplazar acéntos, espacios y especiales.
		String normalized = text.toLowerCase().replaceAll("[^a-záéíóúüñ]", "");
		
		// 2. Invertir la cadena con una nueva variable y la clase StringBuilder
		String reverserd = new StringBuilder(normalized).reverse().toString();
		
		// 3. Compararemos la variable normalized con la de reversa para evitar 
		// las mayúsculas. 
		if (normalized.equals(reverserd)) { 
			System.out.println(text + " Es un palíndromo: " + reverserd);
			System.out.println("========================================");
			return true;
		}
		else { 
			System.out.println(text + " No es un palindromo: " + reverserd);
			System.out.println("========================================");
			return false;
		}
		
	}

}
