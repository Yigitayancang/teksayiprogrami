import java.util.Scanner;
public class pratik {
    public static void main(String[] args) {
        int sayi;
        int total =0;
        Scanner inp = new Scanner(System.in);
        do{
            System.out.print(" BİR SAYI GİRİNİZ : ");
            sayi = inp.nextInt();

            if( sayi % 2 ==0){
                total+=sayi;
            }
        }
        while(sayi > 0);
        System.out.print("TOPLAM : " + total);
    }

    
    
}