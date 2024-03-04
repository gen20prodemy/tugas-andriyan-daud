package Homework5;

public class Soal03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array sebelum dibalik:");
        printArray(array);

        reverseArray(array);

        System.out.println("\nArray setelah dibalik:");
        printArray(array);
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Tukar elemen pada posisi start dengan posisi end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Pindahkan pointer start ke kanan dan pointer end ke kiri
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
