package calculadora;

import java.util.ArrayList;

public class Calculadora {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
    }

    public static float somar(float a, float b) {
        return a + b;
    }

    public static float subtrair(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisão por zero!");
            return 0.0f;
        }
    }

    public static int somar(ArrayList<Integer> numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static float multiplicar(ArrayList<Float> numeros) {
        float resultado = 1.0f;
        for (float numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Exemplos com inteiros
        System.out.println("Operações com inteiros:");
        System.out.println("Soma: " + somar(5, 3));
        System.out.println("Subtração: " + subtrair(5, 3));
        System.out.println("Multiplicação: " + multiplicar(5, 3));
        System.out.println("Divisão: " + dividir(5, 3));

        // Exemplos com floats
        System.out.println("\nOperações com floats:");
        System.out.println("Soma: " + somar(5.0f, 3.0f));
        System.out.println("Subtração: " + subtrair(5.0f, 3.0f));
        System.out.println("Multiplicação: " + multiplicar(5.0f, 3.0f));
        System.out.println("Divisão: " + dividir(5.0f, 3.0f));

        // Exemplos com ArrayLists
        System.out.println("\nOperações com ArrayLists:");
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(4);
        intList.add(6);
        System.out.println("Soma (ArrayList de inteiros): " + somar(intList));

        ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(2.5f);
        floatList.add(1.5f);
        floatList.add(3.0f);
        System.out.println("Multiplicação (ArrayList de floats): " + multiplicar(floatList));
    }
}
