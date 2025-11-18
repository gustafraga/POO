public class PacienteParticular extends Paciente {
	private double desconto;

	public PacienteParticular(int codigo, String nome, double debito, double desconto) {
		super(codigo, nome, debito);
		this.desconto = desconto;
	}

	public double getDesconto() { return desconto; }
	public void setDesconto(double desconto) { this.desconto = desconto; }

	public void usarServico(double valor) {
		double valorDesconto = (valor * ( 1 - desconto / 100 ));
		super.usarServico(valorDesconto);
	}

	public void mostrarDados() {
		System.out.println(" Codigo: " + getCodigo() +
						   " Nome: " + getNome() +
					       " Debito: " + getDebito() +
						   " Desconto: " + this.desconto);
	}
}
