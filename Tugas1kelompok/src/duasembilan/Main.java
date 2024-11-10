package duasembilan;

class HewanPeliharaan {
    private String nama;
    private String spesies;
    int usia; // usia dalam tahun hewan

    public HewanPeliharaan(String nama, String spesies, int usia) {
        this.nama = nama;
        this.spesies = spesies;
        this.usia = usia;
    }

    public void tampilkanDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("Spesies: " + spesies);
        System.out.println("Usia: " + usia + " tahun");
    }

    public int hitungUsiaDalamTahunManusia() {
        return usia;
    }
}

class Anjing extends HewanPeliharaan {
    private String mainanFavorit;

    public Anjing(String nama, int usia, String mainanFavorit) {
        super(nama, "Anjing", usia);
        this.mainanFavorit = mainanFavorit;
    }

    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Mainan Favorit: " + mainanFavorit);
    }

    public int hitungUsiaDalamTahunManusia() {
        return usia * 7;
    }
}

class Burung extends HewanPeliharaan {
    private double rentangSayap;

    public Burung(String nama, int usia, double rentangSayap) {
        super(nama, "Burung", usia);
        this.rentangSayap = rentangSayap;
    }

    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Rentang Sayap: " + rentangSayap + " cm");
    }

    public int hitungUsiaDalamTahunManusia() {
        return usia * 5;
    }
}
public class Main {
    public static void main(String[] args) {

        Anjing anjing = new Anjing("asep", 3, "Bola");
        System.out.println("Detail Anjing:");
        anjing.tampilkanDetail();
        System.out.println("Usia dalam tahun manusia: " + anjing.hitungUsiaDalamTahunManusia() + " tahun");

        System.out.println();

        Burung burung = new Burung("jamal", 2, 25.5);
        System.out.println("Detail Burung:");
        burung.tampilkanDetail();
        System.out.println("Usia dalam tahun manusia: " + burung.hitungUsiaDalamTahunManusia() + " tahun");
    }
}


