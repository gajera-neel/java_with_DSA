import java.util.Scanner;
class Star{
    public static void main(String args[]){
        // System.out.println("input a number:" );
        // Scanner scanner= new Scanner(System.in);
        // int n = scanner.nextInt("");
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
         
         Scanner keyboard = new Scanner(System.in);
        System.out.println("Next enter two words:");

        int n; 
        String s1, s2; 

        n = keyboard.nextInt(); 
        s1 = keyboard.next(); 
        /* nextInt() ફક્ત નંબર વાચે છે, પણ જ્યારે તમે એ નંબર લખીને Enter દબાવો છો, તો એ Enter (newline character \n) બાકી રહે છે.

        પછી જ્યારે nextLine() ચાલે છે, ત્યારે તે એ બાકી રહેલું Enter (ખાલી લાઇન) જ વાચી લે છે.

        એટલે name માટે કોઈ વાતું પઢાય જ નહીં, એ સીધું ખાલી string ("") આપી દે છે. */
        keyboard.nextLine();
        s2 =  keyboard.nextLine(); 
        System.out.println(" n is " + n + " s1 is " + s1 + " s2 is " + s2); 

    }
}