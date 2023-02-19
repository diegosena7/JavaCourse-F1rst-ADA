package com.br.dsena7.desafio2;

public class ObserverCeuImpl implements ObserverCeu{

    private ObservableCeu obs;
    private String nome;

    public ObserverCeuImpl(ObservableCeu obs, String nome) {
        this.obs = obs;
        this.nome = nome;
        this.obs.registrar(this);
    }

    @Override
    public void atualizar() {
        String msg = obs.getMsg(this);
        if(msg == null) System.out.println("[MSG] Não há mensagens");

        else System.out.println(msg + ": " + this.nome);
    }
}
