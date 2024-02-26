package miPrincipal;

public class AppFactorial {
    public static void menu(){

        System.out.println("Factorial: ");
        System.out.println(factorial(3));
        System.out.println("FACTORIAL RECURSIVO:");
        System.out.println(factorialRecursivo(3));
    }


    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static int factorialRecursivo(int n){
        if(n==0)
            return 1;
        else
        return factorialRecursivo(n-1)*n;
    }
   
}
