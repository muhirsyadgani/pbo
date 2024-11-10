package duasatu;

// Kelas utama untuk menjalankan program.
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil.
        Mobil mobil = new Mobil("Toyota", "Avanza", 2020, 500);
        // Membuat objek truk.
        Truk truk = new Truk("Hino", "Dutro", 2018, 2000);

        // Menampilkan detail mobil.
        System.out.println("Detail Mobil:");
        mobil.tampilkanDetail();
        System.out.println(); // Baris kosong untuk memisahkan output.

        // Menampilkan detail truk.
        System.out.println("Detail Truk:");
        truk.tampilkanDetail();
    }
}