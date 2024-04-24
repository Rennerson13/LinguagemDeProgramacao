public class DivisaoSimplificada {

    public static String dividir(int numerador1, int denominador1, int numerador2, int denominador2) {
        int numerador = numerador1 * denominador2;
        int denominador = denominador1 * numerador2;

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
        String resultado = dividir(5, 4, 7, 2);
        System.out.println("Resultado da divisão simplificada: " + resultado);
    }
}
