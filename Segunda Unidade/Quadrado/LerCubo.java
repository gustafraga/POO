import java.util.Scanner;

public class LerCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado (0 para sair): ");
        Cubo cubo = new Cubo(sc.nextDouble());

        while(cubo.getLado() != 0) {
            cubo.mostrarDados();

            System.out.print("Digite o lado (0 para sair): ");
            cubo.setLado(sc.nextDouble());
        }
        sc.close();
    }
}
