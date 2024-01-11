import java.util.Scanner;

/* Atualizar futuramente com verificação do tipo de entrada das notas
 * Implementar um meio de leitura com repetição, permitindo o usuário entrar
 * com a quantidade de notas desejadas (for loop)
 */

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float media = 0;

        System.out.print("Digite o seu nome: ");
        String nome_aluno = entrada.nextLine();

        System.out.print("Digite para calcular uma média aritmética (1) ou uma média ponderada (2): ");
        char tipo_media = entrada.next().charAt(0);

        if (tipo_media == '1') {
            media = mediaAritmetica(entrada);
        } else if (tipo_media == '2') {
            media = mediaPonderada(entrada);
        } else {
            System.out.println("Entrada inválida.");
        }

        System.out.println("-----------------------------------");
        if (media >= 7.0) {
            System.out.println("Parabéns, " + nome_aluno + " você foi aprovado!");
        } else if (media >= 6.0 && media < 7.0) {
            System.out.println("Você está de prova final, " + nome_aluno + ", acontece com todos :/");
        } else {
            System.out.println("Você foi reprovado :o");
        }

        System.out.println("A sua média anual foi: " + media);
        entrada.close();
    }

    static float mediaAritmetica(Scanner entrada) {

        System.out.print("Digite a sua 1a nota: ");
        float nota1 = entrada.nextFloat();

        System.out.print("Digite a sua 2a nota: ");
        float nota2 = entrada.nextFloat();

        System.out.print("Digite a sua 3a nota: ");
        float nota3 = entrada.nextFloat();
        System.out.print("\n");

        return (nota1 + nota2 + nota3) / 3;
    }

    static float mediaPonderada(Scanner entrada) { // Cada nota * peso, todas as notas / qtd notas

        System.out.print("Digite a sua 1a nota: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Digite o peso da 1a nota: ");
        float peso1 = entrada.nextFloat();
        nota1 = nota1 * peso1;

        System.out.print("Digite a sua 2a nota: ");
        float nota2 = entrada.nextFloat();
        System.out.print("Digite o peso da 2a nota: ");
        float peso2 = entrada.nextFloat();
        nota2 = nota2 * peso2;

        System.out.print("Digite a sua 3a nota: ");
        float nota3 = entrada.nextFloat();
        System.out.print("Digite o peso da 3a nota: ");
        float peso3 = entrada.nextFloat();
        nota3 = nota3 * peso3;

        System.out.println();

        float media = (nota1 + nota2 + nota3) / 3;
        return media;

    }
}
