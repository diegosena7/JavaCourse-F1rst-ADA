package estruturaDados1.aula5;

import estruturaDados1.aula3.Aluno;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Map {

    public static void main(String[] args) {

        //LinkedHashMap<>() -> garante a ordem de inserção em um map
        //HashMap<>() -> não armazena na ordem e não garante a ordem de inserção
        //TreeMap<>() -> ordena em ordem alfabética, podemos fazer uma comparação através do comparator
        Comparator<Aluno> comparacao = Comparator.comparing(Aluno::getMatricula).reversed();
        //Map<Aluno, String> mapa = new TreeMap<>(comparacao);

        //Map<String, Map<String, String>> agendaDeContatos = new HashMap();
        //agendaDeContatos.put("Camila", new HashMap<String, String>());
        //Map<String, String> mapaAgenda = agendaDeContatos.get("Camila");
        //mapaAgenda.put("email", "cml@gmail.com");
        //mapaAgenda.put("email_secundario", "pedro@gmail.com");

//		mapa.put(new Aluno("Camila", "1") ,"camila@gmail.com");
//		mapa.put(new Aluno("Pedro", "2"), "pedro@gmail.com");
//		mapa.put(new Aluno("João", "3"),"joao@gmail.com");
//		mapa.put(new Aluno("Roberto", "4"),"roberto@gmail.com");

        //System.out.println(agendaDeContatos);
    }

}
