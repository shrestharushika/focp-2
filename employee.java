
 import java.util.*;
  
class employee{ 
	String firstName;
        String lastName;	
	double salary;
	employee(String fn, String ln, double s){
		firstName=fn;
                lastName=ln;
		salary=s;
         }
	  employee(){
	        firstName=null;
		lastName=null;
		salary=0.0;

	  double yr_sal(){
           return salary*12;
          }
	   void raise(){ 
           salary=salary*0.1;
           
           }
            void displayEmp()
           {
             System.out.println("first Name"+ firstName);
	     System.out.println("last Name"+lastName);
	     System.out.println("salary"+salary);
      }
}


        class emp_main{
           public static void main(String[] args){          
           double d;
            String a,b; 
            Scanner sc=new Scanner(System.in); 
		 System.out.println("enter first name"); 
	       a=sc.next();
	        System.out.println("last name");
	          b=sc.next();
		System.out.println("salary");
              do{
		 d=sc.nextDouble();
		if(d<0)
		System.out.println("salary is positive quantity");
		}while(d>0);
		employee e1=new employee(a,b,d);
		employee e2=new employee();
		  e2.displayemp();
                  e1.displayEmp();	
                   }
         	}

                 