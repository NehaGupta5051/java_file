import java.io.*;
import java.util.Scanner;
class Arithmetic{
public static void main(String[] args)
{
int a,b;
System.out.print("Enter the two number....");
Scanner obj = new Scanner(System.in);
a= obj.nextInt();
b=obj.nextInt();

System.out.println("Addition:-"+(a+b));
System.out.println("sub-:"+(a-b));
System.out.println("mul:-"+(a*b));
System.out.println("div:-"+(a/b));
System.out.println("modulo:-"+(a%b));
}
}
