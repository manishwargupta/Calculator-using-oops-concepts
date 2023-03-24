import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        operation1 myoper = new operation1();
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter the value a : ");
        float a = sc.nextFloat();
        System.out.print("\nEnter the value b : ");
        float b = sc.nextFloat();
        System.out.println("\n(1)Addition  \n(2)Multiplication  \n(3)Division  \n(4)Subtraction");
        System.out.print("Enter the operation no. you want to do : ");
        int oper = sc.nextInt();
        switch(oper){
            case 1: {
                myoper.addition(a, b);
                break;
            }
            case 2: {
                myoper.multiplication(a, b);
                break;
            }
            case 3:{
                myoper.division(a, b);
                break;
            }
            case 4: {
                
                myoper.subtraction(a, b);
                break;
            }
        }
    }
    
}
