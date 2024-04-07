package candidatura;

import javax.swing.*;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
             entrandoEmContato(candidato);


        }

        sc.close();

    }


    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
         atendeu = atender();
         continuarTentando = !atendeu;

         if (continuarTentando){
            tentativasRealizadas++;
         } else
             System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }
        else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS "+ tentativasRealizadas);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }





    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for(int i = 0; i < candidatos.length; i++){

            System.out.println("O candidato  de n° " +(i + 1) + " é " + candidatos[i]);
        }
    }


    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "D", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double baseSalarial = 2000.00;
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double pretensaoSalarial = valorPretensao();
            System.out.println("O candidato "+ candidato + " Solicitou este valor de salário " + pretensaoSalarial);
            if(baseSalarial >= pretensaoSalarial){
                System.out.println("O candidato " + candidato + " foi selecionado(a) para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }

    }

    static double valorPretensao(){
        return ThreadLocalRandom.current().nextDouble(1800.0,2200.0);
    }

    static void analisarCandidato(double pretensaoSalarial) {
        double baseSalarial = 2000.0;
        if (baseSalarial > pretensaoSalarial) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (baseSalarial == pretensaoSalarial) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CONVIDADOS. ");
        }

    }

}