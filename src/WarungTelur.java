public class WarungTelur {
    public static void main(String[] args) {
        System.out.println("Hitunglah uang kembalian dari total telur yang dibeli");
        
        int HargaperKG = 28000;
        Double JumlahYangDibeli = 2.5;
        Double TotalHarga = (int) HargaperKG * JumlahYangDibeli;
        int UangYangDibayarkan = 100000;
        Double UangKembalian = (int) UangYangDibayarkan - TotalHarga;

        System.out.println("Harga/Kg nya adalah = RP."+HargaperKG+"");
        System.out.println("Jumlah yang akan dibeli adalah = "+JumlahYangDibeli+"KG");
        System.out.println("Total harga telur yang dibeli adalah = RP."+TotalHarga+"");
        System.out.println("Uang yang dibayarkan adalah = RP. "+UangYangDibayarkan+"");
        System.out.println("Jadi uang kembaliannya adalah = RP. "+UangKembalian+"");
    }
}
