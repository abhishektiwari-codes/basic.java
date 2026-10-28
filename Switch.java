import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
     int a ;
     int b ;
     char operator ;
     Scanner sc = new Scanner(System.in);
     a = sc.nextInt();
     b = sc.nextInt();
     operator = sc.next().charAt(0);
     
     switch (operator){
        case '+':
            System.out.println("After Addition your value is : "+(a+b));
            break;
            case '-':
            System.out.println("After substraction your value is : "+(a-b));
            break;
            case '*':
            System.out.println("After Multiplication your value is : "+(a*b));
            break;
            case '/':
            System.out.println("After Division your value is : "+(a/b));
            break;
            case '%':
            System.out.println("After Modulas your value is : "+(a%b));
            break;
     }
    }
}
