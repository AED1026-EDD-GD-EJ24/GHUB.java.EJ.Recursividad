package miPrincipal;

import java.util.Scanner;

public class AppFibonacci{
public static void menu(){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
//double f=




}
public static double fibonacciIte(int n){
    double f=1, r1=1, r2=1;
    for(int i=3; i<=n; i++){
        f=r1+r2;
        r1=r2;
        r2=f;
    }
    return f;
}
public static double fibonacciRec(int n){
    if(n<=2)
        return 1;
    else
        return fibonacciRec(n-1)+fibonacciRec(n-2);
        
}}