public class Cubo extends Quadrado {

    public Cubo() {
        super();
    }

    public Cubo(double lado) {
        super(lado);
    }

    public double perimetro() {
        return 0;
    }

    public double area() {
        return (6 * super.area());
    }

    public double volume() {
        return (super.area() * getLado());
    }

    public void mostrarDados() {
        System.out.println(" LADO: " + getLado() + "\n" +
                           " AREA: " + area() + "\n" +
                           " VOLUME: " + volume());
    }
}
