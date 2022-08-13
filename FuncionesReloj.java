package unam.curso.reloj;

public class FuncionesReloj {

	private Reloj reloj = new Reloj();

	public void iniciaReloj(Reloj reloj) {
		this.reloj = reloj;
		int horario = 0;
		int horaInicial = this.reloj.getHora();
		int minutoInicial = this.reloj.getMinutos();
		int segundoInicial = this.reloj.getSegundos();
		int h = 0;
		boolean banderaEjecucion = true;
		if (this.reloj.isBandera24()) {
			horario = 23;
		} else {
			horario = 12;
		}
		while (banderaEjecucion) {
			for (h = horaInicial; h <= horario; h++) {
				this.reloj.setHora(h);
				for (int m = minutoInicial; m < 60; m++) {
					this.reloj.setMinutos(m);
					for (int s = segundoInicial; s < 60; s++) {
						this.reloj.setSegundos(s);

						if (!this.reloj.isBandera24() && h == 11 && m == 59 && s == 59) {
							cambiaSiglas();
						}
						System.out.println(this.reloj.toString());
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					segundoInicial = 0;
				}
				minutoInicial = 0;
			}

			if (h == 13) {
				horaInicial = 1;
			} else if (h == 24) {
				horaInicial = 0;
			}

		}

	}

	private void cambiaSiglas() {
		if (this.reloj.getSiglas().equals("a.m.")) {
			this.reloj.setSiglas("p.m.");
		} else if (this.reloj.getSiglas().equals("p.m.")) {
			this.reloj.setSiglas("a.m.");
		}
	}

}
