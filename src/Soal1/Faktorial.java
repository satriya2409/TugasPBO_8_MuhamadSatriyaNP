package Soal1;


// Kelas untuk menghitung faktorial
public class Faktorial {
    private int angka;        // data privat (encapsulation)
    private long hasil;       // menyimpan hasil faktorial

    // Konstruktor untuk mengisi nilai awal
    public Faktorial(int angka) {
        this.angka = angka;
        this.hasil = hitungFaktorial(); // langsung hitung
    }

    // Method proses perhitungan
    private long hitungFaktorial() {
        long temp = 1;
        for (int i = 1; i <= angka; i++) {
            temp *= i;
        }
        return temp;
    }

    // Method untuk menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }

    // Getter jika ingin mengambil hasil secara terpisah
    public long getHasil() {
        return hasil;
    }
}

