package Homework3;

public class Soal03 {
    public static void main(String[] args) {
        int rows = 5; // Jumlah baris segitiga

        // Loop untuk mengatur baris
        for (int i = 0; i < rows; i++) {
            // Loop untuk mengatur spasi
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Loop untuk mengatur karakter '*'
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris baru setelah setiap baris selesai diatur
        }
    }
}
