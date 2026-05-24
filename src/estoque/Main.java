package estoque;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        Item[] listaItens = new Item[5];

        RoupaPMG camisa = new RoupaPMG("Camisa", 5, 10, 5,2,20);
        RoupaPMG saia = new RoupaPMG("Saia",5, 10, 5,2,20);
        Acessorio pulseira = new Acessorio("Pulseira", 10, 3, 20);
        Acessorio cinto = new Acessorio("Cinto", 10, 3, 20);
        RoupaTamanhoUnico saida = new RoupaTamanhoUnico("Saida de Praia", 10, 3, 20);

        listaItens [0] = camisa;
        listaItens [1] = saia;
        listaItens [2] = pulseira;
        listaItens [3] = cinto;
        listaItens [4] = saida;
        do{
            try {
                System.out.println("--- MENU DE ESTOQUE ---");
                for (int i = 0; i < listaItens.length; i++) {
                    System.out.println(i + 1 + "- " + listaItens[i].getDescricao());
                }
                System.out.println("6 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                switch (opcao - 1) {
                    case 0:
                        camisa.venda();
                        camisa.reposicaoEstoque();
                        camisa.exibirEstoque();
                        break;
                    case 1:
                        saia.venda();
                        saia.reposicaoEstoque();
                        saia.exibirEstoque();
                        break;
                    case 2:
                        pulseira.venda();
                        pulseira.reposicaoEstoque();
                        pulseira.exibirEstoque();
                        break;
                    case 3:
                        cinto.venda();
                        cinto.reposicaoEstoque();
                        cinto.exibirEstoque();
                        break;
                    case 4:
                        saida.venda();
                        saida.reposicaoEstoque();
                        saida.exibirEstoque();
                        break;
                    case 5:
                        System.out.println("Encerrando o programa...");

                        System.out.println("--- RELATORIO DE ESTOQUE ---");
                        for (int i = 0; i < listaItens.length; i++) {
                            listaItens[i].exibirEstoque();
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            }catch (Exception e) {
                System.out.println("ERRO: Por favor, digite apenas um número inteiro válido!");
                sc.nextLine();
                opcao = 0;
            }
        }
        while(opcao != 6);

    }
}
