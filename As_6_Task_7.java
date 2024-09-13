import java.util.Scanner;

public class As_6_Task_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string-1: ");
        String so_1 = scan.nextLine(); 

        System.out.println("Enter your string-2: ");
        String so_2 = scan.nextLine(); 

        String comb = "";  

       
        for (int i = 0; i < so_1.length(); i++) {
           
            char ch = so_1.charAt(i);
           
            if (so_2.indexOf(ch) == -1) {  
                comb += ch;
            }
        
        }

        
        for (int i = 0; i < so_2.length(); i++) {
           
            char ch = so_2.charAt(i);
           
            if (so_1.indexOf(ch) == -1) { 
                comb += ch;   
            }
        
        }

        
        String result = "";

        for (int i = 0; i < comb.length(); i++) {
            
            char ch = comb.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);  
            }
        
        }

       
        System.out.println("Modified string: " + result);

        scan.close(); 
    }
}
