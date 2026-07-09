import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num:");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("It is Even"+" "+num);
        }else{
            System.out.println("It is Odd"+" "+num);
        }
    }
}