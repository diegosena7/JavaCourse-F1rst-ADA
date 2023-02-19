package com.br.dsena7.desafio1;

import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Animal implements Comparable<Animal> {

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

    public static void main(String[] args) {
        Animal cachorro = new Animal(1.5, 4, 3.5, "Ração", "Patas", "Mamífero");
        Animal gato = new Animal(0.8, 4, 1.2, "Ração", "Patas", "Mamífero");
        Animal papagaio = new Animal(0.5, 2, 0.8, "Alpiste", "Asas", "Ovípero");
        Animal cacatua = new Animal(1.7, 2, 1.5, "Alpiste", "Asas", "Ovípero");
        Animal girafa = new Animal(5.3, 2, 30.0, "Alpiste", "Asas", "Herbívoro");
        Animal zebra = new Animal(2.3, 4, 20.0, "Alpiste", "Asas", "Herbívoro");

        List<Animal> animais = new ArrayList<>(List.of(cachorro, gato, zebra, girafa, papagaio, cacatua));

        List<Animal> exercicio1 = animais.stream()
                .filter(animal -> animal.getReproducao() == "Herbívoro")
                .filter(animal -> animal.getPesoAnimal() > 20.0)
                .collect(Collectors.toList());
        System.out.println("Exercício 1");
        System.out.println(exercicio1);
        System.out.println();

        System.out.println("Exercício 2");
        List<Animal> exercicio2 = animais.stream()
                .filter(animal -> animal.getReproducao() == "Ovípero")
                .collect(Collectors.toList());
        System.out.println(exercicio2);
        System.out.println();

        System.out.println("Exercício 3");
        Optional<Double> exercicio3 = animais.stream()
                .map(animal -> animal.getAlturaAnimal())
                .max(Comparator.naturalOrder());
        System.out.println("Maior peso: " + exercicio3);
    }
}


