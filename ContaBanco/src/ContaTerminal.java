import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, Somos da Equipe de Alunos da DIO");
        System.out.println("Vamos da inicio a abertura da sua Conta!");
        System.out.println();
        System.out.println("Digite o Numero da sua Conta: ");
        c.numeroConta = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o sua Agencia: ");
        c.agencia = sc.nextLine();
        System.out.println("Digite seu Nome: ");
        c.nomeCliente = sc.nextLine();
        System.out.println("Saldo inicial: ");
        c.saldo = Double.parseDouble(sc.nextLine());

        //Integer.parseInt(c.nomeConta) = sc.nextLine;

        System.out.println("Conta Aberta com Sucesso!");

        System.out.printf("Olá " +c.nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +c.agencia+ ", conta %d e seu saldo é de %.2f e já está disponível para saque.", c.numeroConta, c.saldo);

        sc.close();
        
    }
}
