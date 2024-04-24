public class MultiplicacaoSimplificada {

    public static String multiplicar(int numerador1, int denominador1, int numerador2, int denominador2) {
        int numerador = numerador1 * numerador2;
        int denominador = denominador1 * denominador2;

        simplificar(numerador, denominador);

        return numerador + "/" + denominador;
    }

    private static void simplificar(int numerador, int denominador) {
        while (numerador % 2 == 0 && denominador % 2 == 0) {
            numerador /= 2;
            denominador /= 2;
        }
    }

    public static void main(String[] args) {
        String resultado = multiplicar(5, 3, 7, 4);
        System.out.println("Resultado da multiplicação simplificada: " + resultado);
    }
}
