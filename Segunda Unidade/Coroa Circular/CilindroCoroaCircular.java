public class CilindroCoroaCircular extends CoroaCircular {
    private double altura;

    public CilindroCoroaCircular(double raioMaior, double raioMenor, double altura) {
        super(raioMaior, raioMenor);
        this.altura = altura;
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaLateralExterna() {
        return super.perimetroExterno() * altura;
    }

    public double areaLateralInterna() {
        return super.perimetroInterno() * altura;
    }

    public double areaLateralTotal() {
        return areaLateralExterna() + areaLateralInterna();
    }

    public double area() {
        return (2 * super.area() + areaLateralTotal());
    }

    public double volume() {
        return super.area() * altura;
    }

    public void mostrarDados() {
        System.out.println(" RAIO MAIOR: " + getRaioMaior() + "\n" +
                           " RAIO MENOR: " + getRaioMenor() + "\n" +
                           " ALTURA: " + this.altura + "\n" +
                           " DIAMETRO: " + super.diametro() + "\n" +
                           " AREA: " + super.area() + "\n" +
                           " PERIMETRO EXTERNO: " + super.perimetroExterno() + "\n" +
                           " PERIMETRO INTERNO: " + super.perimetroInterno() + "\n" +
                           " AREA LATERAL EXTERNA: " + areaLateralExterna() + "\n" +
                           " AREA LATERAL INTERNA: " + areaLateralInterna() + "\n" +
                           " AREA LATERAL TOTAL: " + areaLateralTotal() + "\n" +
                           " AREA: " + area() + "\n" +
                           " VOLUME: " + volume());
    }
}
