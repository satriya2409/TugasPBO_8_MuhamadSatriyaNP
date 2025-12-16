package Soal3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        // Membuat objek
        konversiBiner kb = new konversiBiner(angka);

        // Menampilkan hasil
        kb.tampilkan();
    }
}

