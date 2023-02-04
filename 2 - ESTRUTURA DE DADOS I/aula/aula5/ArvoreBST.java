package estruturaDados1.aula5;

public class ArvoreBST {
    private Elemento root;

    private void inserir(Elemento elemento, Integer info) {
        if (root == null) {
            root = new Elemento(info);
        } else {
            if (info > elemento.getInfo()) {
                if (elemento.getDireita() == null) {
                    elemento.setDireita(new Elemento(info));
                } else {
                    inserir(elemento.getDireita(), info);
                }
            } else if (info < elemento.getInfo()) {
                if (elemento.getEsquerda() == null) {
                    elemento.setEsquerda(new Elemento(info));
                } else {
                    inserir(elemento.getEsquerda(), info);
                }
            }
        }
    }

    public void inserir(Integer info) {
        inserir(root, info);
    }

    private Elemento buscarElemento(Elemento elemento, Integer info) {
        if (root == null) throw new RuntimeException("Arvore Vazia");

        if (elemento.getInfo() == info) return elemento;

        if (info > elemento.getInfo()) {
            if (elemento.getDireita() == null) throw new RuntimeException("Elemento não encontrado");

            return buscarElemento(elemento.getDireita(), info);
        }

        if (elemento.getEsquerda() == null) throw new RuntimeException("Elemento não encontrado");

        return buscarElemento(elemento.getEsquerda(), info);
    }

    public Elemento buscarElemento(Integer info) {
        return buscarElemento(root, info);
    }

    public Integer menorValor() {
        if (root == null) throw new RuntimeException("Arvore Vazia");

        Elemento elemento = root;

        while (elemento.getEsquerda() != null) {
            elemento = elemento.getEsquerda();
        }

        return elemento.getInfo();
    }


    public Integer maiorValor() {
        if (root == null) throw new RuntimeException("Arvore Vazia");

        Elemento elemento = root;

        while (elemento.getDireita() != null) {
            elemento = elemento.getDireita();
        }

        return elemento.getInfo();
    }
}