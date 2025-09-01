import java.util.*;
class SelectionSort{

    public static void SelectionSort(int arr[]){
        System.out.println("Sorted array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for array input:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        SelectionSort(arr);
     }
}