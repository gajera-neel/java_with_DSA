import java.util.Scanner;
class SumOfFunction{
    public static int main(int a, int b){
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a simple function to sum two integers.");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();   
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        main(a, b);
    }
}