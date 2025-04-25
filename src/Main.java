import java.util.Scanner;


public class Main {
   static Scanner scanner = new Scanner(System.in);
    static Double balance = 0.00;
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");


        Double withdraw;
        Integer choice;
        boolean isRunning = true;

        while (isRunning){

            System.out.println("ABC BANKING SYSTEM");
            System.out.println("******************");
            System.out.println("1. CHECK BALANCE!");
            System.out.println("2. DEPOSIT!");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");

//            System.out.println("#####################");
            System.out.println("SELLECT A CHOICE! (1-4)");
            choice = scanner.nextInt();

            if (choice == 1){
                showBalance(balance);
            } else if (choice == 2) {
                balance += deposit();
            }else if (choice == 3) {
                balance -= Withdrawal();

            }else if (choice == 4) {
                System.out.println("THANKS AND WELCOME AGAIN");
                isRunning = false;

            }else {
                System.out.println("INVALID INPUT.");
            }
        }

scanner.close();

    }
  static   void showBalance(Double balance){
        System.out.println("******************");
        System.out.printf("$%.2f", balance);


    }
    static double deposit(){
       double amaunt;
       System.out.println("ENTER AMOUNT TO DEPOSIT: ");
       amaunt = scanner.nextDouble();
       if (amaunt < 0){
           System.out.println("ACHA UJINGA");
       } else {
           return amaunt;
       }
        return amaunt;
    }
   static double  Withdrawal(){

        double amaunt;
        System.out.println("ENTER AMOUNT TO WITHDRAW: ");
        amaunt = scanner.nextDouble();
       if (amaunt < balance){
           System.out.println("TOA PESA");
       } else if (amaunt > balance) {

           System.out.println("Work harder");

       }


       return amaunt;
   }

}