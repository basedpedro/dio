import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int agencia, numero;
        String nomeCliente;
        double saldo = 0;

        System.out.println("Digite seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scan.nextInt();

        System.out.println("Digite o numero da conta: ");
        numero = scan.nextInt();

        System.out.println("Digite um valor de depósito inicial: ");
        double valor = scan.nextDouble();

        saldo = saldo + valor;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponivel para saque.");

    }
}
