import java.util.Scanner;

public class As_6_Task_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String so = scan.nextLine();

        String result = "";
         
        boolean t_l_case = true;  

        for (int i = 0; i < so.length(); i++) {
            char ch = so.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (t_l_case) {
                
                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char) (ch + 32);
                    }

                } else {
                    
                    if (ch >= 'a' && ch <= 'z') {
                        ch = (char) (ch - 32); 
                    }

                }
                
                t_l_case = !t_l_case;
            }

            result += ch;
        }

        System.out.println(result);

        scan.close(); 
    }
}