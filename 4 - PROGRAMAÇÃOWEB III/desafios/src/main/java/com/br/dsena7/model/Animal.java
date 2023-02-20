package com.br.dsena7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Animal implements Comparable<Animal> {

    private String nome;
    private Double alturaAnimal;
    private Integer qtdPatas;
    private Double pesoAnimal;
    private String alimento;
    private String locomocao;
    private String reproducao;

    @Override
    public int compareTo(Animal o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", alturaAnimal=" + alturaAnimal +
                ", qtdPatas=" + qtdPatas +
                ", pesoAnimal=" + pesoAnimal +
                ", alimento='" + alimento + '\'' +
                ", locomocao='" + locomocao + '\'' +
                ", reproducao='" + reproducao + '\'' +
                '}';
    }
}
