package unam.curso.main;

import java.util.Scanner;

import unam.curso.calculadora.Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora= new Calculadora ();//objeto de tipo calculadora
		
		
		Scanner scan = new Scanner (System.in);//para poder capturar el valor del teclado
		int opcion;//para las opciones del menu
		boolean bandera =true;//para mantener el programa en ejecucion
		do {
			System.out.println("Elije la operacion que deses realizar");
			System.out.println("1.- Suma");
			System.out.println("2.- Resta");
			System.out.println("3.- Multiplicacion");
			System.out.println("4.- Division");
			System.out.println("salir");
			System.out.println("elije una opcion");
			
			opcion = scan.nextInt();//captura la opcion 
			
			switch (opcion) {
			case 1://suma
				System.out.println("Ingresa el primer numero");
				double num1 =scan.nextDouble();
				System.out.println("Ingresa el segundo numero");
				double num2 = scan.nextDouble();
				double resultado = calculadora.suma(num1,num2);
				System.out.println("El resultado es:" +resultado);

				break;
case 2://resta
	System.out.println("Ingresa el primer numero");
	 num1 =scan.nextDouble();
	System.out.println("Ingresa el segundo numero");
	 num2 = scan.nextDouble();
	 resultado = calculadora.resta(num1,num2);
	System.out.println("El resultado es:" +resultado);

				break;
case 3:// multiplicacion
	System.out.println("Ingresa el primer numero");
	 num1 =scan.nextDouble();
	System.out.println("Ingresa el segundo numero");
	num2 = scan.nextDouble();
	 resultado = calculadora.multiplicacion(num1,num2);
	System.out.println("El resultado es:" +resultado);

	
	break;
case 4://division
	System.out.println("Ingresa el primer numero");
	 num1 =scan.nextDouble();
	System.out.println("Ingresa el segundo numero");
	 num2 = scan.nextDouble();
	 resultado = calculadora.division(num1,num2);
	System.out.println("El resultado es:" +resultado);

	
	break;
case 5://salida
	bandera = false;
	break;
	default:
	System.out.println("opcion invalida");
			}
			
			
					
			
			
		} while (bandera == true);
		
		
	}

}
