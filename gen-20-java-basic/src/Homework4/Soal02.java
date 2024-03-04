package Homework4;
import java.util.Scanner;
public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        int hasil = hitungN(N);
        System.out.println("Hasil penjumlahan 1 + 2 + 3 + ... + N adalah: " + hasil);
    }

    public static int hitungN(int N) {
        return (N * (N + 1)) / 2;
    }
}
