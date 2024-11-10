package tujuhbelas;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String sultradara;
    private ArrayList<String> ulasan;
    //Ketiga baris ini mendefinisikan atribut title (judul film),
    // director (nama sutradara), dan reviews (daftar ulasan film).
    //title dan director adalah tipe data String, sementara reviews
    // adalah ArrayList dari String yang menyimpan beberapa ulasan film

    public Movie(String title, String sultradara) {
        this.title = title;
        this.sultradara = sultradara;
        this.ulasan = new ArrayList<>();
    }
    //Ini adalah konstruktor kelas Movie.
    // Konstruktor ini digunakan saat membuat objek baru dari kelas Movie.
    //title dan director diberikan nilai saat objek dibuat,
    // dan nilai tersebut disimpan dalam atribut title dan director.
    //this.reviews = new ArrayList<>(); membuat objek ArrayList kosong untuk menyimpan ulasan.

    // Menambahkan ulasan
    public void addReview(String review) {
        ulasan.add(review);
    }

    // Mendapatkan ulasan
    public ArrayList<String> getUlasan() {
        return ulasan;
    }

    // Menampilkan informasi film
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Sultradara: " + sultradara);
        System.out.println("Ulasan: " + ulasan);
    }

    public static void main(String[] args) {
        // Membuat objek Movie
        Movie movie = new Movie("Kuntil Anak", "Zatnika Maulana");

        // Menambahkan ulasan
        movie.addReview("menegangkan");
        movie.addReview("kerenn");

        // Menampilkan informasi film
        movie.displayInfo();
    }
}