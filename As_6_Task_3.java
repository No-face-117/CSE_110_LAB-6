
import java.util.Scanner;

public class As_6_Task_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String so = scan.nextLine(); 

        System.out.println("Enter the split character: ");
        char shar = scan.next().charAt(0);  

        String cu_part = "";   
        String cu_part_s = "";    

        for (int i = 0; i < so.length(); i++) {
            char cu_char = so.charAt(i);

            if (cu_char == shar) {
                System.out.println(cu_part);
                cu_part = ""; 
            } else {
                cu_part += cu_char;
            }
        }

        if (cu_part != cu_part_s) {
            System.out.println(cu_part);
        }

        scan.close();  
    }
}
