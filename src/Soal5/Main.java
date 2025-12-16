package Soal5;


public class Main {
    public static void main(String[] args) {

        // Membuat objek persegi panjang luar
        PersegiPanjang luar = new PersegiPanjang(10, 5);

        // Membuat objek persegi panjang dalam
        PersegiPanjang dalam = new PersegiPanjang(8, 4);

        // Menghitung luas hitam menggunakan objek sebagai parameter
        double luasHitam = HitungBidangHitam.hitungLuasHitam(luar, dalam);

        System.out.println("Luas bidang hitam adalah: " + luasHitam);
    }
}

