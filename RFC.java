package unam.curso.utilerias;

public class RFC {
	private String iniciales;
	private String fecha;
	private String homoclave;
	private final char[] ALFABETO = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private final char[] NUMEROS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	private final char[] ESPECIALES = { '*', '/', '-', '+', '_', '?', '¿', '!', '¡', '.', ',', ';', '@' };

	public RFC(String iniciales, String fecha, String homoclave) {
		// TODO Auto-generated constructor stub
		this.iniciales = iniciales;
		this.fecha = fecha;
		this.homoclave = homoclave;
	}

	public RFC() {
		// TODO Auto-generated constructor stub
	}

	public boolean validaRFCCapturado(String rfcCapturado) {
		if (rfcCapturado.length() == 13) {
			if (noEspeciales(rfcCapturado)) {
				this.iniciales = rfcCapturado.substring(0, 4);
				this.fecha = rfcCapturado.substring(4, 10);
				this.homoclave = rfcCapturado.substring(10);
				if (validaRFC()) {
					return true;
				} else {
					System.out.println("El RFC no cumple con el formato requerido");
					return false;
				}
			} else {
				System.out.println("El RFC no debe contener caracteres especiales");
				return false;
			}
		} else {
			System.out.println("La longitud del RFC debe de ser igual a 13");
			return false;
		}
	}

	private boolean noEspeciales(String rfc) {
		char[] rfcArray = rfc.toCharArray();

		for (int i = 0; i < rfcArray.length; i++) {
			for (int j = 0; j < this.ESPECIALES.length; j++) {
				if (rfcArray[i] == this.ESPECIALES[j]) {
					System.out.println("El RFC contiene el caracter: " + rfcArray[i]);
					return false;
				}
			}
		}

		return true;
	}

	public boolean validaRFC() {
		if (validaIniciales() && validafecha()) {
			return true;
		} else {
			System.out.println("RFC no valido");
			return false;
		}
	}

	public boolean validaIniciales() {
		if (carracteresCorrectos(this.ALFABETO, this.iniciales)) {
			return true;
		} else {
			System.out.println("Las Iniciales no cumplen con el formato");
			return false;
		}

	}

	public boolean validafecha() {
		if (carracteresCorrectos(this.NUMEROS, this.fecha)) {
			Fecha fecha = parsearFecha(this.fecha);
			if (fecha.validarFecha()) {
				return true;
			} else {
				System.out.println("La fecha en el RFC no es correcta al no cumplir con el formato de fecha valida");
				return false;
			}
		} else {
			System.out.println("La fecha en el RFC no es correcta al contener caracteres no validos");
			return false;
		}
	}

	private Fecha parsearFecha(String fecha) {
		
		int anioNum = 0;
		int mesNum = 0;
		int diaNum = 0;
		String anioTex = fecha.substring(0, 2);
		String mesTex = fecha.substring(2, 4);
		String diaTex = fecha.substring(4, 6);
		try {
			anioNum = Integer.parseInt(anioTex);
			mesNum = Integer.parseInt(mesTex);
			diaNum = Integer.parseInt(diaTex);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se pudo parsear la fecha introducida");
		}

		Fecha fechaActual = new Fecha();
		Fecha.obtenerFechaActual();
		if (anioNum >= 0 && anioNum < (fechaActual.getAnio() - 2000)) {
			anioNum = anioNum + 2000;
		} else {
			anioNum = anioNum + 1900;
		}

		return new Fecha(diaNum, mesNum, anioNum);
	}

	private boolean carracteresCorrectos(char[] array, String texto) {
		boolean correcto = false;
		char[] textoArray = texto.toCharArray();

		for (int i = 0; i < textoArray.length; i++) {

			for (int j = 0; j < array.length; j++) {
				correcto = false;
				if (textoArray[i] == array[j]) {
					correcto = true;
					break;
				}
			}
			if (correcto == false) {
				System.out.println("Caracter no valido en el RFC");
				return correcto;
			}
		}
		return correcto;
	}

	public String getIniciales() {
		return iniciales;
	}

	public void setIniciales(String iniciales) {
		this.iniciales = iniciales;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHomoclave() {
		return homoclave;
	}

	public void setHomoclave(String homoclave) {
		this.homoclave = homoclave;
	}

	@Override
	public String toString() {
		return iniciales + fecha + homoclave;
	}

}
