package com.br.dsena7.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class ProtocoloImpl implements Protocolo{

    private List<Observer> observerList;
    private String msg;

    private Boolean mudou;

    public ProtocoloImpl() {
        this.observerList =  new ArrayList<>();
    }

    @Override
    public Protocolo registrar(Observer observer) {
        if(observer ==  null) throw new RuntimeException();
        this.observerList.add(observer);
        return this;
    }

    @Override
    public Protocolo esquecer(Observer observer) {
        this.observerList.remove(observer);
        return this;
    }

    @Override
    public void notificar() {
        if(!mudou) return;
        this.observerList.stream()
                .forEach(obs -> obs.atualizar());
        this.mudou = false;
    }

    @Override
    public String getMsg(Observer observer) {
        return this.msg;
    }

    @Override
    public void publicar(String msg) {
        this.msg = msg;
        this.mudou = true;
        this.notificar();
    }
}
