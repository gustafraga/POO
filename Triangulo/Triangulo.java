public abstract class Triangulo {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double getLado() { return lado; }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double altura() {
        return this.lado * Math.sqrt(3) / 2;
    }

    public double area() {
        return this.lado * altura() / 2;
    }

    public double perimetro() {
        return 3 * this.lado;
    }

    public void mostrarDados() {
        System.out.println(" LADO: " + this.lado +
                           " ALTURA: " + altura() +
                           " AREA: " + area() +
                           " PERIMETRO " + perimetro());
    }
}
