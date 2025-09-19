package coding100days;

import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String nama, alamat, hobi;
        int umur;

        // Input data dari user
        System.out.print("Masukkan Nama   : ");
        nama = input.nextLine();

        System.out.print("Masukkan Umur   : ");
        umur = input.nextInt();
        input.nextLine(); // membersihkan buffer enter

        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();

        System.out.print("Masukkan Hobi   : ");
        hobi = input.nextLine();

        // Output data biodata
        System.out.println("\n===== BIODATA ANDA =====");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);
        System.out.println("Hobi   : " + hobi);

        input.close();
    }
}
