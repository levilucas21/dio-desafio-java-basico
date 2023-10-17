import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //Todo:Conhecer e importar a classe Scanner
        Scanner sc=new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

        //Exibir as mensagens para o nosso usuário 

        //Obter pela classe Scanner os valores digitados no terminal 


        System.out.println("- SUA CONTA BANCÁRIA -");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta: (0000)");
		numero=sc.nextInt();

		System.out.println("Digite o número da Agência: (123-8)");
		agencia=sc.next();

		System.out.println("Digite seu nome: ");
		nomeCliente= sc.next();
		sc.nextLine();

		System.out.println("Digite seu saldo atual: ");
		saldo=sc.nextDouble();
        
    
        //exibir a mensagem da conta criada 
        System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo de %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		sc.close();






    }
}
