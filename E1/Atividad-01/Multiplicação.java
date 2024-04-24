import java.util.Scanner;

public class MultiplicacaoFracoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numerador da primeira fração: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Digite o denominador da primeira fração: ");
        int denominador1 = scanner.nextInt();

        System.out.print("Digite o numerador da segunda fração: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Digite o denominador da segunda fração: ");
        int denominador2 = scanner.nextInt();

        scanner.close();

        int numeradorResultado = numerador1 * numerador2;
        int denominadorResultado = denominador1 * denominador2;

        int mdc = calcularMDC(numeradorResultado, denominadorResultado);

        numeradorResultado /= mdc;
        denominadorResultado /= mdc;

        System.out.println("\nResultado simplificado:");
        System.out.println(numeradorResultado + "/" + denominadorResultado);
    }

    private static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
