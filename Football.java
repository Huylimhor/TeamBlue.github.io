import java.util.Scanner;
    public class Football {
        private static Scanner sc;
// made by Huylimhor Te;
        public static void main(String args[]) {
          sc = new Scanner(System.in);
            System.out.println("This quiz will test your football/soccer knowledge!");

            System.out.println("Which football/soccer team won the most champions league title?" );
            System.out.println("1.Liverpool");
            System.out.println("2.Manchester united");
            System.out.println("3.Real madrid");
            System.out.println("4.Barcelona");
    boolean flag=true;
    int choice=0;
    while(flag)
      {
        try
        {
          
          System.out.println("Enter your answer as an integer from (1-4): ");
           choice=sc.nextInt();
           if(choice==1 || choice==2 || choice==3 || choice==4){
             flag=false;
           }
          }
        catch(Exception e)
        {
          // accept integer only.
          System.out.println("Enter only integer value.");
          flag=false;
        }
      }
     
          
         if(choice==1 || choice==2 || choice==3 || choice==4){
          if(choice==1){System.out.print("False");}
          if(choice==2){System.out.print("False");}
          if(choice==3){System.out.print("True");}
          if(choice==4){System.out.print("False");}}
          }
          
    }
    