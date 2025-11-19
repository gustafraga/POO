public class Piramide extends Quadrado {
    private double altura;

    public Piramide() {
        super();
        this.altura = 0;
    }

    public Piramide(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() { return altura; }
    public void  setAltura(double altura) {
        this.altura = altura;
    }

    public double perimetro() {
        return 0;
    }

    public double alturaLado() {
        return Math.sqrt((Math.pow((getLado()/2), 2) + Math.pow(this.altura, 2)));
    }

    public double areaLateral() {
        return 4 * (getLado() * alturaLado()) / 2;
    }

    public double area() {
        return super.area() + areaLateral();
    }

    public double volume() {
       return super.area() * this.altura / 3;
    }

    public void mostrarDados() {
        System.out.println(" LADO: " + getLado() + "\n" +
                           " ALTURA: " + this.altura + 
                           " AREA BASE: " + super.area() + "\n" +
                           " PERIMETRO BASE: " + super.perimetro() +
                           " ALTURA LADO: " + alturaLado() +
                           " AREA LATERAL: " + areaLateral() +
                           " AREA: " + area() + 
                           " VOLUME: " + volume());
    }
}
