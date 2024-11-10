package dualima;

public class Main {
    public static void main(String[] args) {
        // Membuat objek bangunan hunian
        ResidentialBuilding residentialBuilding = new ResidentialBuilding("Jalan Mawar No. 10", 10, 3000, 100, 5000000);
        System.out.println("Detail Bangunan Hunian:");
        residentialBuilding.tampilkanDetail();

        System.out.println("\n");

        // Membuat objek bangunan komersial
        CommercialBuilding commercialBuilding = new CommercialBuilding("Jalan Melati No. 20", 20, 5000, 50, 200000);
        System.out.println("Detail Bangunan Komersial:");
        commercialBuilding.tampilkanDetail();
    }
}
