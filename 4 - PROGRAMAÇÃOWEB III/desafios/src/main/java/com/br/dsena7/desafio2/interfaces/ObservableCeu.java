package com.br.dsena7.desafio2.interfaces;

/*
Um observável é um objeto que notifica os observadores sobre as mudanças em seu estado.
 */
public interface ObservableCeu {

    public void notificar();

    public ObservableCeu registrar(ObserverCeu observerCeu);

    public void publicar(String msg);

    String getMsg(ObserverCeu observerCeu);
}
