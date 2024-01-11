import java.util.Scanner;

public class EntradaBasica {
    public static void main(String[] args) {
        // Realiza como se fosse uma declaração de função para simplificar o uso, estilo
        // typedef
        Scanner entrada = new Scanner(System.in);

        // Exibe mensagem pedindo input do usuário
        System.out.print("Insira seu nome: ");

        // Recebe o input do usuário
        String nome = entrada.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Insira seu salário: ");
        float salario = entrada.nextFloat();

        // Exibe uma mensagem com o input do usuário
        System.out.println("O seu nome é " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Você recebe por mês: " + salario);

        // Libera recursos
        entrada.close();
    }
}
