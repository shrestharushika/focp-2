class Vehicle{
          int vh;
  Vehicle(int v){
          vehicle=v;    
  } 
   void display(){
        System.out.println("this is a vehicle");
   }
 }
class Cars{
       int cars;
    Cars(int c){
       cars=c;
    }
    void display()
     {
      System.out.println("this is a car");
  }
}  
  
  
class Bike extends vehicle
   {
       int bike;
   Bike(int b){
       bike=b;
   }
   void display(){
      System.out.println("this is a bike");
     
                   }
  }
  class main(){
        int a,b,c;
        System.out.println( "vehicle no");
        int a=sc.nextInt();
        System.out.println("car no");
        int b=sc.nextInt();
        System.out.println("bike no");
        int c=sc.nextInt();
        
            
            