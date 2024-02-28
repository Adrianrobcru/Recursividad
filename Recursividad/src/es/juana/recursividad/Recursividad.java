package es.juana.recursividad;

public class Recursividad {
	
	public static void main(String[] args) {
		int num= 111;
		
		System.out.println(esCreciente(0234));
		
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
	public static void rectangulo() {
		
		
		
	}
	
	public static boolean ordenarAlfabeticamente(String palabra) {
		
		
		
		int l1=palabra.charAt(0);
		int l2=palabra.charAt(1);
			
		
		
		
		
	}
		
	
	
	public static boolean palindromo(String palabra) {
		
	}
	
	public static String aBinario(int n) {
		String binario="";
		
		if(n>0) {
		
			return aBinario(n/2)+n%2;
			
		}
		return binario;
	}
	
	public static boolean esBin(int n) {
		if(n>0){
			return n%10==1 || n%10==1 && esBin(n/10);
			
		}
		return n%10==0 || n%10==1;
	}
	
	public static boolean esCreciente(int n) {
		
		if(n<9) {
			return true;
		}else {
			return n%10>n/10%10&& esCreciente(n/10);
		}
		
	}
	public static boolean esDecreciente(int n) {
		
		if(n>9){
			return n%10<n/10%10 && esCreciente(n/10);
		}
		return true;
	}
	
	
}

