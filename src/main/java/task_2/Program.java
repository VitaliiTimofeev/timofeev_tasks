package task_2;

import java.util.Scanner;
import java.util.Arrays;

public class Program {
    /*Написать программу, которая:
* считывает с консоли 2 числа n и m
* заполняет двумерный массив размером n на m нечетными числами
    Массив вывести на консоль*/


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер двуммерного массива: ");
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = 2 * j + 1;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        }
    }