
import java.util.Scanner;

class Sum {

    public static void main(String args[]) {
        System.out.println("Enter two numbers to calculate their sum:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= num; i++) {

            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }

        }
        System.out.println("The sum of even numbers from 1 to " + num + " is: " + even);
        System.out.println("The sum of odd numbers from 1 to " + num + " is: " + odd);
    }
}
