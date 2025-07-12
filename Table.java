import java.util.Scanner;
class Table{
    public static void main(String args[]){
        System.out.println("Enter a number to generate its multiplication table:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            if (n > 0) {
                System.out.println(n + " x " + i + " = " + (n * i));
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                break;  
                
            }
        }
    }
}