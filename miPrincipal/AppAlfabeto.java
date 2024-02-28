package miPrincipal;

public class AppAlfabeto {
    public static void menu(){
        System.out.println(" ");
        metodoA('Z');
        System.out.println(" ");

       

    }
    public static void metodoA(char c){
        if (c>'A') {
            metodoB(c);
            System.out.println(c);
        }
    }
    public static void metodoB(char c){
        metodoA(--c);
    };
    
}
