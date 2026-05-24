package estoque;
import java.util.Scanner;
public class Acessorio extends Peca {
Scanner sc=new Scanner(System.in);

int qdtVendida;

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }
    @Override
    public void venda() {
        System.out.println("Quantidade vendida:");
        qdtVendida = sc.nextInt();
        quantidade = quantidade - qdtVendida ;
    }
}
