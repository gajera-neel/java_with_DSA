import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
    
        String result = original.replace('e', 'i');
  
        System.out.println("Modified string: " + result);
    }
}
