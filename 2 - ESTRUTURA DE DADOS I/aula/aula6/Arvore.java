package estruturaDados1.aula6;

import java.util.List;

public class Arvore<T> {

    private Elemento<T> root;

	/*private void inserir(Elemento<T> elemento,T info) {



		if (root == null) {
			root = new Elemento<T>(info);
		} else {

			if (info > elemento.getInfo()) {
				// adicionar na direita
				if (elemento.getDireita() == null) {
					elemento.setDireita(new Elemento<T>(info));
				} else {
					inserir(elemento.getDireita(), info);
				}
			} else if (info < elemento.getInfo()) {
				// adicionar na esquerda
				if (elemento.getEsquerda() == null) {
					elemento.setEsquerda(new Elemento<T>(info));
				} else {
					inserir(elemento.getEsquerda(), info);
				}
			}

		}
	}*/

    public Elemento<T> getRoot() {
        return root;
    }

    public void setRoot(Elemento<T> root) {
        this.root = root;
    }

    public void inserir(T info) {
        root.addFilho(info);
        //inserir(root, info);
    }

    public void inserir(Elemento<T> elementoPai, T info) {
        elementoPai.addFilho(info);
        //inserir(root, info);
    }

    public List<Elemento<T>> pegarTodosFilhos(){
        return root.getFilhos();
    }

    public List<Elemento<T>> pegarTodosFilhos(Elemento<T> elementoPai){
        return elementoPai.getFilhos();
    }

	/*private Elemento<T> buscarElemento(Elemento<T> elemento, T info) {

		if (root == null) {
			throw new RuntimeException("Arvore Vazia");
		}

		if (elemento.getInfo() == info) {
			return elemento;
		}

		if (info > elemento.getInfo()) {
			// adicionar na direita
			if (elemento.getDireita() == null) {
				throw new RuntimeException("Elemento não encontrado");
			} else {
				return buscarElemento(elemento.getDireita(), info);
			}
		} else {
			// adicionar na esquerda
			if (elemento.getEsquerda() == null) {
				throw new RuntimeException("Elemento não encontrado");
			} else {
				return buscarElemento(elemento.getEsquerda(), info);
			}
		}
	}

	public Elemento<T> buscarElemento(T info) {
		return buscarElemento(root, info);
	}

	public T menorValor() {
		if (root == null) {
			throw new RuntimeException("Arvore Vazia");
		}
		Elemento<T> elemento = root;
		while (elemento.getEsquerda() != null) {
			elemento = elemento.getEsquerda();
		}
		return elemento.getInfo();
	}

	public T maiorValor() {
		if (root == null) {
			throw new RuntimeException("Arvore Vazia");
		}
		Elemento<T> elemento = root;
		while (elemento.getDireita() != null) {
			elemento = elemento.getDireita();
		}
		return elemento.getInfo();
	}*/

}
