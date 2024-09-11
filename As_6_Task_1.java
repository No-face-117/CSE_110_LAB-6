import java.util.Scanner;

public class As_6_Task_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string : ");
        String so = scan.nextLine();

        int size = so.length();

        int ak = 0, pk = 0, jk = 0;

        char shar , sick , que;

        String soso = "";

        for (int i = 0; i < size; i++) {
            shar = so.charAt(i);

            if (shar >= 'a' && shar <= 'z') {
                sick = (char) (shar - 32);
                soso+=sick;

            }
            else{
                que = shar;
                soso+=que;
            }
        }

        System.out.println(soso);
       
        scan.close(); 
    }
}

