package tujuh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Akun {
    private String nomorAkun, namaPemilik;
    private double saldo;

    public Akun(String nomorAkun, String namaPemilik, double saldoAwal) {
        this.nomorAkun = nomorAkun;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    public String getNomorAkun() { return nomorAkun; }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + saldo);
        } else {
            System.out.println("Jumlah penarikan tidak valid atau saldo tidak mencukupi.");
        }
    }

    @Override
    public String toString() {
        return "Nomor Akun: " + nomorAkun + ", Nama Pemilik: " + namaPemilik + ", Saldo: " + saldo;
    }
}

class Bank {
    private List<Akun> koleksiAkun = new ArrayList<>();

    public void tambahAkun(Akun akun) {
        koleksiAkun.add(akun);
        System.out.println("Akun berhasil ditambahkan: " + akun);
    }

    public void hapusAkun(String nomorAkun) {
        boolean ditemukan = koleksiAkun.removeIf(akun -> akun.getNomorAkun().equals(nomorAkun));
        System.out.println(ditemukan ? "Akun dengan nomor " + nomorAkun + " berhasil dihapus." : "Akun tidak ditemukan.");
    }

    public Akun cariAkun(String nomorAkun) {
        return koleksiAkun.stream().filter(akun -> akun.getNomorAkun().equals(nomorAkun)).findFirst().orElse(null);
    }

    public void tampilkanSemuaAkun() {
        if (koleksiAkun.isEmpty()) {
            System.out.println("Tidak ada akun di bank.");
        } else {
            System.out.println("\nDaftar Akun di Bank:");
            koleksiAkun.forEach(System.out::println);
        }
    }
}

public class Main {
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nMenu:\n1. Tambah Akun\n2. Hapus Akun\n3. Setor Uang\n4. Tarik Uang\n5. Tampilkan Semua Akun\n6. Keluar\nPilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) tambahAkun(scanner);
            else if (pilihan == 2) hapusAkun(scanner);
            else if (pilihan == 3) setorUang(scanner);
            else if (pilihan == 4) tarikUang(scanner);
            else if (pilihan == 5) bank.tampilkanSemuaAkun();
            else if (pilihan == 6) break;
            else System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
        scanner.close();
    }

    private static void tambahAkun(Scanner scanner) {
        System.out.print("Masukkan Nomor Akun: ");
        String nomorAkun = scanner.nextLine();
        System.out.print("Masukkan Nama Pemilik: ");
        String namaPemilik = scanner.nextLine();
        System.out.print("Masukkan Saldo Awal: ");
        double saldoAwal = scanner.nextDouble();
        bank.tambahAkun(new Akun(nomorAkun, namaPemilik, saldoAwal));
    }

    private static void hapusAkun(Scanner scanner) {
        System.out.print("Masukkan Nomor Akun yang ingin dihapus: ");
        bank.hapusAkun(scanner.nextLine());
    }

    private static void setorUang(Scanner scanner) {
        System.out.print("Masukkan Nomor Akun untuk setoran: ");
        Akun akun = bank.cariAkun(scanner.nextLine());
        if (akun != null) {
            System.out.print("Masukkan jumlah setoran: ");
            akun.setor(scanner.nextDouble());
        } else {
            System.out.println("Akun tidak ditemukan.");
        }
    }

    private static void tarikUang(Scanner scanner) {
        System.out.print("Masukkan Nomor Akun untuk penarikan: ");
        Akun akun = bank.cariAkun(scanner.nextLine());
        if (akun != null) {
            System.out.print("Masukkan jumlah penarikan: ");
            akun.tarik(scanner.nextDouble());
        } else {
            System.out.println("Akun tidak ditemukan.");
        }
    }
}
