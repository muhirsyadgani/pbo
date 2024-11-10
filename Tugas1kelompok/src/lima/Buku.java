package lima;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Buku {
    private String judul, penulis, isbn;
    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
    }
    public String getISBN() { return isbn; }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", isbn: " + isbn;
    }

    public static class Main {
        private static List<Buku> koleksiBuku = new ArrayList<>();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("\nMenu:\n1. Tambah Buku\n2. Hapus Buku\n3. Tampilkan Buku\n4. Keluar\nPilih opsi: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihan == 1) {
                    tambahBuku(scanner);
                } else if (pilihan == 2) {
                    hapusBuku(scanner);
                } else if (pilihan == 3) {
                    tampilkanKoleksiBuku();
                } else if (pilihan == 4) {
                    break;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            }
            scanner.close();
        }

        private static void tambahBuku(Scanner scanner) {
            System.out.print("Judul: "); String judul = scanner.nextLine();
            System.out.print("Penulis: "); String penulis = scanner.nextLine();
            System.out.print("ISBN: "); String ISBN = scanner.nextLine();
            koleksiBuku.add(new Buku(judul, penulis, ISBN));
            System.out.println("Buku berhasil ditambahkan.");
        }

        private static void hapusBuku(Scanner scanner) {
            System.out.print("ISBN Buku yang ingin dihapus: ");
            String ISBN = scanner.nextLine();
            boolean ditemukan = koleksiBuku.removeIf(buku -> buku.getISBN().equals(ISBN));
            System.out.println(ditemukan ? "Buku berhasil dihapus." : "Buku tidak ditemukan.");
        }

        private static void tampilkanKoleksiBuku() {
            if (koleksiBuku.isEmpty()) {
                System.out.println("Koleksi buku kosong.");
            } else {
                koleksiBuku.forEach(System.out::println);
            }
        }
    }
}


