package coding100days;

public class Day34 {

    public static void main(String[] args) {
        int nilai = 70;
        int absensi = 85;

        // Kombinasi operator logika
        boolean lulus = (nilai >= 75 && absensi >= 80) || (absensi == 100);

        System.out.println("Apakah siswa lulus? " + lulus);
    }
}
