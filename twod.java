import java.util.*;
class twod{       
       public static void main(String[] args){
                 int i=0,j=0,sum=0,first=0,x,count=0,max=0;
                 int largest=0,secondlargest=0,second;
                  int[] arr=new int[5];
                  Scanner sc=new Scanner(System.in);
              System.out.println("elements");
             for(i=0;i<5;i++)
               {
                arr[i]=sc.nextInt();
                  }  
                {   
                       sum=+arr[i];
                           System.out.println(" sum of elements"+sum);
                     }
  {
         
                   max = arr[0];
        for(i = 0; i <5; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum value:"+max);
      }
    {
            if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondlargest) {
				secondlargest = arr[i];
                  }
                    System.out.println("Maximum value:"+secondlargest);
               
               
            if (arr[i] < first) 
        { 
            second = first; 
            first = arr[i]; 
        }  
          else
        System.out.println("The smallest element is" +first); 
       }
{
System.out.print("Enter the element of which you want to count number of occurrences:");
        x = sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
      }
     } 
   }