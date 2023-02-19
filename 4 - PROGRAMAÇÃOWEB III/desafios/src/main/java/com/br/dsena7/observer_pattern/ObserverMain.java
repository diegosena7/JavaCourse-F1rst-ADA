package com.br.dsena7.observer_pattern;

public class ObserverMain {

    public static void main(String[] args) {
        Protocolo protocolo = new ProtocoloImpl();
        Observer observer1 = new ObserverImpl(protocolo, "Diego");
        Observer observer2 = new ObserverImpl(protocolo, "Nayara");
        Observer observer3 = new ObserverImpl(protocolo, "Ryan");

        protocolo.publicar("Observer ok");
    }
}
