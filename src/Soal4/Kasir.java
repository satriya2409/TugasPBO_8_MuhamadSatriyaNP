package Soal4;


public class Kasir {
    private double hargaBarang;
    private int jumlahBarang;
    private double diskon; // dalam persen
    private double totalBayar;

    // Constructor 1: hanya harga barang (jumlah = 1, diskon = 0)
    public Kasir(double hargaBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = 1;
        this.diskon = 0;
        hitungTotal();
    }

    // Constructor 2: harga barang + jumlah barang (diskon = 0)
    public Kasir(double hargaBarang, int jumlahBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = 0;
        hitungTotal();
    }

    // Constructor 3: harga barang + jumlah barang + diskon
    public Kasir(double hargaBarang, int jumlahBarang, double diskon) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = diskon;
        hitungTotal();
    }

    // Method menghitung total harga
    private void hitungTotal() {
        double subtotal = hargaBarang * jumlahBarang;
        double potongan = subtotal * (diskon / 100);
        this.totalBayar = subtotal - potongan;
    }

    // Menampilkan informasi transaksi
    public void tampilkan() {
        System.out.println("=== DETAIL PEMBELIAN ===");
        System.out.println("Harga Barang     : " + hargaBarang);
        System.out.println("Jumlah Barang    : " + jumlahBarang);
        System.out.println("Diskon (%)       : " + diskon);
        System.out.println("Total Bayar      : " + totalBayar);
    }

    // Getter jika ingin mengambil total bayar
    public double getTotalBayar() {
        return totalBayar;
    }
}
