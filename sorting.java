import java.util.Scanner;
public class sorting
{
public static void main (String[] args)
{
Scanner scanner=new Scanner(System.in); 
System.out.println("enter five numbers");
int[] a=new int[5];
for(int k=0;k<a.length;k++)
{
a[k]=scanner.nextInt();
}

for(int i=0;i<5;i++)
{
  

 for (int j = i + 1; j < a.length; j++) {
 

                int temp = 0;
                if (a[j] < a[i]) {
 
                    
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
}
  System.out.print(a[i] + " ");
}
}
}
