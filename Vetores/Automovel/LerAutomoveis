import java.util.Scanner;

public class LerAutomoveis {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        float somaLitros=0;
        float melhorConsumo=0;
        String melhorAutomovel="";
        int numero=0;

        System.out.print("Digite a quantidade de automoveis: ");
        Automoveis automoveis[] = new Automoveis[sc.nextInt()];

        for (int i=0; i<automoveis.length; i++) {
            automoveis[i] = new Automoveis[];
            System.out.print("Digite o codigo do automovel: ");
            automoveis[i].codigo = sc.nextInt();
            System.out.print("Digite a descricao do automovel: ");
            automoveis[i].descricao = sc.nextLine();
            System.out.print("Digite a capacidade do tanque: ");
            automoveis[i].capacidadeLitros = sc.nextFloat();
            System.out.print("Digite quantos litros foram abastecidos: ");
            automoveis[i].litrosAbastecidos = sc.nextFloat();
            System.out.print("Digite quantos KM rodados: ");
            automoveis[i].kilometragemRodada = sc.nextFloat();
            somaLitros += automoveis[i].litrosAbastecidos;
            if (melhorConsumo < automoveis[i].Consumo()) {
                melhorConsumo = automoveis[i].Consumo();
                melhorAutomovel = automoveis[i].descricao;
                numero = i+1;
            }
        }

        for (int i=0; i<automoveis.length; i++) {
            System.out.println("Item: " + (i+1));
            System.out.println("Codigo: " + automoveis[i].codigo);
            System.out.println("Descricao: " + automoveis[i].descricao);
            System.out.println("Litros Abastecidos: " + automoveis[i].litrosAbastecidos);
            System.out.println("Kilometragem Rodada: " + automoveis[i].kilometragemRodada);
            System.out.println("Consumo: " + automoveis[i].Consumo());
            System.out.println("Classificacao: " + automoveis[i].Classificacao());
            System.out.println("Total de litros abastecidos: " + somaLitros);
            System.out.println("O melhor consumo foi "+melhorConsumo+" do automovel 0"+numero+" - "+melhorAutomovel);
        }
    }
}
