import java.util.Scanner;
public class TempRevArr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");

        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int temp;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
