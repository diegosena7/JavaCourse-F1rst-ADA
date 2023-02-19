package com.br.dsena7.desafio2;

import com.br.dsena7.desafio2.impl.ObservableCeuImpl;
import com.br.dsena7.desafio2.impl.ObserverCeuImpl;
import com.br.dsena7.desafio2.interfaces.ObservableCeu;
import com.br.dsena7.desafio2.interfaces.ObserverCeu;

public class ObserversTestMain {

    public static void main(String[] args) {

        ObservableCeu observableCeu = new ObservableCeuImpl();

        ObserverCeu observer1 = new ObserverCeuImpl(observableCeu, "O eclipse lunar iniciou");

        observableCeu.publicar("OBS-CEU");
    }
}
