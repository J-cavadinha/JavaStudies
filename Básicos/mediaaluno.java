import java.util.Scanner;

/* Atualizar futuramente com verificação do tipo de entrada das notas
 * Implementar um meio de leitura com repetição, permitindo o usuário entrar
 * com a quantidade de notas desejadas (for loop)
 * Idéia de novo programa - fazer uma calculadora de médias contendo a média aritmética
 * e a média ponderada.
 */

public class mediaaluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome_aluno = entrada.nextLine();

        System.out.print("Digite a sua 1a nota: ");
        float nota1 = entrada.nextFloat();

        System.out.print("Digite a sua 2a nota: ");
        float nota2 = entrada.nextFloat();

        System.out.print("Digite a sua 3a nota: ");
        float nota3 = entrada.nextFloat();
        System.out.print("\n");

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Parabéns, " + nome_aluno + " você foi aprovado!");
        } else if (media >= 6 && media < 7) {
            System.out.println("Você está de prova final " + nome_aluno + " acontece com todos :/");
        } else {
            System.out.println("Você foi reprovado :o");
        }

        System.out.printf("A sua média anual foi: %.2f" + media);

        entrada.close();
    }
}
