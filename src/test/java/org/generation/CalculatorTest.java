package org.generation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



@DisplayName("Pruebas unitarias de la clase Calculator")
public class CalculatorTest {
	
	
	@Test
	@DisplayName("Sumatoria de números positivos")
	void addTest() { 
		Calculator cal = new Calculator ();
		assertEquals(5, cal.add(3, 2), "Suma 3 y 2 debe ser 5");
		assertEquals(100, cal.add(30, 70), "Suma 30 y 70 debe ser 100");
		assertEquals(1_000_000, cal.add(500_000, 500_000), "Suma 500k y 500k debe ser 1M");
	}
	
	//Probar Método resta
	
	@Test
	@DisplayName("Resta de 2 números")
	void subsTest() { 
		Calculator cal = new Calculator(); 
		assertEquals(20, cal.substraction(50, 30), "La resta de 50 y 30 debe ser 20");
		assertEquals(417.74, cal.substraction(934.11, 516.37), "La resta de 934.11  y 516.37 debe ser 417.74");
	}
	
	
	//Probar Método de división. 
	/*
	@Test
	@DisplayName("División de 2 números")
	void divisionTest() { 
		Calculator cal = new Calculator(); 
		assertEquals(5, cal.division(100, 20), "La división de 100 y 20 debe ser 5");
		assertEquals(13.542600896860986, cal.division(453, 33.45), "La divisón de 453  y 33.45 debe ser 13.54");
	}
*/
}




















