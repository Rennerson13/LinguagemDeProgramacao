public class SubtracaoSimplificada {

    public static String subtrair(int numerador1, int denominador1, int numerador2, int denominador2) {
        int numerador = 0;
        int denominador = 0;

     
        if (denominador1 == denominador2) {
            denominador = denominador1;
            numerador = numerador1 - numerador2;
        }

  
        else if (denominador1 % 2 == 0 && denominador2 % 2 == 0 && denominador1 > denominador2) {
            denominador = denominador1;
            numerador = (denominador / denominador1) * numerador1 - (denominador / denominador2) * numerador2;
        }

        
        else if (denominador1 % 2 == 0 && denominador2 % 2 == 0 && denominador1 < denominador2) {
            denominador = denominador2;
            numerador = (denominador / denominador1) * numerador1 - (denominador / denominador2) * numerador2;
        }

       
        else {
            denominador = denominador1 * denominador2;
            numerador = (denominador / denominador1) * numerador1 - (denominador / denominador2) * numerador2;
        }

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
        String resultado = subtrair(4, 3, 2, 7);
        System.out.println("Resultado da subtração simplificada: " + resultado);
    }
}
