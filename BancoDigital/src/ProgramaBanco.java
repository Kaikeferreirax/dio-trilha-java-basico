import java.util.Locale;
import java.util.Scanner;

public class ProgramaBanco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Insira seus dados: ");
        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Qual tipo de conta? ");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipo = sc.nextInt();
        System.out.println();


        if (tipo == 1) {
            System.out.println("Insira a sua agência: ");
            int agencia = sc.nextInt();
            System.out.println("Insira o número da sua conta: ");
            int numero = sc.nextInt();
            System.out.println("Irá começar com algum valor de deposito? (y/n)");
            char reveal = sc.next().charAt(0);
            if (reveal == 'y') {
                System.out.println("Digite o valor que deseja depositar: ");
                double saldo = sc.nextDouble();
                Conta cc = new ContaCorrente(agencia, numero, saldo, new Cliente(nome));
                cc.imprimirInfosComuns();
            } else {
                double saldo = 0.00;
                Conta cc = new ContaCorrente(agencia, numero, saldo, new Cliente(nome));
                cc.imprimirInfosComuns();
            }


        } else if (tipo == 2) {
            System.out.println("Insira a sua agência: ");
            int agencia = sc.nextInt();
            System.out.println("Insira o número da sua conta: ");
            int numero = sc.nextInt();
            System.out.println("Irá começar com algum valor de deposito? (y/n)");
            char reveal = sc.next().charAt(0);
            if (reveal == 'y') {
                System.out.println("Digite o valor que deseja depositar: ");
                double saldo = sc.nextDouble();
                Conta cp = new ContaPoupanca(agencia, numero, saldo, new Cliente(nome));
                cp.imprimirInfosComuns();
            } else {
                double saldo = 0.00;
                Conta cp = new ContaPoupanca(agencia, numero, saldo, new Cliente(nome));
                cp.imprimirInfosComuns();
            }
            sc.close();
        }
    }
}
