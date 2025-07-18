import java.util.Scanner;

class Factorial{
      public static void Factorial(int n){
         if (n < 0) {
             System.out.println("Factorial is not defined for negative numbers.");
             return;
         }
         int Fact=1;
         System.out.print("Factorial of " + n + "! = ");
         for (int i=n; i>=1; i--) {
            System.out.print(i);
             Fact*=i;
             if (i > 1) {
                 System.out.print(" * ");
             }
         }
         System.out.println(" = " + Fact);
      }

    public static void main(String[] args) {
        System.out.println("This is a simple function to calculate factorial of a number.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Factorial(n);
    }
}