package dualima;

class Building {
    // Atribut dasar untuk bangunan
    private String alamat;
    private int jumlahLantai;
    private double totalLuas; // dalam meter persegi

    // Konstruktor untuk kelas Building
    public Building(String alamat, int jumlahLantai, double totalLuas) {
        this.alamat = alamat;
        this.jumlahLantai = jumlahLantai;
        this.totalLuas = totalLuas;
    }

    // Getter dan setter
    public String getAlamat() {
        return alamat;
    }

    public int getJumlahLantai() {
        return jumlahLantai;
    }

    public double getTotalLuas() {
        return totalLuas;
    }

    // Metode untuk menampilkan detail bangunan
    public void tampilkanDetail() {
        System.out.println("Alamat: " + alamat);
        System.out.println("Jumlah Lantai: " + jumlahLantai);
        System.out.println("Total Luas: " + totalLuas + " m²");
    }
}

class ResidentialBuilding extends Building {
    // Atribut tambahan untuk bangunan hunian
    private int jumlahApartemen;
    private double tarifSewaPerApartemen; // dalam satuan mata uang per bulan

    // Konstruktor untuk kelas ResidentialBuilding
    public ResidentialBuilding(String alamat, int jumlahLantai, double totalLuas, int jumlahApartemen, double tarifSewaPerApartemen) {
        super(alamat, jumlahLantai, totalLuas);
        this.jumlahApartemen = jumlahApartemen;
        this.tarifSewaPerApartemen = tarifSewaPerApartemen;
    }

    // Metode untuk menghitung total sewa bulanan dari semua apartemen
    public double hitungTotalSewa() {
        return jumlahApartemen * tarifSewaPerApartemen;
    }

    // Override metode untuk menampilkan detail bangunan hunian
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Jumlah Apartemen: " + jumlahApartemen);
        System.out.println("Tarif Sewa per Apartemen: " + tarifSewaPerApartemen);
        System.out.println("Total Sewa Bulanan: " + hitungTotalSewa());
    }
}

class CommercialBuilding extends Building {
    // Atribut tambahan untuk bangunan komersial
    private int jumlahRuangKantor;
    private double tarifSewaPerMeter; // tarif sewa per meter persegi per bulan

    // Konstruktor untuk kelas CommercialBuilding
    public CommercialBuilding(String alamat, int jumlahLantai, double totalLuas, int jumlahRuangKantor, double tarifSewaPerMeter) {
        super(alamat, jumlahLantai, totalLuas);
        this.jumlahRuangKantor = jumlahRuangKantor;
        this.tarifSewaPerMeter = tarifSewaPerMeter;
    }

    // Metode untuk menghitung total sewa bulanan dari ruang kantor
    public double hitungTotalSewa() {
        return getTotalLuas() * tarifSewaPerMeter;
    }

    // Override metode untuk menampilkan detail bangunan komersial
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Jumlah Ruang Kantor: " + jumlahRuangKantor);
        System.out.println("Tarif Sewa per Meter Persegi: " + tarifSewaPerMeter);
        System.out.println("Total Sewa Bulanan: " + hitungTotalSewa());
    }
}


