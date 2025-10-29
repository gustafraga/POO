public class PacienteConvenio extends Paciente {
	private String convenio;
	private double limite;

	public PacienteConvenio(int codigo, String nome, double debito, String convenio, double limite) {
		super(codigo, nome, debito);
		this.convenio = convenio;
		this.limite = limite;
	}

	public boolean checarLimite(double valor) {
		return valor+getDebito() <= limite;
	}

	public void usarServico(double valor) {
		if (checarLimite(valor)) {
			super.usarServico(valor);
		} else {
			System.out.println("Erro! Sem Limite.");
		}
	}

	public void mostrarDados() {
		System.out.println(" Codigo: " + getCodigo() +
						   " Nome: " + getNome() +
					       " Debito: " + getDebito() +
						   " Convenio: " + this.convenio +
						   " Limite: " + this.limite);
	}
}
