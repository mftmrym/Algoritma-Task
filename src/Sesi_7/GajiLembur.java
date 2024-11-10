package Sesi_7;

import java.util.Scanner;

public class GajiLembur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiBulanan, jamLembur, totalLembur, upahPerJam;
        System.out.print("Masukkan gaji bulanan : ");
        gajiBulanan = sc.nextInt();
        System.out.print("Masukkan jam lembur : ");
        jamLembur = sc.nextInt();
        upahPerJam = gajiBulanan/173;
        if (jamLembur >= 4){
            totalLembur = gajiBulanan + (4*upahPerJam) + (4*2*upahPerJam);
            System.out.println("Total gaji  lembur : " + totalLembur);
        }else{
            totalLembur = gajiBulanan + (jamLembur*upahPerJam);
            System.out.println("Total gaji  lembur : " + totalLembur);
        }sc.close();
    }
}
