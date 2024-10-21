package Sesi_4;

public class lop3 {
    public static void main(String[] args) {
        int angka = 1;

        for (int i = 0; i < 16; i++) {
            System.out.print(angka+" ");

            angka += (2 * i);
        }
    }
}
// 1 1 3 7 13 21 31 43 57 73 91 111 133 157 183 211