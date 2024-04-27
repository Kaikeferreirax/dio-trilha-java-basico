import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // A:Exiba todas as cores uma abaixo da outra
        Set<String> arcoIris = new LinkedHashSet<>();

        arcoIris.add("Vermelho\n");
        arcoIris.add("Laranja\n");
        arcoIris.add("Amarelo\n");
        arcoIris.add("Verde\n");
        arcoIris.add("Azul\n");
        arcoIris.add("Anil\n");
        arcoIris.add("Violeta\n");
        System.out.println(arcoIris);

        // B: A quantidade de cores que o arco-íris tem
        System.out.println(arcoIris.size());
        //C: Exiba as cores em ordem alfabética
        Set<String> arcoIris2= new TreeSet<>();

        arcoIris2.add("Vermelho");
        arcoIris2.add("Laranja");
        arcoIris2.add("Amarelo");
        arcoIris2.add("Verde");
        arcoIris2.add("Azul");
        arcoIris2.add("Anil");
        arcoIris2.add("Violeta");

        System.out.println(arcoIris2);
        // D: Exiba as cores na ordem inversa da que foi informada
        Set<String> arcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho")
        );


        System.out.println(arcoIris3);
        List<String> arcoIrisList = new ArrayList<>(arcoIris3);
        Collections.reverse(arcoIrisList);
        System.out.println(arcoIrisList);

        // E: Exiba todas as cores que começam com a letra ”v”

        for(String cor : arcoIrisList){
            if(cor.startsWith("v")) System.out.println(cor);


        }

        // F: Remova todas as cores que não começam com a letra “v”

        arcoIrisList.removeIf(cor -> !cor.startsWith("v"));
        System.out.println(arcoIrisList);

        // G: Limpe o conjunto
        arcoIrisList.clear();
        System.out.println(arcoIrisList);

        // H: Confira se o conjunto está vazio
        System.out.println(arcoIrisList.isEmpty());


    }
}
