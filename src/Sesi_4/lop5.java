package Sesi_4;

public class lop5 {
    public static void main(String[] args) {
        int panjang = 16;
        int awal = 0, kedua = 1;
        
        System.out.print(awal+ " "+kedua+" ");

        for (int i = 2; i < panjang; i++) {
            int next = awal + kedua;

            System.out.print(next+ " ");

            awal = kedua;
            kedua = next;
        }
    }
}
