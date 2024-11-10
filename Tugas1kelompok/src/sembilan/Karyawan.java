package sembilan;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Karyawan {
    private String nama;
    private double gaji;
    private LocalDate tanggalPerekrutan;

    // Konstruktor
    public Karyawan(String nama, double gaji, LocalDate tanggalPerekrutan) {
        this.nama = nama;
        this.gaji = gaji;
        this.tanggalPerekrutan = tanggalPerekrutan;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    // Getter untuk tanggal perekrutan
    public LocalDate getTanggalPerekrutan() {
        return tanggalPerekrutan;
    }

    // Metode untuk menghitung tahun masa kerja
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period masaKerja = Period.between(tanggalPerekrutan, sekarang);
        return masaKerja.getYears();
    }

    // Main method untuk pengujian dengan input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Input data karyawan
        System.out.print("Masukkan nama karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan gaji karyawan: ");
        double gaji = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Masukkan tanggal perekrutan (format: tahun-bulan-tgl): ");
        String tanggal = scanner.nextLine();
        LocalDate tanggalPerekrutan = LocalDate.parse(tanggal, formatter);

        // Membuat objek karyawan
        Karyawan karyawan = new Karyawan(nama, gaji, tanggalPerekrutan);

        // Output data karyawan
        System.out.println("\nData Karyawan:");
        System.out.println("Nama Karyawan: " + karyawan.getNama());
        System.out.println("Gaji Karyawan: " + karyawan.getGaji());
        System.out.println("Tanggal Perekrutan: " + karyawan.getTanggalPerekrutan());
        System.out.println("Tahun Masa Kerja: " + karyawan.hitungMasaKerja() + " tahun");
    }
}