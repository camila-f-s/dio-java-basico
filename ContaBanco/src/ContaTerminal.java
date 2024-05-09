import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("\nPor favor, digite o número da Conta:");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência:");
        agencia = scanner.next();

        System.out.print("Por favor, digite o seu Nome:");
        nomeCliente = scanner.next();

        System.out.print("Por favor, digite o Saldo:");
        saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
    
}