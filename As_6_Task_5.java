
import java.util.Scanner;

public class As_6_Task_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String so = scan.nextLine(); 
        
        int v_count = 0, c_count = 0;

        char v_a = 'a', v_e = 'e', v_i = 'i', v_o = 'o', v_u = 'u';

        for (int i = 0; i < so.length(); i++) {

            char cu_char = so.charAt(i);

            char l_char = (cu_char >= 'A' && cu_char <= 'Z') ? (char) (cu_char + 32) : cu_char;

            if ((l_char >= 'a' && l_char <= 'z')) {
                
                if (l_char == v_a || l_char == v_e || l_char == v_i || l_char == v_o || l_char == v_u) {
                    v_count++; 
                } else {
                    c_count++; 
                }
            }
        }

        System.out.println();

        if (v_count > 0 && c_count > 0) {
            
            if (v_count % 3 == 0 && c_count % 5 == 0) {
                System.out.println("Aaarr! Me Plunder!!");
            } else {
                System.out.println("Blimey! No Plunder!!");
            }
            
        } else {
            System.out.println("Blimey! No Plunder!!");
        }

        scan.close();
    }
}
