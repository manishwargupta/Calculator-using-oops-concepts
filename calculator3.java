import java.util.Scanner;

interface calculator{
    public  void addition(float a , float b );
    public void subtraction(float a , float b);
    public void multiplication(float a , float b );
    public void division(float a , float b);

}
class operation implements calculator{
    public void addition(float a , float b){
        float c = a+b;
        System.out.println("\nAddition : "+c);
    }public void subtraction(float a , float b){
        float c = a-b;
        System.out.println("\nSubtraction : "+c);
    }public void multiplication(float a , float b){
        float c = a*b;
        System.out.println("Multiplication : "+c);
    }public void division(float a , float b){
        float c = a/b;
        System.out.println("Division : "+c);
    }
  

}

public class calculator3 {
    public static void main(String[] args) {
        operation myoper = new operation();
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter the value a : ");
        float a = sc.nextFloat();
        System.out.print("\nEnter the value b : ");
        float b = sc.nextFloat();
        System.out.println("\n(1)Addition  \n(2)Subtraction  \n(3)Multiplication  \n(4)Division");
        System.out.print("Enter the operation no. you want to do : ");
        int oper = sc.nextInt();
        switch(oper){
            case 1: {
                myoper.addition(a, b);
                break;
            }
            case 2: {
                myoper.subtraction(a, b);
                break;
            }
            case 3:{
                myoper.multiplication(a, b);
                break;
            }
            case 4: {
                myoper.division(a, b);
                break;
            } 
        }
       

        
        
        
       

    }
    
}
