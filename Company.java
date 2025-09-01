
import java.util.*;

class Company {

    static boolean isPalindrom(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(right) != word.charAt(left)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter choice:");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 -> {
                System.out.print("enter string:");
                String input = sc.nextLine();
                String word = "";
                String result = "";

                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    if (ch != ' ') {
                        word += ch;
                    } else {
                        result = " " + word + result;
                        word = "";
                    }
                }
                result = word + result;

                System.out.println("Original: " + input);
                System.out.println("Reversed: " + result);
            }
            case 2 -> {

                // Step 1: Read array size
                System.out.print("Enter size of array: ");
                int size = sc.nextInt();

                int[] arr = new int[size];
                int max = 0;

                // Step 2: Read array elements and find maximum
                System.out.println("Enter array elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] > max) {
                        max = arr[i]; // update maximum
                    }
                }

                // Step 3: Find missing numbers from 1 to max
                System.out.print("Missing numbers are: ");
                for (int i = 1; i <= max; i++) {
                    boolean found = false;

                    // check if i is in array
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == i) {
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.print(i + " ");
                    }
                }
            }

            case 3 -> {
                System.out.print("Enter a number for palindrome check: ");
                int n = sc.nextInt();
                int temp = n;
                int rev = 0;
                while (n > 0) {
                    int m = n % 10;
                    rev = rev * 10 + m;
                    n /= 10;
                }
                if (temp == rev) {
                    System.out.println(temp + " is a palindrome number.");
                } else {
                    System.out.println(temp + " is not a palindrome number.");
                }

            }

            case 4 -> {
                System.out.print("Enter a array size to check palindrome: ");
                int size = sc.nextInt();
                sc.nextLine();  // Consume newline

                String[] arry = new String[size];
                System.out.println("Enter " + size + " strings:");
                for (int i = 0; i < size; i++) {
                    arry[i] = sc.nextLine();
                }

                int count = 0;
                String result = "";
                for (int i = 0; i < size; i++) {
                    if (isPalindrom(arry[i])) {
                        if (count > 0) {
                            result += ", ";
                        }
                        count++;
                        result += arry[i];
                    }

                }
                System.out.println("Number of palindromic strings: " + count);
                System.out.println("Palindromic strings are: " + result);
            }

            case 5 -> {
                System.out.println("enter string for found first non-repeating character:");
                String n = sc.next();
                char firstNonRepeat = 0;

                for (int i = 0; i < n.length(); i++) {

                    char ch = n.charAt(i);
                    int count = 0;
                    for (int j = 0; j < n.length(); j++) {
                        if (n.charAt(j) == ch) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        firstNonRepeat = ch;
                        break;
                    }
                }
                if (firstNonRepeat != 0) {
                    System.out.println("First Non-Repeating Character: " + firstNonRepeat);
                } else {
                    System.out.println("No non-repeating character found.");
                }
            }

            case 6 -> {
                System.out.println("please enter array for find value of sum of given target value:");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("enter array elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("enter target value:");
                int target = sc.nextInt();

                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] + arr[j] == target) {
                            System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                        }
                    }
                }
            }

            case 7 -> {
                System.out.println("Please enter a array for sum array");
                int n = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                List<Integer> sumPair = new ArrayList<>();

                for (int i = 0; i < arr.length; i += 2) {
                    if (i + 1 < arr.length) {
                        sumPair.add(arr[i] + arr[i + 1]);
                    } else {
                        System.out.println("Sum of " + arr[i] + " and 0 is: " + arr[i]);
                    }
                }

                System.out.println("Sum pairs are: " + sumPair);
            }

            case 8 -> {
                System.out.println("enter string for counting each charater:");
                String n = sc.nextLine();
                n = n.replaceAll("\\s", "");
                boolean first = true;
                for (int i = 0; i < n.length(); i++) {
                    char ch = n.charAt(i);
                    boolean alreadyCount = false;

                    for (int j = 0; j < i; j++) {
                        if (n.charAt(j) == ch) {
                            alreadyCount = true;
                            break;
                        }
                    }
                    if (!alreadyCount) {
                        int count = 0;
                        for (int k = 0; k < n.length(); k++) {
                            if (n.charAt(k) == ch) {
                                count++;
                            }
                        }
                        if (!first) {
                            System.out.print(", "); 
                        }
                        System.out.print(ch + ":" + count);
                        first = false;

                    }
                }

            }

        }

    }
}
