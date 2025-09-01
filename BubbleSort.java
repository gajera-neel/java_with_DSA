import java.util.*;

class BubbleSort {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<= arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       swapArray(arr);

    }

    public static void swapArray(int n[]){
      System.out.println("swapped array:");

       for(int i=0;i<n.length;i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
       }
}

