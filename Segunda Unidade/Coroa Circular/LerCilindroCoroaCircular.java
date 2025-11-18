import java.util.Scanner;

public class LerCilindroCoroaCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CilindroCoroaCircular cc = new CilindroCoroaCircular(2, 2, 2);

        System.out.print("Digite o raio maior (0 para sair): ");
        cc.setRaioMaior(sc.nextDouble());

        while(cc.getRaioMaior() != 0) {
            System.out.print("Digite o raio menor: ");
            cc.setRaioMenor(sc.nextDouble());

            System.out.print("Digite a altura: ");
            cc.setAltura(sc.nextDouble());

            cc.mostrarDados();

            System.out.print("Digite o raio maior (0 para sair): ");
            cc.setRaioMaior(sc.nextDouble());
        }
        sc.close();
    }
}
