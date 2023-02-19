package com.br.dsena7.desafio2;

import com.br.dsena7.observer_pattern.Observer;
import com.br.dsena7.observer_pattern.Protocolo;

/*
Um observável é um objeto que notifica os observadores sobre as mudanças em seu estado.
 */
public interface ObservableCeu {

    public void notificar();

    public ObservableCeu registrar(ObserverCeu observerCeu);

    public void publicar(String msg);

    String getMsg(ObserverCeu observerCeu);
}
