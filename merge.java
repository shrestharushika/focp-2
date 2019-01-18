import  java.util.Scanner;
class merge{
 	public static void main(String[] args){
		int count=0;
           int i=0,j=0;

 Scanner sc=new Scanner(System.in);
  System.out.println("enter size");
 int n=sc.nextInt();
    int[] arr=new int[n];
 
  System.out.println("size");
    int m=sc.nextInt();
  int[] ary=new int [m];
  
     int[] mergearray= new int[arr.length + ary.length];
   System.out.println("array length"+arr.length);
       for(i=0;i<arr.length;i++)
 arr[i]=sc.nextInt();
   for(i=0;i<n;i++)
 mergearray[i]= arr[i];
      count++;
     System.out.println(" "+arr);   
 
    System.out.println("arraylength"+ary.length);
 for( j=0;j<ary.length;j++)
   ary[j]=sc.nextInt();
System.out.println(" "+ary);   
   
for(j=0;j<m;j++)
   mergearray[i++]= ary[j];

 for(  i=0;i<mergearray.length;i++)
    System.out.println( " "+mergearray[i]); 

 }
}