import java.util.Scanner;

public class funciones2 {

	private static Scanner sc;
	public static void main(String[] args) {
		//Devolver área de circulo dado su radio
	
	System.out.println("ingrese el radio");
	sc = new Scanner (System.in);
	double r = 0;
	r = sc.nextDouble();
	double A = Area (r);
	if (A == -1){
		System.out.println("El valor de radio ingresado es inválido");
		}
	else{
		System.out.println("El área del círculo de radio " + r + " es " + A);
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


