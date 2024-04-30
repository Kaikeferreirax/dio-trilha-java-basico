import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();


        System.out.println("Telefonou para vítima?");
        String resposta = sc.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Esteve no local do crime?");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Mora perto da vítima?");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Devia para a vítima?");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());
        System.out.println("Já trabalhou com a vítima?");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;

        Iterator<String> contador = respostas.iterator();

        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")){
                count++;
            }
        }

        switch (count){
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<");break;
            case 5:
                System.out.println(">> ASSASSINO <<");break;
            default:
                System.out.println(">> INOCENTE <<");break;
        }

        sc.close();
    }
}