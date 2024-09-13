import java.util.Scanner;

public class As_6_Task_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the password : ");
        String password = scan.nextLine();

        boolean has_u_case = false;
        boolean has_l_case = false;
        boolean has_digit = false;
        boolean has_sp_char = false;

        if (password.length() >= 8) {
            
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    has_u_case = true;
                }
                else if (ch >= 'a' && ch <= 'z') {
                    has_l_case = true;
                }
                else if (ch >= '0' && ch <= '9') {
                    has_digit = true;
                }
                else {
                    has_sp_char = true;
                }
            }
        }

        boolean isStrong = has_u_case && has_l_case && has_digit && has_sp_char;

        System.out.println();

        System.out.println(isStrong);

        scan.close(); 
    }
}