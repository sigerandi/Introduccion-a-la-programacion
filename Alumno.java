package unam.curso.persona;

public class Alumno {
	private Persona persona;
	private String noCuenta;
	private String plantel;
	private String carrera;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(Persona persona, String noCuenta, String plantel, String carrera) {
		super();
		this.persona = persona;
		this.noCuenta = noCuenta;
		this.plantel = plantel;
		this.carrera = carrera;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getNoCuenta() {
		return noCuenta;
	}

	public void setNoCuenta(String noCuenta) {
		this.noCuenta = noCuenta;
	}

	public String getPlantel() {
		return plantel;
	}

	public void setPlantel(String plantel) {
		this.plantel = plantel;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public String toString() {
		return persona + "\nNumero de cuenta: " + noCuenta
				+"\nPlantel: " + plantel +"\nCarrera: " + carrera;
	}

}
