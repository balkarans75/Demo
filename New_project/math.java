import java.util.Scanner;

public class math
{
public static void main (String[] args)
{
Scanner scanner=new Scanner(System.in);
int n1,n2;
System.out.println("Enter two numbers");
n1=scanner.nextInt();
Calculator c1=new Calculator(n1,n2);
System.out.println("Enter the operation you want to perform ");
System.out.println("Press 1 for addition(+)");
System.out.println("Press 2 for subtraction(-)");
System.out.println("Press 3 for division(/)");
System.out.println("Press 4 for modulous(%)");
int inp=scanner.next.Int();
switch (inp)
{
case 1:c1.add();
break;
case 2:c1.sub();
break;
case 3:c1.div();
break;
case 4:c1.mod();
break;
}
}
}