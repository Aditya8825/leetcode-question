//to find the max element in array 
// than the number next to it .
import java.util.*;

// public class MinMax {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter array size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int min = arr[0];
//         int max = arr[0];

//         for (int i = 1; i < n; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         System.out.println("Minimum = " + min);
//         System.out.println("Maximum = " + max);
//     }
// }



//reverse an raay 


public class Arraypr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
// int left=0;
// int right=n-1;
// while (left<right){
//     int temp=arr[left];
//     arr[left]=arr[right];
//      arr[right]=temp;

//      left++;
//      right--;
// }

// System.out.println("reversed array");
//  for(int i=0; i<n; i++){
//     System.out.println(arr[i]+" ");
//  }}
//  }





// bubble sort array
//   for(int i=0; i<n-1; i++){
//     for(int j=0; j<n-1-i; j++){
//         if(arr[j]>arr[j+1]){
//             int temp=arr[j];
//             arr[j]=arr[j=1];
//             arr[j+1]=temp;

//         }
//     }
//   }
//   for(int i=0; i<n; i++){
//     System.out.println(arr[i]+" ");
//   }}}


///occurrence of an number/integer in the array
System.out.println("enter to find the :");
int num=sc.nextInt();
int count =0;
 for(int i=0; i<n; i++){
    if(arr[i]==num){
        count++;
    }
    
 }
 
   System.out.println("number "+num+" occur"+"times in the array:");
}}