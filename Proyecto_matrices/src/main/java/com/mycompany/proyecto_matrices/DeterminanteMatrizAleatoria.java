/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_matrices;
import java.util.Random;

public class DeterminanteMatrizAleatoria {

    public static void main(String[] args) {
        int n = 2; // Tamaño de la matriz
        int[][] matriz = generarMatrizAleatoria(n);
        imprimirMatriz(matriz);
        System.out.println("El determinante es: " + calcularDeterminante(matriz));
    }

    // Método para generar una matriz aleatoria de tamaño n x n
    public static int[][] generarMatrizAleatoria(int n) {
        Random rand = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(10); // Números aleatorios entre 0 y 9
            }
        }
        return matriz;
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para calcular el determinante de una matriz
    public static int calcularDeterminante(int[][] matriz) {
        int n = matriz.length;
        if (n == 1) {
            return matriz[0][0];
        }
        if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }
        int determinante = 0;
        for (int i = 0; i < n; i++) {
            determinante += Math.pow(-1, i) * matriz[0][i] * calcularDeterminante(obtenerMenor(matriz, 0, i));
        }
        return determinante;
    }

    // Método para obtener el menor de la matriz
    public static int[][] obtenerMenor(int[][] matriz, int fila, int columna) {
        int n = matriz.length;
        int[][] menor = new int[n - 1][n - 1];
        for (int i = 0, m = 0; i < n; i++) {
            if (i == fila) continue;
            for (int j = 0, nCol = 0; j < matriz[i].length; j++) {
                if (j == columna) continue;
                menor[m][nCol++] = matriz[i][j];
            }
            m++;
        }
        return menor;
    }
}

