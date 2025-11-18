public class Movimento {
	public static void main(String[] args) throws Exception {
		PacienteParticular p1 = new PacienteParticular(1, "Joao", 0, 10);
		PacienteConvenio p2 = new PacienteConvenio(2, "Maria", 0, "Facape", 500);

		p1.mostrarDados();
		p2.mostrarDados();

		p1.usarServico(100);
		p2.usarServico(200);

		p1.usarServico(200);
		p2.usarServico(301);

		p1.pagarServico(300);
		p2.pagarServico(150);

		p1.mostrarDados();
		p2.mostrarDados();
	}
}
