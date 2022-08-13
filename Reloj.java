package unam.curso.reloj;

public class Reloj {
	private int hora = 0;
	private int minutos = 0;
	private int segundos = 0;
	private String siglas = "";
	private boolean bandera24 = true;
	public Reloj() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reloj(int hora, int minutos, int segundos, String siglas, boolean bandera24) {
		super();
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
		this.siglas = siglas;
		this.bandera24 = bandera24;
	}

	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public String getSiglas() {
		return siglas;
	}
	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	public boolean isBandera24() {
		return bandera24;
	}

	public void setBandera24(boolean bandera24) {
		this.bandera24 = bandera24;
	}

	
	@Override
	public String toString() {
		return padeo(hora) + ":" + padeo(minutos) + ":" + padeo(segundos) + " " + siglas;
	}
	
	private String padeo(int numero) {
		String numeroString = Integer.toString(numero);
		if (numeroString.length() == 1) {
			numeroString = "0" + numeroString;
		}
		return numeroString;
	}
	

}
