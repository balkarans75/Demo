import java.util.Scanner;
public class Calculator
{
public int a,b;
public Calculator(int c,int d)
{
a=c;
b=d;
}
public int add()
{
return(a+b);
}
public int sub()
{
return(a-b);
}
public int div()
{
return(a/b);
}
public int multiply()
{
return(a*b);
}
public int mod()

{
return(a%b);
}

public static void main (String[] args)
{
Scanner scanner=new Scanner(System.in);
int n1,n2;
System.out.println("enter two numbers");
n1=scanner.nextInt();
n2=scanner.nextInt();
Calculator c1=new Calculator(n1,n2);
System.out.println(c1.a);
System.out.println("Enter the operation you want to perform");
System.out.println("enter 1 for addition");
System.out.println("enter 2 for subtraction");
System.out.println("enter 3 for multipy");
System.out.println("enter 4 for division");
System.out.println("enter 5 for modulous");
int inp=scanner.nextInt();

switch(inp)
{
  case 1:
 System.out.println("add"+ c1.add());
  break;
case 2:
System.out.println("Subtract"+ c1.sub());
  break;

case 3:
  System.out.println("Multiply"+"  "+c1.multiply());
  break;

case 4:
 System.out.println("Division"+"  "+ c1.div());
  break;
case 5:
  System.out.println("Modulous+"  "+c1.mod());
  break;




}


}
}
