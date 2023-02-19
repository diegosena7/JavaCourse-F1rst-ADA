package com.br.dsena7.desafio2;

public class ObserversTestMain {

    public static void main(String[] args) {

        ObservableCeu observableCeu = new ObservableCeuImpl();

        ObserverCeu observer1 = new ObserverCeuImpl(observableCeu, "O eclipse lunar iniciou");

        observableCeu.publicar("OBS-CEU");
    }
}
