package Dogs;

import interfaces.Cachorro;

public class RacaCachorro implements Cachorro, Comparable<RacaCachorro> {
    private String nome;
    private String raca;

    private String volumeDoLatido;

    public RacaCachorro(String nome, String raca, String volumeDoLatido) {
        super();
        this.nome = nome;
        this.raca = raca;
        this.volumeDoLatido = volumeDoLatido;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getRaca() {
        return this.raca;
    }

    @Override
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String latir() {
        return this.volumeDoLatido;
    }

    @Override
    public int compareTo(RacaCachorro o) {
        return o.getNome().compareTo(this.getNome());
    }

    @Override
    public String toString() {
        return "RacaCachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", volumeDoLatido='" + volumeDoLatido + '\'' +
                '}';
    }
}
