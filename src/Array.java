public class Array {
    public static void main(String[] args) throws Exception {
        String Mahasiswa[] = new String[5];
        Mahasiswa[0] = "Abdullah";
        Mahasiswa[1] = "Mifta";
        Mahasiswa[2] = "Luqman";
        Mahasiswa[3] = "Emiip";
        Mahasiswa[4] = "Lukeem";
        int Number[] = {
            1, 2, 5, 9, 11, 15, 20, 25, 30, 35
        };
        System.out.println(Number.length);
        System.out.println(Mahasiswa[3]);

        for (int i=0; i<Mahasiswa.length; i++){
            System.out.println(Mahasiswa[1]+" ");
        }
    }
}
