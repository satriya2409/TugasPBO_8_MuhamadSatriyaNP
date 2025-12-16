package Soal2;


public class Power {
    private int basis;       // disembunyikan (encapsulation)
    private int eksponen;
    private long hasil;

    // Constructor
    public Power(int basis, int eksponen) {
        this.basis = basis;
        this.eksponen = eksponen;
        this.hasil = hitung();       // langsung proses
    }

    // Method non-static (dipanggil lewat objek)
    private long hitung() {
        long temp = 1;
        for (int i = 1; i <= eksponen; i++) {
            temp *= basis;
        }
        return temp;
    }

    // Getter hasil
    public long getHasil() {
        return hasil;
    }

    // Method menampilkan hasil
    public void tampilkan() {
        System.out.println(basis + "^" + eksponen + " = " + hasil);
    }
}

