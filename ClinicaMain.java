package unam.curso.clinica;

import unam.curso.persona.Persona;
import unam.curso.persona.Empleado;
import unam.curso.utilerias.Fecha;
import unam.curso.utilerias.RFC;

public class ClinicaMain {
public static void main(String[]args) {
	Fecha fecha = new Fecha(5,8,1992);
	long noTelefono = 55169483;
	Persona persona = new Persona("Guadalupe", "Flores ", "Palma", "Femenino", fecha, noTelefono);
	System.out.println(persona);
	
	RFC rfc= new RFC ("FLOPG","9285", "HIL");
	Empleado empleado = new Empleado(persona,rfc,"Palacio de Hierro","Administradora");
	System.out.println(empleado);
}
}
