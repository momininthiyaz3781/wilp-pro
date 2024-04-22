import java.util.Scanner;

public class task2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operator");
        String operator=sc.next();
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        switch (operator){
            case "+":
                System.out.println("result:"+(num1+num2));
                break;
            case "-":
                System.out.println("result:"+(num1-num2));
                break;
            case "*":
                System.out.println("result:"+(num1*num2));
                break;
            case "/":
                System.out.println("result:"+(num1/num2));
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
