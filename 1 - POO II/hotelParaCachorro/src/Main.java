import Dogs.RacaCachorro;
import interfaces.Cachorro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RacaCachorro> hotel = new ArrayList<>();

        RacaCachorro bulldog = new RacaCachorro("Robson", "Bulldog", "Alto");
        RacaCachorro pug = new RacaCachorro("Miguel", "Pug", "Baixo");
        RacaCachorro viraLata = new RacaCachorro("Tom", "ViraLata", "Médio");

        hotel.add(bulldog);
        hotel.add(pug);
        hotel.add(viraLata);

        System.out.println("\n>>> Antes da ordenação.");
        hotel.forEach(cachorro -> System.out.println(cachorro.toString()));

        Collections.sort(hotel);

        System.out.println("\n>>> Depois da ordenação.");
        hotel.forEach(cachorro -> System.out.println(cachorro.toString()));
    }
}