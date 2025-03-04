import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Sum "+ sum);
        
         int sum1 = 0;
        int m = scan.nextInt();
        int arr1[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr1[i] = scan.nextInt();
            sum1+= arr1[i];
        }
         for(int i=0;i<m;i++)
        {
            System.out.println(arr1[i] + " ");
        }
        System.out.println("Sum1 "+ sum1);
    }
    

}
