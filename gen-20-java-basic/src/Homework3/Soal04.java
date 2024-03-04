package Homework3;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int[] matrix = new int[n];

        for (int i = 0; i < n; i++) {
            matrix[i] = i * 2 + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i] + " ");
        }

        scanner.close();
    }
}
