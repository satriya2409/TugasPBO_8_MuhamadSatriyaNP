package Soal2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan basis: ");
        int b = input.nextInt();

        System.out.print("Masukkan eksponen: ");
        int e = input.nextInt();

        // membuat objek Power (kelas + objek)
        Power pw = new Power(b, e);

        // menampilkan hasil lewat objek
        pw.tampilkan();
    }
}
