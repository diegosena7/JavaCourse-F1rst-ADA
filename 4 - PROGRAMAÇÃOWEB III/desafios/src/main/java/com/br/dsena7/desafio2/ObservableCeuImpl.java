package com.br.dsena7.desafio2;

import java.util.ArrayList;
import java.util.List;

public class ObservableCeuImpl implements ObservableCeu{

    private List<ObserverCeu> observerList;
    private String msg;
    private Boolean mudou;

    public ObservableCeuImpl() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void notificar() {
        if(!mudou) return;
        this.observerList.stream()
                .forEach(obs -> obs.atualizar());
        this.mudou = false;
    }

    @Override
    public ObservableCeu registrar(ObserverCeu observerCeu) {
        if(observerCeu ==  null) throw new RuntimeException();
        this.observerList.add(observerCeu);
        return this;
    }

    @Override
    public void publicar(String msg) {
        this.msg = msg;
        this.mudou = true;
        this.notificar();
    }

    @Override
    public String getMsg(ObserverCeu observerCeu) {
        return this.msg;
    }
}
