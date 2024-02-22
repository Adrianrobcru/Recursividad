package es.juana.recursividad;

public class Recursividad {
	
	public static void main(String[] args) {
		
		invertido(12345);
		
	}
	
	public static int factorial(int num) {
		
		if (num==1) {return 1;}
		return num*factorial(num-1);
		
	}
	public static void Imprimirhastan(int n) {
		
		if(n>1) {
		Imprimirhastan(n-1);
		
		}
		System.out.println(n);
		
	}
	public static void imprimirDesde(int n) {
		
		System.out.println(n);
		
	if(n>1) {
		
		imprimirDesde(n-1);
		
	}
		
		
		
	}
	
	public static int numeroDigitos(int n) {
		int Digitos=0;
		
		if (n>0) {
			Digitos =1+numeroDigitos(n/10);
		}
		
		return Digitos;
		
	}
	
	public static int fibonacci(int n) {
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
		
	}
	
	public static int potencia(int base,int exponente) {
		if(exponente==0) {return 1;}
		
		return base*potencia(base, exponente-1);
		
	}
	public static void invertido(double n) {
		System.out.print((int)n%10);
		if((int) n>=10) {
			invertido(n/10);
		}
		
	}
	
}

