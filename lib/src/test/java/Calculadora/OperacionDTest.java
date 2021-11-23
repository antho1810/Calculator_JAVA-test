package Calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OperacionDTest {
	
	OperacionD deriva;
	
	@Before
	public void setUp() {
		deriva = new OperacionD();
	}
	
	
	@Test
	public void Resultado() {
		// Arrage
		int a = 4;
		int b = 5;
		
		// Act
		int resultado = deriva.Multi(a, b);
		
		// Assert
		assertEquals(20, resultado);
	}
	
	@Test
	public void Resultado2() {
		// Arrage
		int a = 2;
		int b = 3;
		
		// Act
		int resultado = deriva.Poten(a, b);
		
		// Assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void Resultado3() {
		// Arrage
		int a = 3;
	
		// Act
		int resultado = deriva.Facto(a);
		
		// Assert
		assertEquals(6, resultado);
	}
	

}
