package Calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InicializacionTest {
	
	Inicializacion start;
	    
	@Before
	public void setUp() {
		start = new Inicializacion();
	}
	
	@Test
	public void Resultado() {
		// Arrange
		String obtener = "Suma";
		int[] valor = {3,5};
		
		
		// Act
		int resultado = start.Operacion(obtener, valor);
		
		// Assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void Resultado2() {
		// Arrange
		String obtener = "Resta";
		int[] valor = {5,3};
		
		// Act
		int resultado = start.Operacion(obtener, valor);
		
		// Assert
		assertEquals(2, resultado);
	}
	
	@Test
	public void Resultado3() {
		// Arrange
		String obtener = "Multi";
		int[] valor = {4,5};
		
		// Act
		int resultado = start.Operacion(obtener, valor);
		
		// Assert
		assertEquals(20, resultado);
	}
	
	@Test
	public void Resultado4() {
		// Arrange
		String obtener = "Poten";
		int[] valor = {2, 3};
		
		// Act
		int resultado = start.Operacion(obtener, valor);
		
		// Assert
		assertEquals(8, resultado);
	}
	
	@Test
	public void Resultado5() {
		// Arrange
		String obtener = "Fact";
		int[] valor = {3};
		
		// Act
		int resultado = start.Operacion(obtener, valor);
		
		// Assert
		assertEquals(6, resultado);
	}	
}
