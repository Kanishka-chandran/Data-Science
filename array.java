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
        
    }
    

}
