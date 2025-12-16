package Soal3;


public class konversiBiner {
    private int angka;        // disembunyikan (encapsulation)
    private String biner;     // hasil konversi

    // Constructor
    public konversiBiner(int angka) {
        this.angka = angka;
        this.biner = ubahKeBiner();   // otomatis konversi saat objek dibuat
    }

    // Method untuk mengubah desimal ke biner
    private String ubahKeBiner() {
        if (angka == 0) {
            return "0";
        }

        String hasil = "";
        int n = angka;

        while (n > 0) {
            hasil = (n % 2) + hasil;  // simpan sisa bagi dari kanan ke kiri
            n /= 2;
        }

        return hasil;
    }

    // Getter hasil
    public String getBiner() {
        return biner;
    }

    // Menampilkan hasil
    public void tampilkan() {
        System.out.println("Bilangan biner dari " + angka + " = " + biner);
    }
}

