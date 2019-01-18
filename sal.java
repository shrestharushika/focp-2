
 import java.util.scanner;
  
class employee{ 
	String firstName;
        String lastName;	
	double salary;
	employee(String a, Strinh b, double d){
		firstName=a;
                lastName=b;
		salary=d;
         }
	  double yr_sal(){
           return salary*12;
          }
	   void raise(){ 
           salary=salary*0.1;
           return 0;
           }
            void display()
           {
             System.out.println("first Name"+ firstName);
	     System.out.println("last Name"+lastName);
	     System.out.println("salary"+salary);
      }


        class emp_main{
           public static void main(String[] args){          
           double d;
            String a,b; 
            Scanner sc=new Scanner(System.in); 
		 System.out.println("enter first name"); 
	       int a=sc.nextString();
	        System.out.println("last name");
	          b=sc.nextString();
		System.out.println("salary");
              do{
		 d=sc.nextDouble();
		if(d<0)
		System.out.println("salary is positive quantity");
		}while(d>0);
		employee el=new employee(a,b,d);
                  el.display();	
                   }
         	}

                 