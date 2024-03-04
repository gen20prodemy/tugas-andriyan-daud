package Homework5;

public class Soal01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int total = calculateTotal(array);
        System.out.println("Total bilangan dalam array: " + total);
    }

    public static int calculateTotal(int[] arr) {
        int total = 0;

        for (int num : arr) {
            total += num; // Menambahkan setiap elemen array ke total
        }

        return total;
    }
}
