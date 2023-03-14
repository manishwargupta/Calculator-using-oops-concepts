import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" **// SIMPLE CALCULATOR //**");
        
        System.out.println("\n--// Enter the values for the Operation //--");

        System.out.print("\nEnter the First value :- ");
        float a = sc.nextInt();
        System.out.print("\nEnter the Second value :- ");
        float b = sc.nextInt();

        System.out.println("\n(1). Addition  \n(2). Substraction \n(3). Multiplication \n(4). Division ");
        
        System.out.print("\nEnter the s.no you want to use : ");
        int m = sc.nextInt();

        switch(m){

            case 1:{
                float sum = a+b;
                System.out.println("\nAddition : "+sum);
                break;
            }

            case 2:{
                float sub = a-b;
                System.out.println("\nSubstarction : "+sub);
                break;
            }
            
            case 3:{

                float multi = a*b;
                System.out.println("\nMultiplication : "+multi);
                break;
            }

            case 4:{

                 float div = a/b;
                 System.out.println("\nDivision : "+div);
                 break;
            }

            default:{
                System.out.println("You have enter the value out of the range : 5");
            }

        }
    }
    
}
