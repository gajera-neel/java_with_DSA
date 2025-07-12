import java.util.*;
class Calculate{
    public static void main(String args[]){
       System.out.println("calculation :");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println("if you want whay you perform so click that like +, -, *, /");
       char c = sc.next().charAt(0);
       switch (c) {
        case '+':
            System.out.println("Addition is :" + (a+b));
            break;
        case '-':
            System.out.println("Substraction is:" + (a-b));
        case '*':
            System.out.println("Multiplication is:" + (a*b));
            break;
        case '/':
            System.out.println("Division is:" + (a/b));
            break;
        default:
            throw new AssertionError();
       }

    }
}