package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println("Metodo Suma de los primeros 5 números: " + sumNum(5));
        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20));
        System.out.println("Obtén el factorial del número 7 → (7!): " + factorial(7));
        System.out.println("Obtén el recursive factorial del número 7 → (7!): " + recursiveFactorial(1));
    }

    /**
     * Calcula la suma de los primeros N números.
     *
     * @param num Número hasta el cual sumar.
     * @return La suma de los números.
     */
    public static int sumNum(int num) {
        if(num<=0) return 0;
        return num*(num + 1)/2;
    }

    /**
     * Calcula la suma de los primeros N números pares.
     *
     * @param num Número de pares a sumar.
     * @return La suma de los números pares.
     */
    public static int sumEvenNum(int num) {
        if (num <= 0) return 0;
        return num * (num + 1);
    }

    /**
     * Calcula el factorial de un número usando un bucle.
     *
     * @param num Número para calcular el factorial.
     * @return El factorial del número.
     */
    public static int factorial(int num) {
        if (num < 0) throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        int result = 1;
        if(num > 1) {
            for(int i = 1; i <= num; i++){
                result= result*i;
            }
        }
        return result;
    }

    /**
     * Calcula el factorial de un número de forma recursiva.
     *
     * @param num Número para calcular el factorial.
     * @return El factorial del número.
     */
    public static int recursiveFactorial(int num) {
        if (num < 0) throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        return  (num <= 1) ? 1 : num * recursiveFactorial(num - 1);
    }
}
