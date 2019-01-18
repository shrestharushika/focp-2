 import java.util.Scanner;
 class value
 {
  public static void main(String[] args)
   {
Scanner sc=new Scanner(System.in);
    System.out.println("enter two integers");
  int a=sc.nextInt();
  int b=sc.nextInt();
int z=a+b;
int v,w,x,y;
System.out.println("sum="+z);
int u=a*b;
System.out.println("prod="+u);
if(a>b)
{
  x=a%b;
  y=a-b;
System.out.println("modulus"+x);
System.out.println("sub"+y);
  }
 else
{
  v=b%a;
 w=b-a;
System.out.println("modulus"+v);
System.out.println("sub"+w);
    }
   }
  } 
    