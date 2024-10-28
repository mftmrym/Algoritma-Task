package Sesi_5;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        String Mahasiswa[] = new String[100];
        int Nilai[] = new int[100];

        Scanner sc = new Scanner(System.in);
        String InputData = "y";
        int i = 0;

        do {
            System.out.print("Masukan Nama : ");
            Mahasiswa[i] = sc.nextLine();

            System.out.print("Masukan Nilai : ");
            Nilai[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Input Lagi? : ");
            InputData = sc.nextLine();
            i++;
        } while (i < Mahasiswa.length && InputData.equalsIgnoreCase("y"));
        sc.close();

        System.out.println("\nMasukan Jumlah Data : " + i);
        System.out.println(" ");
        int l = 1;
        for (int j = 0; j < Mahasiswa.length; j++) {
            if (Mahasiswa[j] != null) {
                System.out.println("----------------------------------------------------");
                System.out.println("Mahasiswa Ke : " + (l++));
                System.out.println("Nama Mahasiswa : " + Mahasiswa[j]);
                System.out.println("Nilai : " + Nilai[j]);
            }
        }
    }
}