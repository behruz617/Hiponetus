import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Enter the number ");
        int a=sc.nextInt();

        System.out.println("2.Enter the number ");
        int b=sc.nextInt();

        double c=Math.sqrt((a*a)+(b*b));

        System.out.println("hypotenuse : "+(int)c);
    }
}
