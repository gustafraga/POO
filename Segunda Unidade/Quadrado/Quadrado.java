public abstract class Quadrado {
    private double lado;

    public Quadrado() {
        this.lado = 0;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() { return lado; }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return Math.pow(this.lado, 2);
    }

    public double perimetro() {
        return 4 * this.lado;
    }

    public void mostrarDados() {
        System.out.println(" LADO: " + this.lado +
                           " AREA: " + area() +
                           " PERIMETRO: " + perimetro());
    }
}
