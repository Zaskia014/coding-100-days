package coding100days;

import java.util.Scanner;

public class Day23 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.print("panjang : ");
        int P = a.nextInt();

        System.out.print("lebar :");
        int L = a.nextInt();

        int luas = P * L;

        System.out.println("hasil : " + luas);

    }

}
