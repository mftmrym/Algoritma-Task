package Sesi_3;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukan Angka =");
        int Angka = inputan.nextInt();

        if (Angka % 2 ==0) {
            System.out.println(Angka + " Angka tersebut adalah bilangan Genap");
        }else {
            System.out.println(Angka + " Angka tesebut adalah bilangan Ganjil ");
        }
        inputan.close();
    }
}
