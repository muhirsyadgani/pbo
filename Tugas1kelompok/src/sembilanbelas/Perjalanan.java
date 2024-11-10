package sembilanbelas;


import java.util.ArrayList;
import java.util.List;

public class Perjalanan {

    // Kelas untuk merepresentasikan data penerbangan
    static class Penerbangan {
        String nomorPenerbangan; // Nomor penerbangan
        String asal;             // Kota asal
        String tujuan;            // Kota tujuan
        String tanggal;            // Tanggal penerbangan (format: YYYY-MM-DD)
        int kursiTersedia;       // Jumlah kursi yang tersedia

        // Konstruktor untuk inisialisasi objek Penerbangan
        public Penerbangan(String nomorPenerbangan, String asal, String tujuan, String tanggal, int kursiTersedia) {
            this.nomorPenerbangan = nomorPenerbangan;
            this.asal = asal;
            this.tujuan = tujuan;
            this.tanggal = tanggal;
            this.kursiTersedia = kursiTersedia;
        }
    }

    // Kelas untuk merepresentasikan data hotel
    static class Hotel {
        String idHotel;       // ID unik untuk hotel
        String lokasi;         // Lokasi hotel
        int kamarTersedia;    // Jumlah kamar yang tersedia

        // Konstruktor untuk inisialisasi objek Hotel
        public Hotel(String idHotel, String lokasi, int kamarTersedia) {
            this.idHotel = idHotel;
            this.lokasi = lokasi;
            this.kamarTersedia = kamarTersedia;
        }
    }

    public static void main(String[] args) {
        // Data dummy untuk penerbangan
        List<Penerbangan> daftarPenerbangan = new ArrayList<>();
        daftarPenerbangan.add(new Penerbangan("GA231", "Jakarta", "Surabaya", "2023-12-25", 50));
        daftarPenerbangan.add(new Penerbangan("LA342", "Jakarta", "Denpasar", "2023-12-26", 30));

        // Data dummy untuk hotel
        List<Hotel> daftarHotel = new ArrayList<>();
        daftarHotel.add(new Hotel("H001", "Surabaya", 20));
        daftarHotel.add(new Hotel("H002", "Denpasar", 15));

        // Mencari dan menampilkan penerbangan yang tersedia
        String cariAsal = "Jakarta";          // Kota asal yang dicari
        String cariTujuan = "Surabaya";       // Kota tujuan yang dicari
        String cariTanggal = "2023-12-25";   // Tanggal penerbangan yang dicari
        System.out.println("Penerbangan yang tersedia:");
        for (Penerbangan penerbangan : daftarPenerbangan) {
            // Memeriksa apakah data penerbangan sesuai dengan kriteria pencarian
            if (penerbangan.asal.equals(cariAsal) && penerbangan.tujuan.equals(cariTujuan) && penerbangan.tanggal.equals(cariTanggal)) {
                System.out.println("Nomor Penerbangan: " + penerbangan.nomorPenerbangan + ", Kursi Tersedia: " + penerbangan.kursiTersedia);
            }
        }

        // Mencari dan menampilkan hotel yang tersedia
        String cariLokasi = "Surabaya";    // Lokasi hotel yang dicari
        System.out.println("Hotel yang tersedia:");
        for (Hotel hotel : daftarHotel) {
            // Memeriksa apakah data hotel sesuai dengan kriteria pencarian
            if (hotel.lokasi.equals(cariLokasi)) {
                System.out.println("ID Hotel: " + hotel.idHotel + ", Kamar Tersedia: " + hotel.kamarTersedia);
            }
        }
    }
}
