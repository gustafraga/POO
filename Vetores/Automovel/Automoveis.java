class Automoveis {
    int codigo;
    String descricao;
    float capacidadeLitros;
    float litrosAbastecidos;
    float kilometragemRodada;

    public float Consumo() {
        return (this.kilometragemRodada / this.litrosAbastecidos);
    }

    public String Classificacao() {
        String classificacao = "";
        if (Consumo() < 10.0) {
            classificacao = "Ruim";
        } else if (Consumo() >= 10.0 && Consumo() < 13.0) {
            classificacao = "Normal";
        } else if (Consumo() > 13.0) {
            classificacao = "Otimo";
        }
        return classificacao;
    }
    public void MostrarDados() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Capacidade de Tanque: " + this.capacidadeLitros);
        System.out.println("Litros Abastecidos: " + this.litrosAbastecidos);
        System.out.println("Kilometragem Rodada: " + this.kilometragemRodada);
        System.out.println("Consumo: " + this.Consumo());
        System.out.println("Classificacao: " + this.Classificacao());
    }
}
