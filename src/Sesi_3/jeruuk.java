package Sesi_3;

import java.util.Scanner;

public class jeruuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah buah jeruk: ");
        int jumlahJeruk = input.nextInt();

        int harga5Jeruk = 10000, harga2Jeruk = 5000, harga1Jeruk = 3000;
        int totalHarga = 0;

        if (jumlahJeruk >= 5) {
            int paket5Jeruk = jumlahJeruk / 5;
            totalHarga += paket5Jeruk * harga5Jeruk;
            jumlahJeruk = jumlahJeruk % 5;
        }

        if (jumlahJeruk >= 2) {
            int paket2Jeruk = jumlahJeruk / 2;
            totalHarga += paket2Jeruk * harga2Jeruk;
            jumlahJeruk = jumlahJeruk % 2;
        }

        if (jumlahJeruk >= 1) {
            totalHarga += jumlahJeruk * harga1Jeruk;
        }

        System.out.println("Total harga yang harus dibayar : " + totalHarga);
        input.close();
    }
}
