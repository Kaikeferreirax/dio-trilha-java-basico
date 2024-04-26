import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Queue<Meses> listMes = new LinkedList<>();

        listMes.add(new Meses("Janeiro" , 25.4));
        listMes.add(new Meses("Fevereiro" , 27.3));
        listMes.add(new Meses("Março" , 28.0));
        listMes.add(new Meses("Abril" , 29.5));
        listMes.add(new Meses("Maio" , 24));
        listMes.add(new Meses("Junho" , 22.3));

        double soma  = 0;

        for(Meses mes : listMes){
            soma += mes.getTemperatura();
        }
        double media = soma / listMes.size();

        for(Meses mess : listMes){
            if (mess.getTemperatura() < media) {
                System.out.println(mess.getNomeMes());

            }
        }


        System.out.printf("%.2f%n", media);
        System.out.println(listMes);


    }
}