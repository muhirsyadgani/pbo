package duatiga;

// Kelas induk: Kursus
class Kursus {
    String nama;
    String instruktur;
    int kredit;

    // Konstruktor untuk kelas Kursus
    public Kursus(String nama, String instruktur, int kredit) {
        this.nama = nama;
        this.instruktur = instruktur;
        this.kredit = kredit;
    }

    // Metode untuk menampilkan detail kursus
    public void tampilkanDetailKursus() {
        System.out.println("Detail Kursus:");
        System.out.println("Nama: " + nama);
        System.out.println("Instruktur: " + instruktur);
        System.out.println("Kredit: " + kredit);
    }
}

// Subkelas: OnlineCourse mewarisi kelas Kursus
class OnlineCourse extends Kursus {
    String platform;
    int durasi;

    private final int ambangDurasi = 4;

    // Konstruktor untuk kelas OnlineCourse
    public OnlineCourse(String nama, String instruktur, int kredit, String platform, int durasi) {
        super(nama, instruktur, kredit); // Memanggil konstruktor kelas induk
        this.platform = platform;
        this.durasi = durasi;
    }

    // Metode untuk menampilkan detail kursus (mengganti metode kelas induk)
    @Override
    public void tampilkanDetailKursus() {
        super.tampilkanDetailKursus(); // Memanggil metode kelas induk
        System.out.println("Platform: " + platform);
        System.out.println("Durasi: " + durasi + " minggu");
    }

    // Metode untuk memeriksa kelayakan sertifikat
    public boolean memenuhiSyaratSertifikat() {
        return durasi >= ambangDurasi; // Memenuhi syarat jika durasi minimal 4 minggu
    }
}
public class Main {
    public static void main(String[] args) {
        // Membuat objek Kursus
        Kursus kursus1 = new Kursus("Pemrograman Berorientasi Objek", "Pak Budi", 3);
        kursus1.tampilkanDetailKursus();

        System.out.println(); // Baris kosong untuk memisahkan output

        // Membuat objek OnlineCourse
        OnlineCourse kursus2 = new OnlineCourse("Pembelajaran Mesin", "Bu Ani", 4, "Coursera", 8);
        kursus2.tampilkanDetailKursus();
        // Memeriksa kelayakan sertifikat
        if (kursus2.memenuhiSyaratSertifikat()) {
            System.out.println("Kursus ini memenuhi syarat untuk mendapatkan sertifikat.");
        } else {
            System.out.println("Kursus ini tidak memenuhi syarat untuk mendapatkan sertifikat.");
        }
    }
}
