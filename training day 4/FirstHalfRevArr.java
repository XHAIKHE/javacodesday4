import java.util.Scanner;
public class FirstHalfRevArr {
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
        for(int i=0, j=(n/2)-1;i<n/4;i++,j--){
            temp=arr[i];
            arr[i]=arr[j-i];
            arr[j-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
