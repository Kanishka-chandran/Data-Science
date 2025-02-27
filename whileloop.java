// public class whileloop {
//     public static void main(String[] args) {
//         int n = 10;
//         int sum = 1;
//         while(sum<=n)
//         {
//             System.out.println(sum);
//             sum += 2;
//         }
//     }
// }

// public class whileloop
// {
//     public static void main(String[] args) {
//         int n = 10;
//         int i = 1;
//         do{
//             if(n%2==0)
//             {
//                 System.out.println(i);
//                 i += 2;
//             }

//         } while (i <= n);
//     }
// }


import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = n;
        int rev=0;
        
    while(n>0)
    {
        int d = n % 10;
        rev = rev * 10 + d;
        n = n / 10;

    }
    System.out.print(rev + " ");

        if (s==rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    
    scan.close();
}
}
