package Tugas_Sesi_12;

public class nilaiMaxArray {
    public static int findMaxNilai(int[] array, int  n, int max) {
        if (n == 0) {
            return max;
        }
        if (n > 0 ) {
            if (array[n] > max) {
                return findMaxNilai(array, n-1, array[n]);
            } else {
                return findMaxNilai(array, n-1, max);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int array[] = {1, 5, 20, 6, 15, 16, 19, 33, 25};
        int max = 0;
        int result = findMaxNilai(array, array.length - 1, max);
        System.out.println("Nilai Maksimum pada array = " + result);
    }
}