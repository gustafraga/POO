public class PiramideTriangular extends Triangulo {
    private double altura;
    private double apotema;

    public PiramideTriangular(double lado, double altura, double apotema) {
        super(lado);
        this.altura = altura;
        this.apotema = apotema;
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getApotema() { return apotema; }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double areaLateral() {
        return (super.perimetro() / 2) * apotema;
    }

    public double area() {
        return super.area() + areaLateral();
    }

    public double perimetro() {
        return 0;
    }

    public double volume() {
        return (1/3) * super.area() * altura;
    }

    public void mostrarDados() {
        System.out.println(" LADO " + getLado() +
                " ALTURA: " + this.altura +
                " APOTEMA: " + this.apotema +
                " PERIMETRO: " + super.perimetro() +
                " AREA BASE: " + super.area() +
                " AREA LATERAL: " + areaLateral() +
                " AREA: " + area() +
                " VOLUME: " + volume());
    }
}
