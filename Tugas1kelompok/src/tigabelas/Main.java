package tigabelas;

import java.util.ArrayList;
import java.util.List;

// Kelas Produk
class Produk {
    private String nama;
    private int jumlah;
    private final int ambangBatas = 5;

    public Produk(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void tambahJumlah(int jumlah) {
        this.jumlah += jumlah;
    }

    public void kurangiJumlah(int jumlah) {
        if (this.jumlah >= jumlah) {
            this.jumlah -= jumlah;
        } else {
            System.out.println("Jumlah tidak cukup untuk mengurangi produk: " + nama);
        }
    }

    public boolean isPersediaanRendah() {
        return jumlah < ambangBatas;
    }

    @Override
    public String toString() {
        return "Produk: " + nama + ", Jumlah: " + jumlah + ", Ambang Batas: " + ambangBatas;
    }
}

// Kelas Persediaan
class Persediaan {
    private List<Produk> produkList;

    public Persediaan() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
        System.out.println("Produk ditambahkan: " + produk);
    }

    public void hapusProduk(String nama) {
        for (int i = 0; i < produkList.size(); i++) {
            if (produkList.get(i).getNama().equals(nama)) {
                System.out.println("Produk dihapus: " + produkList.get(i));
                produkList.remove(i);
                return;
            }
        }
        System.out.println("Produk tidak ditemukan: " + nama);
    }

    public void cekPersediaanRendah() {
        System.out.println("Persediaan yang rendah:");
        for (Produk produk : produkList) {
            if (produk.isPersediaanRendah()) {
                System.out.println(produk);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Persediaan persediaan = new Persediaan();

        // Menambahkan produk
        persediaan.tambahProduk(new Produk("Susu", 10));
        persediaan.tambahProduk(new Produk("Roti", 3));
        persediaan.tambahProduk(new Produk("Telur", 2));

        // Mengecek persediaan yang rendah
        persediaan.cekPersediaanRendah();

        // Menghapus produk
        persediaan.hapusProduk("Roti");

        // Mengecek persediaan yang rendah setelah penghapusan
        persediaan.cekPersediaanRendah();
    }
}

