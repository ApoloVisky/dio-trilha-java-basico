import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("#########################");
        System.out.println("Bem Vindo ao nosso banco!");
        System.out.println("#########################");

        Scanner scanner = new Scanner(System.in);


        System.out.print("\nDigite o seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("\nPor favor, digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("\nQual o número da sua conta? ");
        int conta = scanner.nextInt();

        System.out.print("\nQual valor deseja sacar? ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá, "+ nome + " obrigado por criar uma conta em nosso banco, sua agência é, "+agencia+ " conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");

        scanner.close();




    }
}
