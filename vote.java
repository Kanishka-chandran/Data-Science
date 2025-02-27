import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean nationality = scan.nextBoolean();
        if (nationality == true) {
            int age = scan.nextInt();
            if (age > 18) {
                boolean voteid = scan.nextBoolean();
                if (voteid == false) {
                    System.out.println("voteid is not eligible for vote ");
                } else {
                    System.out.println("eligible");
                }
            }

            else {
                System.out.println(" not eligible");
            }
        }
        else {
            System.out.println("nationality is not valid");
        }
        scan.close();
    }
    
}
