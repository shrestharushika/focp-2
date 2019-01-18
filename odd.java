import java.util.Scanner;
class oddeven{
	 public static void main(String[] args){
           int i=0,j=0,m=6,n=6;
	   int a[][]= new int[10][10];	
          Scanner sc=new Scanner(System.in);
                 System.out.println("enter array elements");
                   a[i][j]=sc.nextInt();
                   for(i=0;i<n;i++)
		     {
			for(j=0;j<m;j++)
			{ 
			  a[i][j]=sc.nextInt();	
			}
		     if(a[i][j]%2==0)
		{	
		System.out.println(" "+a[i][j]);
		    }	
              else
		{  
		  a[i][j]=a[i][j]*2;
	       }				
		   }	
		}
	     }		 