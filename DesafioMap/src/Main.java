import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.security.Key;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //A: Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> estadosMap = new LinkedHashMap<>() {{

            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);


        }};

        // B: SUBSTITUA A POPULAÇÃO DO ESTADO DO RN POR 3.554.165;

        estadosMap.put("RN", 3534165);
        System.out.println(estadosMap);


        // C: Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;

        if (!estadosMap.containsKey("PB")) {
            estadosMap.put("PB", 4039277);
            System.out.println("ESTADO PB ADICIONADO!");
        }

        System.out.println(estadosMap);

        // D: Exiba a população PE;

        if (estadosMap.containsKey("PE")) {
            System.out.println(estadosMap.get("PE"));
        }

        // E : Exiba todos os estados e suas populações na ordem que foi
        //informado;

        Map<String, Integer> estadosMap2 = new LinkedHashMap<>(estadosMap);
        System.out.println(estadosMap2);

        // F: Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> estadosMap3 = new TreeMap<>(estadosMap);
        System.out.println(estadosMap3);

        // G: Exiba o estado com o menor população e sua quantidade;

        Integer menorPopulacao = Collections.min(estadosMap3.values());
        Set<Map.Entry<String, Integer>> entries = estadosMap3.entrySet();
        String estadoMenosPopuloso = "";
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenosPopuloso = entry.getKey();
                System.out.println("Estado com a menor população: " + estadoMenosPopuloso + " - " + menorPopulacao );
            }
        }

        // H: Exiba o estado com a maior população e sua quantidade;
        Integer maiorPopulacao = Collections.max(estadosMap3.values());
        Set<Map.Entry<String, Integer>> entries1 = estadosMap3.entrySet();
        String estadoMaisPopuloso = "";

        for (Map.Entry<String, Integer> entry1 : entries1) {
            if(entry1.getValue().equals(maiorPopulacao)){
                estadoMaisPopuloso = entry1.getKey();
                System.out.println("Estado mais populoso: "+ estadoMaisPopuloso + " - " + maiorPopulacao);
            }
        }
        // I : Exiba a soma da população desses estados;
        int somaEstado = 0;

        for (Map.Entry<String, Integer> entry2 : entries1) {
            somaEstado += entry2.getValue();
        }
        System.out.println("A soma da população de todos os estados é de: " +  somaEstado);

        // J : Exiba a média da população deste dicionário de estados;

        double media = (double) somaEstado / estadosMap3.size();
        System.out.println("A média da população de todos os estados é de: " + media );

        // K : Remova os estados com a população menor que 4.000.000;

        int remover = 4000000;
        Set<Map.Entry<String, Integer>> entries2 = estadosMap3.entrySet();
        entries2.removeIf(entry2 -> entry2.getValue() < remover);
        System.out.println(estadosMap3);

        // M : Apague o dicionário de estados;
        estadosMap3.clear();
        // N: Confira se o dicionário está vazio.

        System.out.println(estadosMap3.isEmpty());

    }
}