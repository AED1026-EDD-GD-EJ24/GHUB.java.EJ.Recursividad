package miPrincipal;
import java.util.Scanner;
import java.util.Hashtable;




public class AppFibRecursivoOptimizado{
    public static void main(String[] args){
        Hashtable<Integer,Double> t=new Hashtable<Integer,Double>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        double f=fibonacciRecOptimizado(n,t);
        System.out.println(f);
    }
    public static double fibonacciRecOptimizado(int x, Hashtable<Integer,Double>t){
        Double d=t.get(x);
        if(d!=null)
        {
            d=fibonacciRecOptimizado(x-1,t)+fibonacciRecOptimizado(x-2,t);
            t.put(x,d);
        }   
        
        return d;
    }
}
