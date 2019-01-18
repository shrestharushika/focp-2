  import java.util.scanner;
class dup{
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int sid[] = new int[5];

        int count = 0; 
        int x = 0;
        int num = 0;
         int digit=0
         char false,true;

        while (x < sid.length) 
            {
            System.out.println("Enter number: ");
            num = sc.nextInt();

            if ((num >= 10) && (num <= 100)) {
                 digit = false;
                x++;

                for (int i = 0; i < sid.length; i++) 
                 {   if (sid[i] == num)     
                     digit = true;
                 } 
 if (!digit) {

                    sid[count] = num;

                    count++;

            } 

                else

                System.out.printf("the number was entered before \n");

                      }
            } 
         }
      }
