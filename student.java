package abc;
class Student{
	int i=0;
	String firstName;
        String lastName;
           int addr;
        int dob;
        String [] skills=new String[15];
        String[] qual=new String[15];
        String [] projects=new String[15];
        String email;
        String contactNo;
	       Student(String firstname,String lastname,int addr,String skills[],String qua[],String projects[],String email,String contactNo){
                         this.firstName=firstname;
                         this.lastName=lastname;
                         this.addr=addr;
                         this.dob=dob;
                         this.skills=skills;
                         this.qual=qual;
                         this.projects=projects;
                         this.email=email;
                       }           
  Student(String firstname,String lastname,int addr,String skills[],String qual[],String email,String contactNo){
                         this.firstName=firstname;
                         this.lastName=lastname;
                         this.addr=addr;
                         this.dob=dob;
                         this.skills=skills;
                         this.qual=qual;
                         this.email=email;
			}
               
}