import java.util.Scanner;
public class main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (number==1){
            System.out.println("Enter the valid number");
        }
        if (number==2){
            System.out.println("the number is prime number");
        }
        int c = 2;
        while (number > c) {
            if (number % 2 == 0)
            {
                System.out.println("The number is not prime");
                break;

            }
            else
            {
                System.out.println("The number is prime");
            }
            c=c+1;
            
        }
    }
}