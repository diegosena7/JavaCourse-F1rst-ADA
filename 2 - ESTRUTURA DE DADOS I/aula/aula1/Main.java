package estruturaDados1.aula1;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Nome 1");
        nomes.add("Nome 2");
        nomes.add("Nome 3");
        nomes.add("Nome 3");
        nomes.add("Nome 3");

        // System.out.println(nomes.get(2));
        // System.out.println(nomes.get(0));
        // System.out.println(nomes.get(1));

        nomes.remove(1);

        System.out.println(nomes);

        Set<String> set = new HashSet<String>();

        Set<String> set2 = new HashSet<String>();

        set.add("Teste 0");
        set.add("Teste 1");
        set.add("Teste 2");
        set.add("Teste 1");

        // System.out.println(set);

        set2.addAll(nomes);

        System.out.println("Set 2");
        System.out.println(set2);

        set.remove("Teste 0");

        // System.out.println(set.size());
    }
}

