import java.util.Scanner;
public class GiftExchange
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k;
        int[] array = new int[n+1];
        for (int i = 1; i <=n; i++) {
            k = scanner.nextInt();
            array[k]=i;
        }
        for(int i=1;i<=n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
