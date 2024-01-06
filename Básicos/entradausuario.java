import java.util.Scanner;

public class entradausuario {
    public static void main(String[] args) {
        // Realiza como se fosse uma declaração de função para simplificar o uso, estilo
        // typedef
        Scanner scanner = new Scanner(System.in);

        // Exibe mensagem pedindo input do usuário
        System.out.print("Insira seu nome: ");

        // Recebe o input do usuário
        String input1 = scanner.nextLine();

        // Exibe uma mensagem com o input do usuário
        System.out.println("O seu nome é " + input1);

        // Libera recursos
        scanner.close();
    }
}
