public class PrismaTriangular extends Triangulo{
    private double altura;

    public PrismaTriangular(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaLateral() {
        return super.perimetro() * this.altura;
    }

    public double area() {
        return (2 * super.area()) + areaLateral();
    }

    public double perimetro() {
        return 0;
    }

    public double volume() {
        return super.area() * this.altura;
    }

    public void mostrarDados() {
        System.out.println(" LADO " + getLado() + "\n" +
                           " ALTURA " + this.altura + "\n" +
                           " PERIMETRO " + super.perimetro() + "\n" +
                           " AREA BASE: " + super.area() + "\n" +
                           " AREA LATERAL: " + areaLateral() + "\n" +
                           " AREA: " + area() + "\n" +
                           " VOLUME: " + volume());
    }
}
