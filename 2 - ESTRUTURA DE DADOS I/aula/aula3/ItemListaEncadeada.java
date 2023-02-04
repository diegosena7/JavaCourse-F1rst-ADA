package estruturaDados1.aula3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemListaEncadeada<T> {
    private T dado;
    private ItemListaEncadeada<T> proximo;
}