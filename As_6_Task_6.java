import java.util.Scanner;

public class As_6_Task_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string : ");
        String so = scan.nextLine();

        System.out.println();

        int size = so.length();

        int ak = 0, pk = 0, jk = 0;

        char sick;

        ak = size;
        pk = size-1;

        for (int i = 0; i < ak; i++) {
            sick = so.charAt(pk);

            System.out.print(sick);

            pk--;
        }
        
        
        scan.close(); 
    }
}

