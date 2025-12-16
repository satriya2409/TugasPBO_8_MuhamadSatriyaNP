package Soal6;


public class Main {
    public static void main(String[] args) {

        // Mengirim beberapa nilai ke constructor
        Nilai nilaiMahasiswa = new Nilai(80, 90, 75, 85, 95);

        // Mendapatkan hasil rata-rata sebagai OBJEK
        HasilRataRata hasil = nilaiMahasiswa.hitungRataRata();

        // Tampilkan hasil
        hasil.tampilkan();
    }
}

