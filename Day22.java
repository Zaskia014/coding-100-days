package coding100days;

import java.util.Scanner;

public class Day22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan panjang sisi persegi : ");
        int sisi = sc.nextInt();

        int luas = sisi * sisi;

        System.out.println("luas persegi :" + luas);

        sc.close();

    }
}
