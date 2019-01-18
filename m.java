import java.util.Scanner;


 class m {
	public static void main(String[] args) {
		 
       int  i=0, Sum = 0,count=0,x;
          int[] a=new int[5];
         Scanner sc = new Scanner(System.in);
                 System.out.print(" Please Enter  Number of 5 elements in an array : ");        
               int largest=a[0],secondlargest=a[0],max=a[0],first=a[0],second=a[0];
             System.out.print(" elements of an Array  : ");
		for (i = 0; i < 5  ; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < 5  ; i++)
		{
			Sum = Sum + a[i]; 
		}		
		System.out.println("\n The Sum of All Elements in this Array = " + Sum);
           
             {
                   max = a[0];
      	for (i = 0; i < 5 ; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
              System.out.println("Maximum value:"+max);
        }
        
for ( i = 0; i < 5 ; i++) {
 
			if (a[i] > largest) {
				secondlargest = largest;
				largest = a[i];
 
			} else if (a[i] > secondlargest) 
                          {
				secondlargest = a[i];
                             }
                          System.out.println("\nSecond largest number is:" + secondlargest);
                           }
                             
             }

System.out.print("Enter the element of which you want to count number of occurrences:");
        x = sc.nextInt();
      for (i = 0; i < 5  ; i++)
        {
            if(a[i]==x)
            {
                count++;
            }
        
        System.out.println("Number of Occurrence of the Element:"+count);
           
         }
        }
       }
     