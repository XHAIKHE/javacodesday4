import java.util.Scanner;
public class Reverseofarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");

        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
