package Soal6;


public class Nilai {
    private double[] dataNilai;

    // Constructor menerima sejumlah nilai
    public Nilai(double... nilai) {
        this.dataNilai = nilai;
    }

    // Menghitung rata-rata dan mengembalikan OBJEK sebagai return
    public HasilRataRata hitungRataRata() {
        double total = 0;

        for (double n : dataNilai) {
            total += n;
        }

        double rata = total / dataNilai.length;

        return new HasilRataRata(rata); // return object
    }
}

