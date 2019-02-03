import java.util.Scanner;
          
   class distance{
              int f;
           int i;
             void getdis(){

              Scanner sc=new Scanner(System.in);
              System.out.println("enter the distance in inch");
              i=sc.nextInt();
              System.out.println("enter distance in feet");
              f=sc.nextInt();
                }
         void display(){
             System.out.println("feet"+f+"inch"+i);
             }
          void adddis(distance d1,distance d2){
            i=d1.i+d2.i;
            f=d1.f+d2.f;
       }
}
      class adddistance{
               public static void main(String[] args){
                   distance d1=new distance();
                   distance d2=new distance();
                   distance d3=new distance();
                  Scanner sc=new Scanner(System.in);
                  System.out.println("diastance1");
                 d1.getdis();
                  System.out.println("diastance2");
                 d2.getdis();;
                        
                 d3.adddis(d1,d2);
                 
               System.out.println("total distance");
                       
                 d3.display();
            }
        }      
