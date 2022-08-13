package unam.curso.clinica;

import java.util.ArrayList;
import java.util.Scanner;

import unam.curso.persona.Alumno;
import unam.curso.persona.Empleado;
import unam.curso.persona.Persona;
import unam.curso.utilerias.Fecha;
import unam.curso.utilerias.RFC;

public class RegistroPaciente {
	private ArrayList<Persona> visitantes = new ArrayList<>();
	private ArrayList<Alumno> alumnos = new ArrayList<>();
	private ArrayList<Empleado> empleados = new ArrayList<>();
	private Persona persona;
	private Alumno alumno;
	private Empleado empleado;
	
	
	public RegistroPaciente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void verRegistros() {

		for (Alumno alumno : this.alumnos) {
			System.out.println(alumno);
		}
		for (Empleado empleado : this.empleados) {
			System.out.println(empleado);
		}
		for (Persona persona : this.visitantes) {
			System.out.println(persona);
		}
		
	}
	
	public void iniciarRegistro() {
		boolean bandera = true;
		Scanner scan = new Scanner(System.in);
		String opcion;
		while (bandera) {
			System.out.println("Inicar el registro de un nuevo paciente para consulta medica");
			System.out.println("Que tipo de paciente desea registrar:");
			System.out.println("1.- Alumno");
			System.out.println("2.- Empleado");
			System.out.println("3.- Visitante");
			System.out.println("4.- Salir");
			System.out.println("Introduce la opcion deseada");
			opcion = scan.nextLine();
			switch (opcion) {
			case "1":
				this.alumno = registrarAlumno();
				System.out.println(this.alumno);
				this.alumnos.add(this.alumno);
				break;
			case "2":
				this.empleado = registrarEmpleado();
				System.out.println(this.empleado);
				this.empleados.add(this.empleado);
				break;
			case "3":
				this.persona = registrarPersona();
				System.out.println("Visitante registrado correctamente");
				System.out.println(this.persona);
				this.visitantes.add(this.persona);
				break;
			case "4":
				bandera = false;
				break;
			default:
				System.out.println("Opcion no valida, intentar nuevamente");
				break;
			}
		}
	}
	
	private Persona registrarPersona() {
		
		return new Persona();
	}
	
	private Empleado registrarEmpleado() {
		
		return new Empleado();
	}
	
	private Alumno registrarAlumno() {
		 
		return new Alumno();
	}
	
	private long capturarNumeros() {
		
		return 0;
	}
	
	private Fecha capturarFechas() {
		
		return new Fecha();
	}
	
	private String capturarTextos(String dato) {
		
		return "";
		
	}
	
	private RFC capturarRFC() {
		
		return new RFC();
	}

}
