import java.util.Scanner;

public class mediaaluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome_aluno = entrada.nextLine();

        System.out.print("Digite a sua 1a nota: ");
        float nota1 = entrada.nextInt();

        System.out.print("Digite a sua 2a nota: ");
        float nota2 = entrada.nextInt();

        System.out.print("Digite a sua 3a nota: ");
        float nota3 = entrada.nextInt();
        System.out.print("\n");

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Parabéns, " + nome_aluno + " você foi aprovado!");
        } else if (media > 5.9 && media < 7) {
            System.out.println("Você está de prova final " + nome_aluno + " acontece com todos :/");
        } else {
            System.out.println("Você foi reprovado :o");
        }

        System.out.println("A sua média anual foi: " + media);

        entrada.close();
    }
}