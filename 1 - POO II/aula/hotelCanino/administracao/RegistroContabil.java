package programacaoOrientadaObjetos2.hotelCanino.administracao;

import programacaoOrientadaObjetos2.hotelCanino.Cachorro;

import java.util.ArrayList;
import java.util.List;

public record RegistroContabil (Cachorro cachorro, Double valorFinal){

    public static List<RegistroContabil> livroContabil = new ArrayList<>();

    public static void addRegistroContabil(Cachorro cachorro, Double valorFinal){
        livroContabil.add(new RegistroContabil(cachorro, valorFinal));
    }
}