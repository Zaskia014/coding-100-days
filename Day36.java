package coding100days;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai: ");
        int nilai = input.nextInt();
        System.out.print("Absensi: ");
        int absensi = input.nextInt();

        if (nilai >= 75) {
            if (absensi >= 80) {
                System.out.println("Lulus");
            } else {
                System.out.println("Gagal karena absensi kurang");
            }
        } else {
            System.out.println("Gagal karena nilai kurang");
        }

        input.close();
    }
}
