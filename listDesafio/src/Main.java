import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Meses> listMes = new ArrayList<>();

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
        for(int i = 0; i < listMes.size(); i++){
            if (listMes.get(i).getTemperatura() < media){

                System.out.println((listMes.indexOf(listMes.get(i)) + 1)+" - " + listMes.get(i).getNomeMes());
            }
        }

            System.out.printf("%.2f%n", media);


    }
}