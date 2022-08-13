package unam.curso.persona;

import unam.curso.utilerias.RFC;

public class Empleado {
	private Persona persona;
	private RFC rfc;
	private String dependencia;
	private String cargo;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(Persona persona, RFC rfc, String dependencia, String cargo) {
		super();
		this.persona = persona;
		this.rfc = rfc;
		this.dependencia = dependencia;
		this.cargo = cargo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public RFC getRfc() {
		return rfc;
	}

	public void setRfc(RFC rfc) {
		this.rfc = rfc;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return persona + "\nRFC: " + rfc 
				+ "\nDependencia: " + dependencia + "\nCargo: " + cargo;
	}


}
