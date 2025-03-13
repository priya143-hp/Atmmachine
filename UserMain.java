import java.util.Scanner;

public class UserMain {
    private static int status;
     
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        AtmImple user=new AtmImple();
        int atmnumber=123456;
        int atmpin=123;
        System.out.println("enter the atm number");
        int atmnum2=scan.nextInt();
        System.out.println("enter pinnumber");
        int atmpin2=scan.nextInt();
        if (atmnumber==atmnum2&&atmpin==atmpin2) {
            while(true){
System.out.println("1.viewBalance\n 2.withdrawAmount\n3.depositAmount\n4.viewstatment\n5.exit");
          System.out.println("enter the choice");
          int ch=scan.nextInt();
          if(ch==1){
            user.viewBalance();
          }else if (ch==2) {
            System.out.println("enter the amount to withdraw");
            double withdrawAmount=scan.nextDouble();
            user.withdrawAmount(withdrawAmount);
          
          }
          else if(ch==3){
            System.err.println("enter the amount of deposit");
            double depositAmount=scan.nextDouble();
            user.depositAmount(depositAmount);
          }
          else if(ch==4){
            user.viewStatement();
          }else if(ch==5){
            System.out.println("collect your ATmcard \n thank you😊😊 ");
            System.exit(status);

          }
            
        }
    }
        else{

            System.out.println("incorrect atm number or pin");
        }
    }
}

