import java.util.*;
class Eg1{
	public static void main(String[] args){
		int a=0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no");
        	a=sc.nextInt();
		System.out.println("enter 2nd num");
		
		 while(true){
			try{
			b=sc.nextInt();
			System.out.println(a/b);
		        break;	
		}
	}	
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("hello");
         }  
 
     }