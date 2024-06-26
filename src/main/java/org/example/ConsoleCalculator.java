package org.example;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choiceFeature;
        int choiceMenu;

        while (true) {
            boolean goToShapeMenu;
            selectMenuUI();

            System.out.print("Pilih: ");
            choiceFeature = sc.nextInt();

            if (choiceFeature == 0) {
                System.out.println("THANK YOU!");
                sc.close();
                return;
            } else {
                goToShapeMenu = true;
            }

            while (goToShapeMenu) {
                selectShapeUI();
                System.out.print("Pilih: ");
                choiceMenu = sc.nextInt();

                if (choiceFeature == 1) {
                    switch (choiceMenu) {
                        case 0:
                            goToShapeMenu = false;
                            break;
                        case 1:
                            calculateSquareArea(sc);
                            break;
                        case 2:
                            calculateCircleArea(sc);
                            break;
                        case 3:
                            calculateTriangleArea(sc);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silahkan coba lagi!");
                    }
                }

            }
        }
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

    private static void calculateSquareArea(Scanner sc) {
        System.out.print("Masukkan panjang sisi (cm) : ");
        double side = sc.nextDouble();
        double squareArea = side * side;
        System.out.println("Luas persegi = " + squareArea);
    }

    private static void calculateCircleArea(Scanner sc) {
        System.out.print("Masukkan panjang jari-jari (cm) : ");
        double r = sc.nextDouble();
        double circleArea = Math.PI *  r * r;
        System.out.println("Luas lingkaran = " + circleArea);
    }

    private static void calculateTriangleArea(Scanner sc) {
        System.out.print("Masukkan panjang alas segitiga (cm) : ");
        double base = sc.nextDouble();
        System.out.print("Masukkan tinggi segitiga (cm) : ");
        double height = sc.nextDouble();
        double triangleArea = 0.5 * base * height;
        System.out.println("Luas segitiga : " + triangleArea);
    }
}