public abstract class Paciente {
	private int codigo;
	private String nome;
	private double debito;

	public Paciente(int codigo, String nome, double debito) {
		this.codigo = codigo;
		this.nome = nome;
		this.debito = debito;
	}	

	public int getCodigo() { return codigo; }
	public void setCodigo(int codigo) { this.codigo = codigo; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public double getDebito() { return debito; }

	public void usarServico(double valor) {
		debito += valor;
	}

	public void pagarServico(double valor) {
		if (valor <= debito) {
			debito -= valor;
		} else {
			System.out.println("Erro! Sem saldo suficiente.");
		}
	}
	
	public void mostrarDados() {
		System.out.println(" Codigo: " + this.codigo +
						   " Nome: " + this.nome +
					       " Debito: " + this.debito);
	}
}
