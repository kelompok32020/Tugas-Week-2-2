import java.util.Scanner ;
public class SPLSVFIX {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sistem Persamaan Linier Satu Variabel");
        
                System.out.println("Masukkan variabel (a) = ");
                float a = input.nextInt();
        
                System.out.println("Masukkan konstanta (c)         = ");
                float c = input.nextInt();
        
        float y;
        y = c / a;
        
        System.out.println("sehingga (a) = " + y);
    }
}