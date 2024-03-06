package Homework8;

public class Makanan extends Product{
    public Makanan(String namaProduk, double harga) {
        super(namaProduk, harga);
    }

    // Override harga untuk makanan tertentu
    @Override
    public void setHarga(double harga) {
        if (getNamaProduk().equals("mie instan")) {
            super.setHarga(harga * 1.2); // Mie instan dikenakan biaya tambahan
        } else {
            super.setHarga(harga);
        }
    }
}
