package org.example;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            selectMenuUI();
            System.out.println("Pilih: ");
            int choiceFeature = sc.nextInt();

            if (choiceFeature != 1 || choiceFeature != 2) {
                sc.close();
                return;
            }

            while (true) {
                selectShapeUI();
            }
        }

//        sc.close();
    }

    private static void selectMenuUI() {
        System.out.println("-----------------------------------------");
        System.out.println("Kalkulator Penghitung Luas dan Volum");
        System.out.println("-----------------------------------------");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Volum");
        System.out.println("0. Tutup Aplikasi");
    }

    private static void selectShapeUI() {
        System.out.println("-----------------------------------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("-----------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Kembali ke menu sebelumnya");
    }
}
