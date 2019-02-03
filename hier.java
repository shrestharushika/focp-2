
import java.util.*;
class Point2D{
        float x=0.0f;
        float y=0.0f;
	Point2D(float a,float b){
                 	x=a;
		   	y=b;
           }
       Point2D(){}
       float getx(){
             return x;
       }
       void setx(float a){
              x=a;
       }
       float gety(){
             return y;
       }
       void sety(float b){
              y=b;
       }
       void setxy(float a,float b){
              x=a;
              y=b;
       }
       float[] getxy(){
              float f[]=new float[2];              
              f[0]=x;
              f[1]=y;
              return (f);
       }
       String tostring(){
              return (null);
       }
}
class Point3D extends Point2D{
	float z;

       Point3D(float a,float b,float c){
 	      super(a,b);
              z=c;
       }
       Point3D(){
	     super();
       }   
       float getz(){
             return (z);
       }
       void setz(float a){
	     z=a;
       }
       void setxyz(float a,float b,float c){
             setxy(a,b);
z	     z=c;
	}
       float[] getxyz(){
             float f1[]=new float[3];
	     float f[] = new float[2];
       	     f=getxy();
	     f1[0]=f[0];
	     f1[1]=f[1];
             f1[2]=z;
             return (f1);
       }
	String tostring(){
		return(x +" "+y+" "+z);
	}
}
class mainfile{
             public static void main(String[] args){
                     Point3D p3d= new Point3D(7f,4f,9f);
                     System.out.println(p3d.tostring());
		     Scanner sc =new Scanner(System.in);
		     float a=sc.nextFloat();
                     float b=sc.nextFloat();
                     float c=sc.nextFloat();
		     p3d.setxyz(a,b,c);
                     float f[]=p3d.getxyz();
                     System.out.println(f[0]+" "+f[1]+" "+f[2]);
             }	
}