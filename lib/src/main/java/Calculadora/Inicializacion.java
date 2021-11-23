package Calculadora;


public class Inicializacion {
	public int Operacion(String obtener, int[] valor) {
		OperacionB base = new OperacionB();
		OperacionD derivada = new OperacionD();
		
		
		int a = valor[0];
		int b = valor[1];
		
		if(obtener == "Suma") {
			 return base.Suma(a,b);
		}
		if(obtener == "Resta") {
			return base.Resta(a,b);
		}
		if(obtener == "Multi") {
			return derivada.Multi(a,b);
		}
		if(obtener == "Poten") {
			return derivada.Poten(a,b);
		}
		if(obtener == "Fact") {
			return derivada.Facto(a);
		}
		return 0;
	}

}
