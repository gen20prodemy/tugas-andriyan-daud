package Homework6;
import java.util.Scanner;
public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int inputValue = scanner.nextInt();
        scanner.close();

        try {
            validateInput(inputValue);
            System.out.println("Input valid.");
        } catch (ValidationException ve) {
            System.out.println(ve.getMessage());
        }
    }

    public static void validateInput(int value) throws ValidationException {
        if (value < 0) {
            throw new ValidationException("Nilai tidak boleh negatif");
        } else if (value > 100) {
            throw new ValidationException("Nilai tidak boleh lebih dari 100");
        }
    }
}

