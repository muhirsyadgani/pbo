package limabelas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {

    private List<String> songs = new ArrayList<>();

    // Metode untuk menambah lagu ke dalam library
    public void addSong(String songTitle) {
        songs.add(songTitle);
        System.out.println(songTitle + " telah ditambahkan ke library.");
    }

    // Metode untuk menghapus lagu dari library
    public void removeSong(String songTitle) {
        if (songs.contains(songTitle)) {
            songs.remove(songTitle);
            System.out.println(songTitle + " telah dihapus dari library.");
        } else {
            System.out.println(songTitle + " tidak ditemukan di library.");
        }
    }

    // Metode untuk memutar lagu acak dari library
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("Library kosong. Tidak ada lagu untuk diputar.");
        } else {
            Random rand = new Random();
            int randomIndex = rand.nextInt(songs.size());
            String randomSong = songs.get(randomIndex);
            System.out.println("Memutar lagu: " + randomSong);
        }
    }

    public static void main(String[] args) {
        // Membuat objek MusicLibrary
        MusicLibrary myLibrary = new MusicLibrary();

        // Menambahkan lagu ke library
        myLibrary.addSong("Lagu A");
        myLibrary.addSong("Lagu B");
        myLibrary.addSong("Lagu C");

        // Menghapus lagu dari library
        myLibrary.removeSong("Lagu B");

        // Memutar lagu acak
        myLibrary.playRandomSong();
        myLibrary.playRandomSong();
    }
}
