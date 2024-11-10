package tiga;

import java.util.Scanner;

public class Rectangle {
    private double lebar;
    private double tinggi;

    // Konstruktor untuk inisialisasi lebar dan tinggi
    public Rectangle(double lebar, double tinggi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Metode untuk menghitung luas persegi panjang
    public double hitungLuas() {
        return lebar * tinggi;
    }

    // Metode untuk menghitung keliling persegi panjang
    public double hitungKeliling() {
        return 2 * (lebar + tinggi);
    }

    // Getter dan Setter
    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi persegi panjang: ");
        double tinggi = scanner.nextDouble();

        // Membuat objek Rectangle dengan nilai input pengguna
        Rectangle rectangle = new Rectangle(lebar, tinggi);

        // Menampilkan hasil perhitungan luas dan keliling
        System.out.println("Luas: " + rectangle.hitungLuas());
        System.out.println("Keliling: " + rectangle.hitungKeliling());

        scanner.close();
    }
}