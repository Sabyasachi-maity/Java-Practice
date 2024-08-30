import java.util.Scanner;
public class NestedIF {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number a");
        int a =sc.nextInt();
        System.out.println("Enter 2nd number b");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd number c");
        int c=sc.nextInt();
        if (a>b){
            if(a>c){
                System.out.println("The biggest number is " +a);
            }
            else{
                System.out.println("C is the largest" + c);

            }
        }
            else{
                if (b>c){
                    System.out.println("b is largest " +b);
                }
                else{
                    System.out.println("C is the largest" +c);
                }

        }
    }
}
