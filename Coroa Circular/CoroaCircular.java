import java.sql.SQLOutput;

public abstract class CoroaCircular {
    private double raioMaior;
    private double raioMenor;

    public CoroaCircular(double raioMaior, double raioMenor) {
        this.raioMaior = raioMaior;
        this.raioMenor = raioMenor;
    }

    public double getRaioMaior() { return raioMaior; }
    public void setRaioMaior(double raioMaior) {
        this.raioMaior = raioMaior;
    }

    public double getRaioMenor() { return raioMenor; }
    public void setRaioMenor(double raioMenor) {
        this.raioMenor = raioMenor;
    }

    public double diametro() {
        return (2 * (raioMaior - raioMenor));
    }

    public double area() {
        return (Math.PI * (Math.pow(raioMaior, 2) - Math.pow(raioMenor, 2)));
    }

    public double perimetroExterno() {
        return (2 * Math.PI * raioMaior);
    }

    public double perimetroInterno() {
        return (2 * Math.PI * raioMenor);
    }

    public void mostrarDados() {
        System.out.println(" RAIO MAIOR: " + this.raioMaior +
                           " RAIO MENOR: " + this.raioMenor +
                           " DIAMETRO: " + diametro() +
                           " AREA: " + area() +
                           " PERIMETRO EXTERNO: " + perimetroExterno() +
                           " PERIMETRO INTERNO: " + perimetroInterno());
    }
}
