import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        int sayi1=0;
        int total =0;
        Scanner inp = new Scanner(System.in);
        do{
            System.out.print("SAYI GİRİNİZ : ");
            sayi1= inp .nextInt();
            if( sayi1 % 2 ==0 && sayi1 % 4 ==0){
                total+=sayi1;
            }
            else if (sayi1 % 2 == 1 && sayi1 % 4 ==1){
                continue;
            }
        }
        while(sayi1 % 2 == 0);
        System.out.println(total);

    }
}
