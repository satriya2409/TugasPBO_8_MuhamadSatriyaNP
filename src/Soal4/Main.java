package Soal4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KASIR ===");
        System.out.println("1. Hanya harga barang");
        System.out.println("2. Harga barang + jumlah");
        System.out.println("3. Harga barang + jumlah + diskon");
        System.out.print("Pilih menu: ");
        int menu = input.nextInt();
        
        Kasir k;

        switch (menu) {
            case 1:
                System.out.print("Masukkan harga barang: ");
                double h1 = input.nextDouble();
                k = new Kasir(h1);
                k.tampilkan();
                break;

            case 2:
                System.out.print("Masukkan harga barang: ");
                double h2 = input.nextDouble();
                System.out.print("Masukkan jumlah barang: ");
                int j2 = input.nextInt();
                k = new Kasir(h2, j2);
                k.tampilkan();
                break;

            case 3:
                System.out.print("Masukkan harga barang: ");
                double h3 = input.nextDouble();
                System.out.print("Masukkan jumlah barang: ");
                int j3 = input.nextInt();
                System.out.print("Masukkan diskon (%): ");
                double d3 = input.nextDouble();
                k = new Kasir(h3, j3, d3);
                k.tampilkan();
                break;

            default:
                System.out.println("Menu tidak valid.");
        }
    }
}

