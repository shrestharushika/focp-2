import java.util.Scanner;
class oddeven{
	 public static void main(String[] args){
           int i=0,j=0,res=0;
          
          Scanner sc=new Scanner(System.in);
          System.out.print("enter size ");
              int n=sc.nextInt();  
            System.out.print("size");
              int m=sc.nextInt();   
              int a[][]= new int[n][m];	
              System.out.println("enter array elements");
              a[i][j]=sc.nextInt();
                   
			  a[i][j]=sc.nextInt();	
                      for(i=0;i<n;i++)
                      {    
			  for(j=0;j<m;j++)
                       {
                           res=a[i][j];
                         {   
		      if(res%2==0)
                        {
                          
                        System.out.println("array"+res);
                          }
                         else
                //  (res%2==1)
               {
                   res=a[i][j]*2;
                    System.out.println("array"+res);

	          }			
	         }
	        }
               }
              }
             }   	 