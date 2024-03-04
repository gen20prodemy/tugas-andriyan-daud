package Homework4;
import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan bulat yang ingin ditampilkan: ");
        int n = scanner.nextInt();

        int count = 0;
        int i = 1;

        System.out.println("Bilangan bulat positif pertama yang habis dibagi 3 tetapi tidak habis dibagi 2:");
        while (count < n) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
