package estoque;
import java.util.Scanner;
public class RoupaPMG implements Item {
    String descricao;
    int quantidadeP;
    int quantidadeM;
    int quantidadeG;
    int estoqueMinimo;
    int estoqueMaximo;
    String tamanhoPeca;
    Scanner sc=new Scanner(System.in);

    public RoupaPMG(String descricao, int quantidadeP,int quantidadeM, int quantidadeG, int estoqueMinimo,int estoqueMaximo) {
        this.descricao=descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }
    @Override
    public void reposicaoEstoque() {
        if(this.quantidadeP<this.estoqueMinimo){
            this.quantidadeP=this.estoqueMaximo;
        }
        if(this.quantidadeM<this.estoqueMinimo){
            this.quantidadeM=this.estoqueMaximo;
        }
        if(this.quantidadeG<this.estoqueMinimo){
            this.quantidadeG=this.estoqueMaximo;
        }
    }

    @Override
    public void venda() {
        System.out.println("Digite o tamanho do peca(P, M ou G): ");
        this.tamanhoPeca=sc.nextLine();

        if (this.tamanhoPeca.equals("P") || this.tamanhoPeca.equals("p" )) {
            quantidadeP--;
        } else if (this.tamanhoPeca.equals("M")  || this.tamanhoPeca.equals("m")) {
            quantidadeM--;
        } else if (this.tamanhoPeca.equals("G") || this.tamanhoPeca.equals("g")) {
            quantidadeG--;
        } else {
            System.out.println("ERRO: o que digitou não corresponde a um tamanho");
        }

        }
    @Override
    public String getDescricao(){
        return this.descricao;
    }
    @Override
    public void exibirEstoque() {
        System.out.println("---Estoque do produto: " + this.descricao + " ---");
        System.out.println("Quantidade P: " + this.quantidadeP);
        System.out.println("Quantidade M: " + this.quantidadeM);
        System.out.println("Quantidade G: " + this.quantidadeG);
    }
}
