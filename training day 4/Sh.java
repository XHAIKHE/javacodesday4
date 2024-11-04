import java.util.Scanner;
public  class Sh{
    public static void main(String[] args) 
    { Scanner scanner=new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    int key=1;
    int count=0;
    for (int i=0;i<size;i++)
    {
        if(key==array[i])
        {
            count++;
            break;
        }
    }
    if(count>0) {System.out.println("Element exists");}
    else {System.out.println("Not there in array");}
    scanner.close();
}
}
