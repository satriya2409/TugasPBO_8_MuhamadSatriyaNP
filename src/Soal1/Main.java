package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        // Membuat objek Faktorial
        Faktorial fk = new Faktorial(n);

        // Menampilkan hasil lewat method objek
        fk.tampilkanHasil();
    }
}

