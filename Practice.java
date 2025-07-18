
import java.util.Scanner;

class Practice {

    public static void Average() {
        System.out.println("How many numbers do you want to average?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        if (n <= 0) {
            System.out.println("Please enter a valid number greater than 0.");
            return;
        }
        System.err.println("Enter " + n + " numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + " : ");
            double num = sc.nextDouble();
            sum = sum + num;
        }

        double average = sum / n;

        System.out.println("Aevrage of " + sum + " / " + n + " = " + average);

    }

    public static void odd() {
        System.out.println("sum of all odd number enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter valid number ");
            return;
        }

        int sum = 0;
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                output.append(i).append(", ");
            }
        }

        if (output.length() >= 2) {
            output.setLength(output.length() - 2);
        }

        System.out.println("Sum of " + output + " odd number is " + sum);

    }

    public static void greater() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("please enter second number : ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.err.println("greter number is " + n1);
        } else {
            System.err.println("greter number is " + n2);

        }
    }

    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void vote() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age: ");
        int a = sc.nextInt();

        if (a >= 18) {
            System.out.println("you are eligible for vote");
        } else {
            System.out.println("you are not eligible for vote");

        }

    }

    public static void infinity() {
        do {
            System.out.println("you are eligible for vote");
        } while (true);
    }

    public static void NumberCounter() {

        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Final result
        System.out.println("\nTotal Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
        System.out.println("Total Zeros: " + zeroCount);

        sc.close();
    }

    public static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base (x):");
        int x = sc.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println(x + " raised to the power " + n + " is: " + result);

    }

    public static void fibonaki() {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of terms
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second; // next term is sum of previous two
            first = second; // move forward
            second = next;
        }

        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("Select your choice:");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        System.out.println();
        switch (choice) {
            case "1" ->
                Average();

            case "2" ->
                odd();

            case "3" ->
                greater();

            case "4" -> {
                System.out.println("eneter number of radius:");
                double n = sc.nextDouble();
                double ans = getCircumference(n);
                System.err.println("Circumference of circle with radius " + n + " is: " + ans);
            }

            case "5" ->
                vote();

            case "6" ->
                infinity();

            case "7" ->
                NumberCounter();

            case "8" ->
                power();

            case "9" ->
                fibonaki();

        }

    }
}
