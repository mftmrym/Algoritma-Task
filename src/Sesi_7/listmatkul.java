package Sesi_7;

import java.util.ArrayList;
import java.util.Scanner;

public class listmatkul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matkul[][] = {{"PS010","Dasar Shalih Akram"},
                            {"PS0102","Teologi Aswaja"},
                            {"PS0104","Civic Education"},
                            {"PS0201","Ulumul Qur'an"},
                            {"PS0203","Pemikiran Keuangan"},
                            {"PS0205","Bahasa Arab I"},
                            {"PS0207","Bahasa Inggris I"},
                            {"PS0209","Pengntr Ekonomi M"},
                            {"PS0218","Manajemen Syariah"},
                            {"PS0227","Pengantar Filsafat"},
                            {"PS0416","Bahasa Indonesia"}};
        ArrayList<Double> listNilai = new ArrayList<>();
        ArrayList<Integer> listSKS = new ArrayList<>();
        ArrayList<String> listMatkul = new ArrayList<>();
        ArrayList<String> listKodeMatkul = new ArrayList<>();
        System.out.print("Masukan Nama Mahasiswa: ");
        String inputNama = sc.nextLine();
        System.out.print("Masukan Semester: ");
        int inputSemester = sc.nextInt();
        String inputData = "y";
        int i = 0;
        do{
            System.out.print("Pilih Matkul (0-10): ");
            int indexMatkul = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukan SKS: ");
            int inputSKS = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukan Nilai: ");
            double inputNilai = sc.nextDouble();
            sc.nextLine();
            if (indexMatkul >= 0 && indexMatkul < matkul.length) {
                String namaMatkul = matkul[indexMatkul][1];
                String kodeMatkul = matkul[indexMatkul][0];
                listMatkul.add(namaMatkul);
                listKodeMatkul.add(kodeMatkul);
                listNilai.add(inputNilai);
                listSKS.add(inputSKS);
            }else{
                System.out.println("Pilih tidak valid!");
            }System.out.print("Input lagi?: (y/n) ");
            inputData = sc.nextLine();
            i++;
        }while(i<matkul.length && inputData.equalsIgnoreCase("y"));
        sc.close();
        System.out.println("\nNama Mahasiswa: "+inputNama);
        System.out.println("Semester: "+inputSemester);
        System.out.println("""
                        ===========================================================================================================================
                        No \t\t KODE \t\t MATA KULIAH \t\t SKS \t\t Huruf Mutu \t\t Bobot \t\t Nilai
                        ---------------------------------------------------------------------------------------------------------------------------
                        """);
        int x = 1;
        int totalSKS = 0;
        double totalBobotNilai = 0.0;
        for (int y = 0; y < listMatkul.size(); y++) {
            String namaMatkul = listMatkul.get(y);
            String kodeMatkul = listKodeMatkul.get(y);
            double outNilai = listNilai.get(y);
            String hurufMutu;
            double bobot;
            int outSKS = listSKS.get(y);
            if(outNilai == 100){
                hurufMutu = "A+";
                bobot = 4.00;
            }else if(outNilai >= 90){
                hurufMutu = "A";
                bobot = 3.75;
            }else if(outNilai >= 85){
                hurufMutu = "A-";
                bobot = 3.50;
            }else if(outNilai >= 78){
                hurufMutu = "B+";
                bobot = 3.25;
            }else if(outNilai >= 72 ){
                hurufMutu = "B";
                bobot = 3.00;
            }else if(outNilai >= 68 ){
                hurufMutu = "B-";
                bobot = 2.75;
            }else if(outNilai >= 50 ){
                hurufMutu = "C";
                bobot = 2.50;
            }else if(outNilai >= 35 ){
                hurufMutu = "D";
                bobot = 2.00;
            }else{
                hurufMutu = "E";
                bobot = 1.00;
            }
            totalSKS += outSKS;
            totalBobotNilai += (bobot * outSKS);
            System.out.println((x++)+"\t\t"+kodeMatkul+"\t\t"+namaMatkul+"\t\t"+outSKS+"\t\t"+hurufMutu+"\t\t"+bobot+"\t\t"+outNilai);
        }System.out.println("============================================================================================================================");
        double ipSemester = totalBobotNilai / totalSKS;
        System.out.println("Jumlah SKS : " + totalSKS);
        System.out.println("IP. Semester: " + ipSemester);
        System.out.println("SKS Maksimal yg bisa diambil semester depan: 24");
    }
}
