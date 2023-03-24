public abstract class calculator1{
    public abstract void addition(float a , float b );
    public abstract void subtraction(float a , float b );
    public abstract void multiplication(float a , float b );
    public abstract void division(float a , float b );
    
    
}
class operation1 extends calculator1{
    public void addition(float a , float b){
        float c = a+b;
        System.out.println("\nAddition : "+c);
    }public void multiplication(float a , float b){
        float c = a*b;
        System.out.println("Multiplication : "+c);
    }public void division(float a , float b){
        float c = a/b;
        System.out.println("Division : "+c);
    }public void subtraction(float a , float b){
        float c = a-b;
        System.out.println("\nSubtraction : "+c);
    }
}
