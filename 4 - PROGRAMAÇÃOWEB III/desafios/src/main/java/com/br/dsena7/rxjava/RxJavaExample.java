package com.br.dsena7.rxjava;

import com.br.dsena7.model.*;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;

public class RxJavaExample {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Cachorro", 1.5, 4, 3.5, "Ração", "Patas", "Mamífero");
        Gato gato = new Gato("Gato", 0.8, 4, 1.2, "Ração", "Patas", "Mamífero");
        Papagaio papagaio = new Papagaio("Papagaio", 0.5, 2, 0.8, "Alpiste", "Asas", "Ovípero");
        Cacatua cacatua = new Cacatua("Cacatua", 1.7, 2, 1.5, "Alpiste", "Asas", "Ovípero");
        Girafa girafa = new Girafa("Girafa", 5.3, 2, 30.0, "Alpiste", "Asas", "Herbívoro");
        Zebra zebra = new Zebra("Zebra", 2.3, 4, 20.0, "Alpiste", "Asas", "Herbívoro");

        List<Animal> animais = new ArrayList<>(List.of(cachorro, gato, zebra, girafa, papagaio, cacatua));

        System.out.println("Animais que pesam mais que 2KG");
        Observable.fromStream(animais.stream()).filter(animal -> animal.getPesoAnimal() > 2).subscribe(System.out::println);

        System.out.println("-----------------------------------");

        System.out.println("Animais que possuem mais que 2 metros de altura");
        Observable.fromStream(animais.stream()).filter(animal -> animal.getAlturaAnimal() < 2).subscribe(System.out::println);

        System.out.println("-----------------------------------");

        System.out.println("Animais ovíperos");
        Observable.fromStream(animais.stream()).filter(animal -> animal.getReproducao() == "Ovípero").subscribe(System.out::println);

    }
}
