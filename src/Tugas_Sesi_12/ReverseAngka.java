package Tugas_Sesi_12;

public class ReverseAngka {
    public static void printReverse(int n) {
        if (n < 1) {
            return;
        } else {
            System.out.print(n +" , ");
            printReverse(n-1);
        }
    }
    public static void main(String[] args) {
        int angka = 5;
        printReverse(angka);
    }
}
