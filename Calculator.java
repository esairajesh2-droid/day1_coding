import java.util.Scanner;
class Calculator{
    public static void main(String [] args){
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        System.out.println("Sum is:"+(a+b));
        System.out.println("Difference is:"+(a-b));
        System.out.println("Product is:"+(a*b));
        System.out.println("Quotient  is:"+(a/b));
        System.out.println("Remainder is:"+(a%b));
        

    }
}