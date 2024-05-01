import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exibindo numeros pares de uma lista de inteiros maiores que 2;
        List<Integer> inteiros = new ArrayList<>(
                Arrays.asList(0,1,2,3,4,5,6,7,8,9)
        );

        /*   System.out.println(inteiros
                .stream()
                .filter(inteiro -> inteiro % 2 ==0 && inteiro >2 )
                .collect(Collectors
                .toList()));
        */
        //Coletando pares e inserindo em uma lista
        List<Integer> collectList = inteiros
                .stream()
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors
                .toList());
        System.out.println(collectList);

        //eliminando numeros impares da lista
        inteiros.removeIf(i -> i % 2 != 0);
        System.out.println(inteiros);

        List<String> testee = new ArrayList<>(
                Arrays.asList("6", "10", "14","21","24")
        );

         List<Integer> testes = testee
                 .stream()
                 .map(Integer::parseInt)
                 .collect(Collectors
                 .toList());
        System.out.println(testes);

    }
}