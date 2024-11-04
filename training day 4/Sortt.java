import java.util.scanner;
public class Sortt{
    public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
       System.out.println("enter the key");
       int key = scanner.nextInt();
        int count=0,s=0,e=array.length-1,m;
        while(s<=e){
          m=(s+e)/2;
          if(array[m]==key){
            count++;
            break;
          }
          if(array[m]>key) e=m+1;
          if(array[m]<key) s=m+1;
        }
    }
}