package Sesi_3;

import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) {
        int seratusribu, limapuluhribu, duapuluhribu, sepuluhribu, limaribu, duaribu, seribu, limaperak, seperak;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang: ");
        int jumlahUang = input.nextInt();

        if (jumlahUang >= 100000) {
            seratusribu = jumlahUang / 100000;
            jumlahUang = jumlahUang % 100000;
            System.out.println("100ribuan : " +seratusribu);
        }
        if (jumlahUang >= 50000) {
            limapuluhribu = jumlahUang / 50000;
            jumlahUang = jumlahUang % 50000;
            System.out.println("50ribuan : " +limapuluhribu);
        }
        if (jumlahUang >= 20000) {
            duapuluhribu = jumlahUang / 20000;
            jumlahUang = jumlahUang % 20000;
            System.out.println("20ribuan : " +duapuluhribu);
        }
        if (jumlahUang >= 10000) {
            sepuluhribu = jumlahUang / 10000;
            jumlahUang = jumlahUang % 10000;
            System.out.println("10ribuan : " +sepuluhribu);
        }
        if (jumlahUang >= 5000) {
            limaribu = jumlahUang / 5000;
            jumlahUang = jumlahUang % 5000;
            System.out.println("5ribuan : " +limaribu);
        }
        if (jumlahUang >= 2000) {
            duaribu = jumlahUang / 2000;
            jumlahUang = jumlahUang % 2000;
            System.out.println("2ribuan : " +duaribu);
        }
        if (jumlahUang >= 1000) {
            seribu = jumlahUang / 1000;
            jumlahUang = jumlahUang % 1000;
            System.out.println("2ribuan : " +seribu);
        }
        if (jumlahUang >= 500) {
            limaperak = jumlahUang / 500;
            jumlahUang = jumlahUang % 500;
            System.out.println("500perak : " +limaperak);
        }
        if (jumlahUang >= 100) {
            seperak = jumlahUang / 100;
            jumlahUang = jumlahUang % 100;
            System.out.println("500perak : " +seperak);
        }
        input.close();
    }
}
