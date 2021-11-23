package Calculadora;

public class OperacionD {
	public int Multi(int a, int b) {
		return a * b;
	}

	public int Poten(int a, int b) {
		int resultado = 1;
		for (int i = 0; i < b; i++) {
			resultado = resultado * a;
		}
		return resultado;
	}

	public int Facto(int a) {
		int admi = 1;
		for(int i = 1; i <= a; i++) {
			admi = admi * i;
		}
		return admi;
	}
}