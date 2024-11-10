package duasatu;

// Kelas induk yang merepresentasikan kendaraan secara umum.
class Kendaraan {
    // Atribut merek kendaraan.
    String merek;
    // Atribut model kendaraan.
    String model;
    // Atribut tahun pembuatan kendaraan.
    int tahun;

    // Konstruktor untuk menginisialisasi objek Kendaraan.
    public Kendaraan(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    // Metode untuk menampilkan detail kendaraan.
    public void tampilkanDetail() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
    }
}

// Kelas Mobil yang merupakan turunan dari kelas Kendaraan.
class Mobil extends Kendaraan {
    // Atribut ukuran bagasi mobil.
    int ukuranBagasi;

    // Konstruktor untuk menginisialisasi objek Mobil.
    public Mobil(String merek, String model, int tahun, int ukuranBagasi) {
        super(merek, model, tahun); // Memanggil konstruktor kelas induk.
        this.ukuranBagasi = ukuranBagasi;
    }

    // Override metode tampilkanDetail() untuk menampilkan detail mobil.
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail(); // Memanggil metode tampilkanDetail() dari kelas induk.
        System.out.println("Ukuran Bagasi: " + ukuranBagasi);
    }
}

// Kelas Truk yang merupakan turunan dari kelas Kendaraan.
class Truk extends Kendaraan {
    // Atribut kapasitas muatan truk.
    int kapasitasMuatan;

    // Konstruktor untuk menginisialisasi objek Truk.
    public Truk(String merek, String model, int tahun, int kapasitasMuatan) {
        super(merek, model, tahun); // Memanggil konstruktor kelas induk.
        this.kapasitasMuatan = kapasitasMuatan;
    }

    // Override metode tampilkanDetail() untuk menampilkan detail truk.
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail(); // Memanggil metode tampilkanDetail() dari kelas induk.
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan);
    }
}
