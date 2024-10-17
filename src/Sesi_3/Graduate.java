package Sesi_3;

import java.util.Scanner;

public class Graduate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Hasil = ");
        Double nilai = input.nextDouble();

        String Keterangan;
        if (nilai >= 75) {
            Keterangan = " Lulus ";

        } else {
            Keterangan = " Tidak Lulus ";
        }
        System.out.println(" Keterangan nilai tersebut = " + Keterangan);
        input.close();
    }
}