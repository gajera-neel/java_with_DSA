
import java.util.*;

class Pattern {

    public static void main(String[] args) {
        System.out.println("Enter number of row for pattern:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("pattern type:");
        //char type = sc.next().charAt(0);
        String type = sc.next();
        System.out.println();

        switch (type) {
            case "1" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }

            case "2" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (i == 1 || j == 1 || i == n || j == n) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            }

            case "3" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i);
                    }
                    System.out.println("");
                }
            }

            case "4" -> {
                for (int i = n; i >= 1; --i) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }

            case "5" -> {
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
            }

            case "6" -> {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        sum++;
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }
            }

            case "7" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        int sum = i + j;
                        if (sum % 2 == 0) {
                            System.out.print("1");
                        } else {
                            System.out.print("0");
                        }
                    }
                    System.out.println();
                }
            }

            case "8" -> {
                //first half of the pattern
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                //second half of the pattern
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            case "9" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (i == j || i + j == n + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }

            case "10" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            case "11" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }

            case "12" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }

                    for (int j = i; j >= 1; j--) {
                        System.out.print(j);

                    }

                    for (int j = 2; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }

            }

            case "13" -> {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = n-1; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }

                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }

        }

    }
}
