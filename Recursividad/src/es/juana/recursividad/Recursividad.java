package es.juana.recursividad;

public class Recursividad {
	
	public static void main(String[] args) {
		
		int factorial=factorial(5);
		System.out.println(factorial);
		
	}
	
	public static int factorial(int num) {
		
		if (num==1) {return 1;}
		return num*factorial(num-1);
		
	}
	
}
