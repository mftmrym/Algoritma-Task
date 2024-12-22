package Tugas_Sesi_12;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrome(String str, int star, int end) {
        if (star >= end){
            System.out.println(str + " ini adalah Palindrome.");
            return true;
        }
        if (str.charAt(star) !=str.charAt(end)){
            System.out.println(str + " ini bukan Palindrome");
            return false;
        }
        if (str.charAt(star)==str.charAt(end)) {
            return isPalindrome(str, star+1, end-1);
        }
        return false;
    }
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukan sebuah kata : ");
            String str = scan.next();
            isPalindrome(str, 0, str.length()-1);
    }
}