package Soal7;

class Deret {
    public void generate(int[] data) {
        for (int i = 1; i < data.length; i++) {
            data[i] = data[i - 1] * 2;   // Pass-by-reference: array dimodifikasi langsung
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] deret = new int[5];
        deret[0] = 6;

        Deret d = new Deret();
        d.generate(deret);   // Pass-by-reference

        System.out.print("Deret: ");
        for (int angka : deret) {
            System.out.print(angka + " ");
        }
    }
}
