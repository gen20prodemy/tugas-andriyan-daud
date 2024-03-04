package Homework6;
import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukan angka: ");
            int angka = scanner.nextInt();
            int hasil = Aritmatika(angka);
            //System.out.println("Hasil Pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan Aritmatika!! 30"+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan!!");
        } finally {
            scanner.close();
            System.out.println("Program selesai");
        }
    }

    public static int Aritmatika(int angka) throws ArithmeticException {
        if (angka < 0) {
            throw new ArithmeticException("Angka tidak boleh minus");
        } else if (angka > 20) {
            throw new ArithmeticException("Angka tidak boleh dari 20");
        }
        return angka;
    }
}
