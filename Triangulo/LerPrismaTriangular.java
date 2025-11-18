import java.util.Scanner;

public class LerPrismaTriangular {
    public static void main(String[] args) {
        PrismaTriangular pt = new PrismaTriangular(2, 2);
        Scanner sc = new Scanner(System.in);

        while(pt.getLado() != 0) {
            pt.mostrarDados();

            System.out.println(" Digite o lado (0 para sair): ");
            pt.setLado(sc.nextDouble());

            System.out.println(" Digite a altura (0 para sair): ");
            pt.setAltura(sc.nextDouble());
        }
        sc.close();
    }
}
