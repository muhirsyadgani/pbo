package sebelas;

import java.util.ArrayList;
import java.util.List;

class Buku {
    private String judul;
    private String penulis;
    // disini saya membuat contractor
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    //  ini adalah Getter untuk judul
    public String getJudul() {
        return judul;
    }

    // ini adalah Getter untuk penulis
    public String getPenulis() {
        return penulis;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", penulis='" + penulis + '\'' +
                '}';
    }
}

class Perpustakaan {
    private List<Buku> koleksiBuku;

    // Constructor
    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
    }

    // Metode untuk menambah buku
    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku '" + buku.getJudul() + "' telah ditambahkan ke perpustakaan.");
    }

    // Metode untuk menghapus buku
    public void hapusBuku(String judul) {
        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                koleksiBuku.remove(buku);
                System.out.println("Buku '" + judul + "' telah dihapus dari perpustakaan.");
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan di perpustakaan.");
    }

    // Metode untuk menampilkan semua buku
    public void tampilkanKoleksi() {
        if (koleksiBuku.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
        } else {
            System.out.println("Koleksi Buku Perpustakaan:");
            for (Buku buku : koleksiBuku) {
                System.out.println(buku);
            }
        }
    }

    // Metode utama untuk menguji kelas Perpustakaan
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Belajar Java", "zet");
        Buku buku2 = new Buku("Pemrograman Python", "yayat");
        Buku buku3 = new Buku("Dasar-Dasar C++", "eka");

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        perpustakaan.tampilkanKoleksi();

        perpustakaan.hapusBuku("Pemrograman Python");
        perpustakaan.tampilkanKoleksi();

        perpustakaan.hapusBuku("Buku Tidak Ada");
    }
}
