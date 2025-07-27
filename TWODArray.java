import java.util.*;
class TWODArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number how many take 3d array:");
        int row =sc.nextInt();
        int col= sc.nextInt();

        System.out.println("enter value:");
        int[][] number = new int[row][col];

        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("find number with ther index");
        int x= sc.nextInt();


        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (number[i][j] == x) {
                  System.out.println("number is " + number[i][j] + " found location is (" + i + "," + j +")");                    
                }
                
            }
             System.out.println();
        }
        




    }
}