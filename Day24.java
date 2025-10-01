package coding100days;

import java.util.Scanner;

public class Day24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Minta pengguna memasukkan jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // Hitung luas lingkaran
        double luas = Math.PI * r * r;

        // Tampilkan hasil
        System.out.println("Luas lingkaran = " + luas);
    }
}
