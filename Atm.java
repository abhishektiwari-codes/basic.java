import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int balance = 1000; // Maan lete hain starting balance 1000 hai
        int n;
        
        
        System.out.println("enter 1 for deposite");
         System.out.println("enter 2 for withdraw");
          System.out.println("enter 3 for check balance");

          n = sc.nextInt();
          int amount;
          switch (n) { 
            case 1:
                System.out.println("enter deposite amount :");
                amount = sc.nextInt();
                balance += amount;
                System.out.println("how your balance : "+balance);

                break;
             case 2:
                System.out.println("enter withdraw amount :");   
                amount = sc.nextInt();
                if(amount<= balance){
                    balance -= amount;
                    System.out.println("current balance : "+balance);
                    System.out.println("withdraw successfully...");

                }else{
                    System.out.println("you enter invalid amount");

                }
                break;
            case 3 :
                System.out.println("current balance : "+balance);  
                break;
               default:
                System.out.println("you entered invalid choice");   
                break;
                

          }

    }
}
