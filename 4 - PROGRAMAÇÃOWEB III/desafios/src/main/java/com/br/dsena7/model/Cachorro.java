package com.br.dsena7.model;

public class Cachorro extends Animal{

    public Cachorro(String nome, Double alturaAnimal, Integer qtdPatas, Double pesoAnimal, String alimento, String locomocao, String reproducao) {
        super(nome, alturaAnimal, qtdPatas, pesoAnimal, alimento, locomocao, reproducao);
    }

    @Override
    public String toString() {
        return "Cachorro{}";
    }
}
