import java.util.Scanner;
public class Strcommon{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        String n=scanner.nextLine();
        int arr[]=new [n];
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
