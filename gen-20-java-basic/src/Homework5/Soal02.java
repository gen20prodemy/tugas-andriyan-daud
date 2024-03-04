package Homework5;

public class Soal02 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = sumOfSecondDimension(array);

        // Menampilkan hasil penjumlahan
        System.out.print("Hasil penjumlahan setiap elemen pada dimensi kedua: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] sumOfSecondDimension(int[][] arr) {
        int[] sums = new int[arr[0].length]; // array baru untuk menyimpan hasil penjumlahan

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sums[j] += arr[i][j]; // menambahkan setiap elemen ke array sums
            }
        }

        return sums; // mengembalikan array hasil penjumlahan
    }
}
