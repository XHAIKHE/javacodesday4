import java.util.Scanner;
public class SecondHalfRevArr {
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
        for(int i=(n/2), j=n-1;i<j;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
