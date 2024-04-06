import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta! ");
        int Numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome! ");
        String NomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu Saldo! ");
        double saldo= sc.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + Numero + " e seu saldo "+ saldo + " já está disponível para saque.");

        sc.close();
        }
    }
