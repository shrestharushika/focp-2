import java.util.*;
class Student{
	int i=0;
	String firstname;
        String lastname;
           int addr;
        int dob;
        String [] skills=new String[15];
        String[] qual=new String[15];
        String [] projects=new String[15];
        String email;
        int contactNo;
	       Student(String firstname,String lastname,int addr,String skills[],String qua[],String projects[],String email,int contactNo){
                         firstname=firstname;
                         lastname=lastname;
                         addr=addr;
                         dob=dob;
                         skills=skills;
                         qual=qual;
                         projects=projects;
                         email=email;
			 contactNo=contactNo;
                       }           
  Student(String firstname,String lastname,int addr,String skills[],String qual[],String email,int contactNo){
                         firstname=firstname;
                         lastname=lastname;
                         addr=addr;
                         dob=dob;
                         skills=skills;
                         qual=qual;
                         email=email;
			 contactNo=contactNo;
			}
 public void display()
    {
        System.out.println("First name: "+firstname);
        System.out.print("Last Name: "+lastname);
        System.out.print("Skills: "+skills[i]);
        System.out.print("E-mail: "+email);
        System.out.print("Contact No: "+contactNo);
        System.out.println("enter dob"+dob);

    }
               
}
class Studentdrive{
	public static void main(String[] args){
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		String firstname;
                String lastname;
                int addr;
                int dob;
                String [] skills=new String[15];
                String[] qual=new String[15];
                String [] projects=new String[15];
                String email;
                int contactNo;
		System.out.println("enter firstname"+firstname);
		firstname=sc.next();
		System.out.println("enter lastname"+lastname);
		lastname=sc.next();
		System.out.println("enter address"+addr);
		addr=sc.nextInt();
		System.out.println("enter dob"+dob);
		dob=sc.nextInt();
		System.out.println("enter skills"+skills[i]);
		skills[i]=sc.next();
		System.out.println("enter qualifications"+qual[i]);
		qual[i]=sc.next();
		System.out.println("enter projects"+projects[i]);
		projects[i]=sc.next();
		System.out.println("enter ur email-Id"+email);
		email=sc.next();
		System.out.println("enter your "+contactNo);
		contactNo=sc.nextInt();
		Student s1 = new Student(firstname,lastname,addr,dob,skills,qual,projects,email,contactNo);
		      s1.display();
		}
}