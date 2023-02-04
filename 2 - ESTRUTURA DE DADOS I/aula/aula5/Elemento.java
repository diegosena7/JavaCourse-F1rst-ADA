package estruturaDados1.aula5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Elemento {
    private Integer info;
    private Elemento esquerda;
    private Elemento direita;

    public Elemento(Integer info) {
        this.info = info;
    }
}