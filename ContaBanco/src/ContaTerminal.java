import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o nome da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numeroDaConta = scanner.nextInt();
        
        System.out.println("Digite o seu saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
