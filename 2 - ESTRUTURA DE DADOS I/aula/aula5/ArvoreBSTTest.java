package estruturaDados1.aula5;

public class ArvoreBSTTest {
    public static void main(String[] args) {
        ArvoreBST arvoreBST = new ArvoreBST();

        arvoreBST.inserir(40);
        arvoreBST.inserir(60);
        arvoreBST.inserir(20);
        arvoreBST.inserir(70);
        arvoreBST.inserir(50);
        arvoreBST.inserir(10);
        arvoreBST.inserir(15);
        arvoreBST.inserir(5);
        arvoreBST.inserir(22);
        arvoreBST.inserir(93);
        arvoreBST.inserir(30);
        arvoreBST.inserir(3);

        System.out.println("buscarElemento: " + arvoreBST.buscarElemento(30).getInfo());
        System.out.println("menorValor: " + arvoreBST.menorValor());
        System.out.println("maiorValor: " + arvoreBST.maiorValor());
    }
}