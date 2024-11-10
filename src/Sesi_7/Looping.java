package Sesi_7;

public class Looping {
    public static void main(String[] args) {
        for(int x=1;x <= 4; x++ ){
            for(int y=1;y <= 4; y++){
                if(y <= 4 - x){
                    System.out.print("S ");
                }else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
