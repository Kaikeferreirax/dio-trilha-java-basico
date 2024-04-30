import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // A: exibindo elementos por ordem de inserção -> Usa-se para set LinkedHasSet;

        Set<LinguagemFavorita> listaFavoritos = new LinkedHashSet<>();

        listaFavoritos.add(new LinguagemFavorita("Java", 1991, "Intelij"));
        listaFavoritos.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        listaFavoritos.add(new LinguagemFavorita("Golang", 2007, "GoLand"));

        System.out.println(listaFavoritos);

        // B: exibir elementos da lista por ordem natural (Nome);
        Set<LinguagemFavorita> listaFavoritos2 = new TreeSet<>(listaFavoritos);

            System.out.println(listaFavoritos2);


        // C: Exibir por ordem de IDE

        Set<LinguagemFavorita> listaFavoritos3 = new TreeSet<>(new ComparatorIde());
        listaFavoritos3.addAll(listaFavoritos);
        System.out.println(listaFavoritos3);

        // D: exibir por Ano de criação e nome;

        Set<LinguagemFavorita> listaFavoritos4 = new TreeSet<>(new ComparatorAnoNome());
        listaFavoritos4.addAll(listaFavoritos);
        System.out.println(listaFavoritos4);

        // E:Nome, ano de criacao e IDE;
        Set<LinguagemFavorita> listaFavoritos5 = new TreeSet<>(new ComparatorNomeAnoIde());
        listaFavoritos5.addAll(listaFavoritos);
        System.out.println(listaFavoritos5);



    }

}
