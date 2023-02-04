package estruturaDados1.aula6;

import java.util.List;

public class Main {
    public Arvore<Rota> rotas = new Arvore<>();

    public Elemento<Rota> addRoot() {
        Rota rota = new Rota();
        rota.setNome("root");
        rota.setTamanho(0d);

        Elemento<Rota> root = new Elemento<>(rota);
        rotas.setRoot(root);

        return root;
    }

    public Rota addRota(String nome, Double distancia) {
        Rota rota = new Rota();
        rota.setNome(nome);
        rota.setTamanho(distancia);

        return rota;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Arvore<Rota> rotas = main.rotas;

        Elemento<Rota> root = main.addRoot();

        Rota rotaA = main.addRota("A", 10d);
        Rota rotaB = main.addRota("B", 10d);
        Rota rotaC = main.addRota("C", 10d);
        Rota rotaD = main.addRota("D", 10d);
        Rota rotaE = main.addRota("E", 10d);
        Rota rotaF = main.addRota("F", 10d);

        root.addFilho(rotaA);
        root.addFilho(rotaB);

        rotas.pegarTodosFilhos().forEach((k) -> System.out.println(k.getInfo().getNome()));



        // - IMPLEMENTE UM ADIÇÃO A PARTIR DE UMA ROTA A PARTIR DA ORIGEM - ROOT

        // - IMPLEMENTE UM ADIÇÃO A PARTIR DE UMA ROTA DO NOME DA ROTA PAI - PESQUISA O NOME DA ROTA

        // - IMPLEMENTE UMA FUNCIONALIDADE QUE DADO UM DESTINO A PARTIR DA ORIGEM,
        //   MOSTRE O CAMINHO MAIS RAPIDO.
    }

}
