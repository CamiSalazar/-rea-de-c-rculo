import java.util.Scanner;

public class funciones2 {

	private static Scanner sc;
	public static void main(String[] args) {
		//Devolver �rea de circulo dado su radio
	
	System.out.println("ingrese el radio");
	sc = new Scanner (System.in);
	double r = 0;
	r = sc.nextDouble();
	double A = Area (r);
	if (A == -1){
		System.out.println("El valor de radio ingresado es inv�lido");
		}
	else{
		System.out.println("El �rea del c�rculo de radio " + r + " es " + A);
	}
	}
		
	public static double Area (double r){
		
		double A;
		if (r > 0){
			
	 A = Math.PI * r * r;
		}
		else{
			A = -1;
		}
	return (A);
}
	}


