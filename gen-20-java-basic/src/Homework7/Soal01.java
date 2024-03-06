package Homework7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;

class Barang implements Comparable<Barang> {
    String nama;
    int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public int compareTo(Barang other) {
        return this.nama.compareTo(other.nama);
    }
}

public class Soal01 {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input data barang
        System.out.println("Masukkan data barang (nama, harga), ketik 'selesai' untuk mengakhiri:");
        while (true) {
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            if (nama.equals("selesai")) {
                break;
            }
            System.out.print("Harga: ");
            int harga = Integer.parseInt(scanner.nextLine());

            Barang barang = new Barang(nama, harga);
            daftarBarang.add(barang);
        }

        // Menampilkan data barang
        System.out.println("\nDaftar Barang:");
        for (Barang barang : daftarBarang) {
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }

        // Mengambil salah satu data dari kumpulan tersebut
        if (!daftarBarang.isEmpty()) {
            Barang barangPertama = daftarBarang.get(0);
            System.out.println("\nData Barang Pertama:");
            System.out.println("Nama: " + barangPertama.nama + ", Harga: " + barangPertama.harga);
        }

        // Konversi dari ArrayList ke LinkedList
        LinkedList<Barang> linkedListBarang = new LinkedList<>(daftarBarang);

        // Printout data dari LinkedList
        System.out.println("\nData Barang dari LinkedList:");
        for (Barang barang : linkedListBarang) {
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }

        // Konversi ke HashSet
        HashSet<Barang> hashSetBarang = new HashSet<>(daftarBarang);
        System.out.println("\nData Barang dari HashSet:");
        for (Barang barang : hashSetBarang) {
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }

        // Konversi ke LinkedHashSet
        LinkedHashSet<Barang> linkedHashSetBarang = new LinkedHashSet<>(daftarBarang);
        System.out.println("\nData Barang dari LinkedHashSet:");
        for (Barang barang : linkedHashSetBarang) {
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }

        // Konversi ke TreeSet
        TreeSet<Barang> treeSetBarang = new TreeSet<>(daftarBarang);
        System.out.println("\nData Barang dari TreeSet:");
        for (Barang barang : treeSetBarang) {
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }

        // Konversi ke Stack
        Stack<Barang> stackBarang = new Stack<>();
        stackBarang.addAll(daftarBarang);
        System.out.println("\nData Barang dari Stack:");
        while (!stackBarang.isEmpty()) {
            Barang barang = stackBarang.pop();
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }

        // Konversi ke Queue
        Queue<Barang> queueBarang = new LinkedList<>(daftarBarang);
        System.out.println("\nData Barang dari Queue:");
        while (!queueBarang.isEmpty()) {
            Barang barang = queueBarang.poll();
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }

        // Konversi ke PriorityQueue
        PriorityQueue<Barang> priorityQueueBarang = new PriorityQueue<>(daftarBarang);
        System.out.println("\nData Barang dari PriorityQueue:");
        while (!priorityQueueBarang.isEmpty()) {
            Barang barang = priorityQueueBarang.poll();
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }
    }
}
