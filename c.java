import java.util.*;
 class myadd{
        int a;
	int b;
        int s;
	 myadd(int a, int b ,int s){
         s=a+b;
        System.out.println(" "+s);
      }
       
         int sum(){
                   s=a+b;
		return s;
		}
         void display(){
                  
			 
		System.out.println("first"+a);
		System.out.println("second"+b);
                System.out.println("sum"+s);
               
                 }
           }
class myaddmain{
              public static void main(String[] args){
		int a,b,s;
               	Scanner sc=new Scanner(System.in);
                System.out.println("enter first digit");
		a=sc.nextInt();
		System.out.println("enter second digit");
		b=sc.nextInt();
		s=a+b; 
                 System.out.println("sum"+s);
                 myadd m1=new myadd(a,b,s);
			m1.display();
              }
             }