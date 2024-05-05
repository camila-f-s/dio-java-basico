import java.util.Scanner;

public class GerenciaBanco {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite seu Nome:");
        String nome = ler.next();

        System.out.printf("Digite seu Sobrenome:");
        String sobrenome = ler.next();

        String cpf = "";

        do {
            System.out.printf("Digite seu CPF:");
            cpf = ler.next();
        
            if (cpf.length() != 11) {
                System.out.println("CPF inválido");
            }
        } while (cpf.length() != 11);


        int opcao = 0;

        do{
            System.out.printf("\nEscolha uma opção:\n 1- consultar dados pessoais\n 2- operacoes bancarias\n 3- Encerrar sessão\n");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    DadosPessoais(nome, sobrenome, cpf);
                    break;
                case 2:
                    new OperacoesBancarias().executarOperacoes();
                    break;
                case 3:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Erro de seleção");
            }
        } while(opcao > 0 && opcao <= 2);

        ler.close();
    }

    public static void DadosPessoais(String nome, String sobrenome, String cpf) {
        System.out.printf("Nome Completo: %s %s\nCPF: %d\n", nome, sobrenome, cpf);
    }

    static class OperacoesBancarias {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        double saldo = 0;
        double valor = 0;

        public void executarOperacoes() {
            do {
                System.out.printf("Escolha uma opção:\n 1- Consultar o saldo\n 2- Depositar\n 3- Sacar\n 4- Voltar ao menu anterior.\n");
                opcao = ler.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.printf("Seu saldo é de: " + saldo);
                        break;
                    case 2:
                        System.out.printf("Digite o valor que será depositado:");
                        valor = ler.nextDouble();
                        if(valor > 0)
                            saldo += valor;
                        else
                            System.out.printf("Valor inválido.");
                        break;
                    case 3:
                        System.out.printf("Digite o valor que será sacado:");
                        valor = ler.nextDouble();
                        if(valor < saldo && valor > 0)
                            saldo -= valor;
                        else
                            System.out.printf("Valor do saque é maior do que o valor do saldo disponível.");
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Error de seleção");
                }
            } while (opcao > 0 && opcao <= 3);
        }
    }
}
