import java.util.Scanner;

// Faltando apenas a estrutura de repetição.

public class CalculadoraAreaTerreno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char opcao_terreno = menu(entrada);

        switch (opcao_terreno) {
            case '1':
                quadrado(entrada);
                break;

            case '2':
                retangulo(entrada);
                break;

            case '3':
                triangulo(entrada);
                break;

            case '4':
                trapezio(entrada);
                break;

            case '5':
                return;

            default:
                System.out.println("Entrada inválida.");
        }
        entrada.close();
    }

    static char menu(Scanner entrada) {

        System.out.println("Digite o tipo de terreno que deseja calcular a área.");
        System.out.println("1 - Quadrado / 2 - Retângulo / 3 - Triângulo / 4 - Trapézio / 5 - Encerrar");
        char opcao_terreno = entrada.next().charAt(0);
        return opcao_terreno;
    }

    static void quadrado(Scanner entrada) {
        System.out.print("Digite o lado do quadrado: ");
        float lado_quadrado = entrada.nextFloat();
        System.out.println("A área do quadrado é " + (lado_quadrado * lado_quadrado));
    }

    static void retangulo(Scanner entrada) {
        System.out.print("Digite a base do retângulo: ");
        float base = entrada.nextFloat();
        System.out.print("Digite a altura do retângulo: ");
        float altura = entrada.nextFloat();

        float area_retangulo = base * altura;
        System.out.println("A área do retângulo é " + area_retangulo);
    }

    static void triangulo(Scanner entrada) {
        System.out.print("Digite a base do triângulo: ");
        float base = entrada.nextFloat();
        System.out.print("Digite a altura do triângulo: ");
        float altura = entrada.nextFloat();

        float area_triangulo = (base * altura) / 2;
        System.out.println("A área do triângulo é " + area_triangulo);
    }

    static void trapezio(Scanner entrada) {
        System.out.print("Digite uma das bases do trapézio: ");
        float base1 = entrada.nextFloat();
        System.out.print("Digite a outra base do trapézio: ");
        float base2 = entrada.nextFloat();
        System.out.print("Digite a altura do trapézio: ");
        float altura = entrada.nextFloat();

        float area_trapezio = ((base1 + base2) * altura) / 2;
        System.out.println("A área do trapézio é " + area_trapezio);
    }
}