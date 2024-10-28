package Sesi_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas2 {
    static ArrayList<ArrayList<String>> Buah = new ArrayList<>();
    static ArrayList<String> NamaBuah = new ArrayList<>();
    static ArrayList<Integer> JumlahBuah = new ArrayList<>();
    static ArrayList<Integer> HargaBuah = new ArrayList<>();
    static int TotalBelanja = 0;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> Buah1 = new ArrayList<>();
        Buah1.add("Apel");
        Buah1.add("35000");
        Buah.add(Buah1);

        ArrayList<String> Buah2 = new ArrayList<>();
        Buah2.add("jeruk");
        Buah2.add("50000");
        Buah.add(Buah2);

        ArrayList<String> Buah3 = new ArrayList<>();
        Buah3.add("Mangga");
        Buah3.add("25000"); 
        Buah.add(Buah3);

        ArrayList<String> Buah4 = new ArrayList<>();
        Buah4.add("Duku");
        Buah4.add("15000");
        Buah.add(Buah4);

        ArrayList<String> Buah5 = new ArrayList<>();
        Buah5.add("Semangka");
        Buah5.add("20000");
        Buah.add(Buah5);

        int Pilihan = 1;
        String InputLagi = "y";
        do {
            System.out.println("Menu");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3, Keluar");
            System.out.print(" Masukan Pilihan : ");
            Pilihan = inp.nextInt();
            inp.nextLine();
            if (Pilihan == 3 ) {
                System.out.println("Anda Telah Keluar Dari Program!");
                break;
            }
            switch (Pilihan) {
                case 1:
                    System.out.println("Buat Yang Tersedia : ");
                    for (int i = 0; i <=4; i++) {
                        String nama = Buah.get(i).get(0);
                        System.out.println(1 + i +". "+ nama);
                    }
                    System.out.print("Buah yang ingin dibeli : ");
                    int pilihBuah = inp.nextInt();
                    inp.nextLine();
                    pilihBuah -= 1;

                    if (pilihBuah >= 0 && pilihBuah > Buah.size()) {
                        System.out.print(" Masukan Jumlah = ");
                        int Jumlah = inp.nextInt();
                        inp.nextLine();

                        String nama = Buah.get(pilihBuah).get(0);
                        int harga = Integer.parseInt(Buah.get(pilihBuah).get(1));
                        int SubTotal = Jumlah + harga;

                        NamaBuah.add(nama);
                        JumlahBuah.add(Jumlah);
                        HargaBuah.add(harga);
                        TotalBelanja += SubTotal;

                        System.out.println("Buah telah ditambahkan kedalam ranjang");
                    } else {
                        System.out.println("Masukan berupa angka = ");
                    }
                    break;
                case 2: 
                    if (NamaBuah.isEmpty()) {
                        System.out.println("Anda belum Membeli apa-apa =");
                        return;
                    }
                    System.out.println("Daftar Belanja");
                    System.out.println(" = " .repeat(30));
                    System.out.println("No. \tNama Buah\tJumlah\tHarga\tSubtotal");

                    for (int i = 0; i < NamaBuah.size(); i++) {
                        String Nama  = NamaBuah.get(i);
                        int Jumlah = JumlahBuah.get(i);
                        int Harga = HargaBuah.get(i);
                        int SubTotal = Jumlah * Harga;

                        System.out.println(i + 1 +"\t" + Nama +"\t" + Jumlah + "\t" + Harga + "\t" + SubTotal);
                    }

                    System.out.println(" = ".repeat(30));
                    System.out.println(" Total "+ TotalBelanja);
                    Double  Diskon = TotalBelanja * 0.15;
                    System.out.println("Total Discount(15%)"+ Diskon);
                    Double TotalBayar = TotalBelanja - Diskon;
                    System.out.println("Total Yang Harus dibayar = "+ TotalBayar);
                    break;

                default:
                    System.out.println(" Masukan pilihan yang sudah tersedia : ");
                    break;
            }
        }while (InputLagi.equals("y"));
    }
}
