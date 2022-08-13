package unam.curso.main;

import java.util.Scanner;

import unam.curso.reloj.FuncionesReloj;
import unam.curso.reloj.Reloj;

public class RepasoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();

	}

	private static void menu() {
		FuncionesReloj funcionesReloj = new FuncionesReloj();
		Reloj reloj;
		Scanner scan = new Scanner(System.in);
		boolean banderaEjecucion = true;
		while (banderaEjecucion) {
			System.out.println("Programa que ejecutara un reloj digital");
			System.out.println("Elija si se debe de ejecutar en formato de 24 horas o de 12 horas");
			System.out.println("Opciones");
			System.out.println("1.- Formato de 24 horas\n" + "2.- Formato de 12 horas\n" + "S.- Salir\n"
					+ "Intouzca su opcion y precione enter: ");
			String opcion = scan.nextLine();
			System.out.println("Intruzca la hora inicial de acuerdo al formato elegido: ");
			int hora = scan.nextInt();
			System.out.println("Intruzca el minuto inicial: ");
			int minuto = scan.nextInt();
			System.out.println("Intruzca el segundo inicial: ");
			int segundo = scan.nextInt();
			switch (opcion) {
			case "1":
				funcionesReloj.iniciaReloj(reloj = new Reloj(hora, minuto, segundo, "horas", true));
				break;
			case "2":
				funcionesReloj.iniciaReloj(reloj = new Reloj(hora, minuto, segundo,"a.m.", false));
				break;
			case "S":
			case "s":
				banderaEjecucion = false;
				break;
			default:
				System.out.println("Opcion no valida ingrese un valor permitido");
				break;
			}
		}

	}

	
}
