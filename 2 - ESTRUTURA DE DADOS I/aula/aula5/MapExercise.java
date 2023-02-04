/*
EXERCICIO
- LISTA DE ALUNOS COM DADOS DE CONTATO

O nome dos alunos deve estar ordenado, porém os contatos devem respeitar a ordem de inserção (considerando que o primeiro inserido é o contato preferencial)

Por exemplo:

Guilherme > { email: guilherem@gmail.com, celular: 11 99999-9999, telefone: 11 1234-5678 }
Alessandra > { celular: 11 99999-5555, telefone: 11 1234-5555, email: alessandra@gmail.com }
Pedro > { discord: Pedro Bomfim da Costa#9588, celular: 11 99999-7087 }

O resultado impresso deve ser

Alessandra > { celular: 11 99999-5555, telefone: 11 1234-5555, email: alessandra@gmail.com }
Guilherme > { email: guilherme@gmail.com, celular: 11 99999-9999, telefone: 11 1234-5678 }
Pedro > { discord: Pedro Bomfim da Costa#9588, celular: 11 99999-7087 }
*/

package estruturaDados1.aula5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExercise {
    public TreeMap<String, HashMap<String, String>> contacts = new TreeMap<>();

    public void setContact(String name, String key, String value) {
        HashMap<String, String> contact = contacts.get(name);

        if (contact == null) {
            contacts.put(name, new LinkedHashMap<>());
            contact = contacts.get(name);
        }

        contact.put(key, value);
    }


    public static void main(String[] args) throws Exception {
        MapExercise map = new MapExercise();

        map.setContact("Guilherme", "email", "guilherem@gmail.com");
        map.setContact("Guilherme", "celular", "11 99999-9999");
        map.setContact("Guilherme", "telefone", "11 1234-5678");

        map.setContact("Alessandra", "celular", "11 99999-5555");
        map.setContact("Alessandra","telefone", "11 1234-5555");
        map.setContact("Alessandra","email", "alessandra@gmail.com");

        map.setContact("Pedro", "discord", "Pedro Bomfim da Costa#9588");
        map.setContact("Pedro", "celular", "11 99999-7087");

        map.contacts.forEach((i, k) -> System.out.println(i + " > " + k));
    }
}