package programacaoOrientadaObjetos2.hotelCanino;

import programacaoOrientadaObjetos2.hotelCanino.administracao.Hospede;

public abstract class Cachorro extends Hospede implements Comparable<Cachorro> {
    public abstract String latir();
    public abstract String getNome();
}
