import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arraylist = new ArrayList<>();

        int aux = 100000;

        long tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < aux; i++) {
            arraylist.add(i);
        }

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo para inserir no arraylist: " + (tempoFinal - tempoInicial) + " ms");

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < arraylist.size(); i++) {
            arraylist.contains(i);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo para buscar no arraylist: " + (tempoFinal - tempoInicial) + " ms");

        Set<Integer> hashset = new HashSet<>();

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < aux; i++) {
            hashset.add(i);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo para inserir no hashset: " + (tempoFinal - tempoInicial) + " ms");

        tempoInicial = System.currentTimeMillis();

        for (Integer elemento:hashset) {
            hashset.contains(elemento);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo para buscar no hashset: " + (tempoFinal - tempoInicial)+ " ms");

        Map<Integer,Integer> mapa = new HashMap<>();

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < aux; i++) {
            mapa.put(i,i);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo para inserir no hashmap: " + (tempoFinal - tempoInicial)+ " ms");
        int i=0;

        tempoInicial = System.currentTimeMillis();

        mapa.forEach((a,b) -> {
            mapa.containsKey(i);
        });

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo para inserir no hashmap: " + (tempoFinal - tempoInicial)+ " ms");

    }
}