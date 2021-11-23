package Calculadora;



public class Inicializacion {
	public int Operacion(String obtener, int[] valor) {
		OperacionB base = new OperacionB();
		OperacionD derivada = new OperacionD();
		
		
		int a = valor[0];
		int b = valor[1];
		
		if(obtener == "Suma") {
			base.Suma(a,b);
		}
		if(obtener == "Resta") {
			base.Resta(a,b);
		}
		if(obtener == "Multi") {
			derivada.Multi(a,b);
		}
		if(obtener == "Poten") {
			derivada.Poten(a,b);
		}
		if(obtener == "Fact") {
			derivada.Facto(a);
		}
		return 0;
	}

}
