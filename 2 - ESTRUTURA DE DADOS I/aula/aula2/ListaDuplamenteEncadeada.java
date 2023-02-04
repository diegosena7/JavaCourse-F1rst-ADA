package estruturaDados1.aula2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ListaDuplamenteEncadeada<T> {
    ItemListaEncadeada<T> primeiroItem;
    ItemListaEncadeada<T> ultimoItem;
    double tamanho = 0;

    public ListaDuplamenteEncadeada() {}

    @Getter
    @Setter
    public class ItemListaEncadeada<K> {
        private K dado;
        private ItemListaEncadeada<K> anterior;
        private ItemListaEncadeada<K> proximo;
    }

    public ListaDuplamenteEncadeada<T> add(T dado){
        if(primeiroItem == null){
            this.primeiroItem = new ItemListaEncadeada<>();
            primeiroItem.setDado(dado);
            ultimoItem = primeiroItem;
        } else {
            ItemListaEncadeada<T> item = new ItemListaEncadeada<>();
            item.setDado(dado);
            item.setAnterior(ultimoItem);
            ultimoItem.setProximo(item);
            ultimoItem = item;
        }

        tamanho++;

        return this;
    }

    public T get(int posicao) throws Exception {
        this.validateRulesList(posicao);

        if (posicao == 0) return primeiroItem.getDado();

        int haltByBegin = (int) Math.floor(tamanho / 2);
        int haltByEnd = (int) tamanho - haltByBegin;
        Boolean starByBegin = posicao <= haltByBegin;

        if (!starByBegin) posicao = (haltByEnd - (posicao - haltByBegin)) - 1;

        ItemListaEncadeada<T> item = starByBegin ? primeiroItem : ultimoItem;

        for (int i = 0; i < posicao; i++) {
            item = starByBegin ? item.getProximo() : item.getAnterior();
        }

        return item.getDado();
    }

    private ItemListaEncadeada<T> getItem(int posicao) throws Exception {
        this.validateRulesList(posicao);

        if (posicao == 0) return primeiroItem;

        ItemListaEncadeada<T> item = primeiroItem;

        for (int i = 0; i < posicao; i++) {
            item = item.getProximo();
        }

        return item;
    }

    public T remove(int posicao) throws Exception {
        if (posicao == 0 && tamanho > 0) {
            T dado = primeiroItem.getDado();
            primeiroItem = primeiroItem.getProximo();

            tamanho--;

            return dado;
        }

        ItemListaEncadeada<T> itemAtual = this.getItem(posicao);
        ItemListaEncadeada<T> itemAnterior = itemAtual.getAnterior();

        if (itemAtual == ultimoItem) {
            ultimoItem = itemAnterior;
            itemAnterior.setProximo(null);
        } else {
            itemAnterior.setProximo(itemAtual.getProximo());
        }

        tamanho--;

        return itemAtual.getDado();
    }

    public T validateRulesList(int posicao) throws Exception {
        if (posicao < 0) throw new Exception("Posição não pode ser negativa");
        if (posicao >= tamanho) throw new IndexOutOfBoundsException("Posição acima do tamanho da lista");

        return null;
    }

    public void printList() {
        ItemListaEncadeada<T> item = primeiroItem;
        List<T> lista = new ArrayList<>();

        System.out.println("\n");
        System.out.println("primeiroItem: " +  primeiroItem.getDado());
        System.out.println("ultimoItem: "  + ultimoItem.getDado());

        while (item.getProximo() != null) {
            lista.add(item.getDado());
            item = item.getProximo();
        }

        lista.add(item.getDado());

        System.out.println("lista: " + lista.toString());
    }

    public void printListReverse() {
        ItemListaEncadeada<T> item = ultimoItem;
        List<T> lista = new ArrayList<>();

        System.out.println("\n");
        System.out.println("primeiroItem: " +  ultimoItem.getDado());
        System.out.println("ultimoItem: " + primeiroItem.getDado());

        while (item.getAnterior() != null) {
            lista.add(item.getDado());
            item = item.getAnterior();
        }

        lista.add(item.getDado());

        System.out.println("lista: " + lista.toString());
    }

    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista
            .add("Ana")
            .add("André")
            .add("Caio")
            .add("Fábio")
            .add("Pedro")
            .add("Thiago")
            .add("Wilson");

        lista.printList();

        System.out.println("\ngetIem: " + lista.get(2));
    }
}
