package com.br.dsena7.observer_pattern;

public interface Protocolo {

    public Protocolo registrar(Observer observer);

    public Protocolo esquecer(Observer observer);

    public void notificar();

    public String getMsg(Observer observer);

    public void publicar(String msg);
}
