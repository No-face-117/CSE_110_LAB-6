import java.util.Scanner;

public class As_6_Task_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string : ");
        String so = scan.nextLine();

        int size = so.length();

        int ak = 0, pk = 0, jk = 0;

        char shar , sick , que;

        String soso = "";

        boolean kiil ;

        if (so.charAt(0) == so.charAt(--size)) {
            kiil = true;
            for (int j = 0; j <= size; j++) {
                ++ak;
                --size;
                if (so.charAt(ak) == so.charAt(size)) {
                    kiil = true;
                }
                else{
                    kiil = false;
                    break;
                }
            }
            System.out.println();
           System.out.println(kiil);
        }
        else{
            kiil = false;
            System.out.println();
            System.out.println(kiil);
        }

        
       
        scan.close(); 
    }
}

