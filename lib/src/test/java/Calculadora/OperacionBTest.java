package Calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OperacionBTest {
	OperacionB base;
	
	@Before
	public void setUp() {
		base = new OperacionB();
	}	
	
	@Test
	public void Resultado() {
		// Arrage
		int a = 3;
		int b = 5;
		
		// Act
		int resultado = base.Suma(a, b);
		
		// Assert
		assertEquals(8, resultado);
	}

	@Test
	public void Resultado2() {
		// Arrage
		int a = 5;
		int b = 3;
		
		// Act
		int resultado = base.Resta(a, b);
		
		// Assert
		assertEquals(2, resultado);
	}
}
