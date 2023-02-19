package com.br.dsena7.observer_pattern;

public class ObserverImpl implements Observer{

    private Protocolo protocolo;
    private String nome;

    public ObserverImpl(Protocolo protocolo, String nome) {
        this.protocolo = protocolo;
        this.nome = nome;
        this.protocolo.registrar(this);
    }

    @Override
    public void atualizar() {
        String msg = protocolo.getMsg(this);
        if(msg == null) System.out.println("[MSG] Não há mensagens");

        else System.out.println("[" + this.nome + "] OK: [MSG] :" + msg);
    }

    @Override
    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }
}
