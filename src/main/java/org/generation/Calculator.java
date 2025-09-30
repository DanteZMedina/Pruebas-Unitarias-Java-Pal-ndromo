package org.generation;

public class Calculator {
	
	public int add(int a, int b) { 
		return a + b;
	}
	/*
	 * SobreCarga Overloading
	 * Para evitar la pérdida de precisión se recomienda la clase BigDecimal
	 */
	public double add(double a, double b) { 
		return a + b;
	}
	
	// Método que haga la resta de 2 números
	
	public double substraction(double a, double b) { 
		return a - b;
	}
	
	// Método que realice la división de 2 números
	// throw lanza la parte ilegal para ver quien detendra esa parte
	public int division(int a, int b) { 
		if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero");
		return a / b;
	}
	
}
