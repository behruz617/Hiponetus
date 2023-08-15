import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Ededi daxil edin ");
        int a=sc.nextInt();

        System.out.println("2.Ededi daxil edin ");
        int b=sc.nextInt();

        double c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenuz : "+(int)c);
    }
}
