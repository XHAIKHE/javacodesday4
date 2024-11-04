import java.util.Scanner;
public class Common {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int[] hash= new int[10];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;}
            System.out.println("YE LE  ");
        
        for(int i=0;i<10;i++){
            if (hash[i]==0){
                continue;}
            else {System.out.println(i+" - "+hash[i]);}
        }
     
    }
    
}
