package estruturaDados1.aula6;

import java.util.ArrayList;
import java.util.List;

public class Elemento<T> {

    private T info;
    private List<Elemento<T>> filhos = new ArrayList<>();

    public Elemento(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public List<Elemento<T>> getFilhos(){
        return this.filhos;
    }

    public void addFilho(T info) {
        Elemento<T> elem = new Elemento<>(info);
        this.filhos.add(elem);
    }
}

