import java.util.Scanner;
public class Findmax
{
public static void main (String[] args)
{
Scanner scanner=new Scanner(System.in); 
int[] numbers=new int[5];

System.out.println("Enter five numbers");
for(int i=0;i<5;i++)
{
numbers[i]=scanner.nextInt();
}
int max=numbers[0];
for(int j=0;j<5;j++)
{
 if(max<numbers[j])
{
max=numbers[j];
}
}
System.out.println("biggest number is" +max);

}
}