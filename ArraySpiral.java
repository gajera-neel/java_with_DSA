import java.util.*;
class ArraySpiral{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int raw = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[raw][col];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<raw;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral order of the array:");
        int rawStart = 0, rawEnd = raw - 1, colStart = 0, colEnd = col - 1;
        while(rawStart <= rawEnd && colStart <= colEnd){
            //first raw
            for (int colm=colStart; colm<=colEnd ; colm++) {
                System.out.print(arr[rawStart][colm] + " ");
            }
            rawStart++;
            
            //last column
            for (int raws=rawStart; raws<=rawEnd; raws++) {
                System.out.print(arr[raws][colEnd] + " ");
            }
            colEnd--;

            //last raw
            for(int colm=colEnd; colm>=colStart; colm--){
                System.out.print(arr[rawEnd][colm] + " ");
            }
            rawEnd--;

            //bottom to top
            for(int raws=rawEnd; raws>=rawStart; raws--){
                System.out.print(arr[raws][colStart]  + " ");
            }
            colStart++;
        }
    }
}