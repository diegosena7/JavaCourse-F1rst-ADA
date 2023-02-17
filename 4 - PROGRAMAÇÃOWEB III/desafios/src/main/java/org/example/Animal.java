package org.example;

import lombok.*;

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
}
