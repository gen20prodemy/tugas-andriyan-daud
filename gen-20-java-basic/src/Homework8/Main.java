package Homework8;

public class Main {
    public static void main(String[] args) {
        Makanan mieInstan = new Makanan("mie instan", 3000);
        Minuman airMineral = new Minuman("air mineral", 5000);
        Obat paracetamol = new Obat("paracetamol", 15000);

        // Set harga baru untuk produk
        mieInstan.setHarga(4000);

        // Output informasi produk
        System.out.println("Produk: " + mieInstan.getNamaProduk() + ", Kategori: " + mieInstan.getClass().getSimpleName() +
                ", Harga: " + mieInstan.getHarga());
        System.out.println("Produk: " + airMineral.getNamaProduk() + ", Kategori: " + airMineral.getClass().getSimpleName() +
                ", Harga: " + airMineral.getHarga());
        System.out.println("Produk: " + paracetamol.getNamaProduk() + ", Kategori: " + paracetamol.getClass().getSimpleName() +
                ", Harga: " + paracetamol.getHarga());
    }
}
