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
            } else if (choiceFeature == 1 || choiceFeature == 2){
                goToShapeMenu = true;
            } else {
                goToShapeMenu = false;
                System.out.println("Pilihan tidak valid. Silahkan coba lagi!");
            }

            while (goToShapeMenu) {
                if (choiceFeature == 1) {
                    selectShapeUI();
                    System.out.print("Pilih: ");
                    choiceMenu = sc.nextInt();

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
                } else if (choiceFeature == 2) {
                    selectSolidUI();
                    System.out.print("Pilih: ");
                    choiceMenu = sc.nextInt();

                    switch (choiceMenu) {
                        case 0:
                            goToShapeMenu = false;
                            break;
                        case 1:
                            calculateCubeVolume(sc);
                            break;
                        case 2:
                            calculateBlockVolume(sc);
                            break;
                        case 3:
                            calculateTubeVolume(sc);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silahkan coba lagi!");
                    }
                } else {
                    goToShapeMenu = false;
                    System.out.println("pilih 2 ini mah");
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

    private static void selectSolidUI() {
        System.out.println("-----------------------------------------");
        System.out.println("Pilih bangun ruang yang akan dihitung");
        System.out.println("-----------------------------------------");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
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

    private static void calculateTubeVolume(Scanner sc) {
        System.out.print("Masukkan jari-jari tabung (cm) : ");
        double r = sc.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm) : ");
        double height = sc.nextDouble();
        double tubeVolume = Math.PI *  r * height;
        System.out.println("Volume tabung = " + tubeVolume);
    }
  
    private static void calculateBlockVolume(Scanner sc) {
        System.out.print("Masukkan panjang balok (cm) : ");
        double length = sc.nextDouble();
        System.out.print("Masukkan lebar balok (cm) : ");
        double width = sc.nextDouble();
        System.out.print("Masukkan tinggi balok (cm) : ");
        double height = sc.nextDouble();
        double blockVolume = length * width * height;
        System.out.println("Volum balok : " + blockVolume);
    }
  
    private static void calculateCubeVolume(Scanner sc) {
        System.out.print("Masukkan panjang sisi (cm) : ");
        double side = sc.nextDouble();
        double cubeVolume = side * side * side;
        System.out.println("Volume kubus = " + cubeVolume);
    }
}