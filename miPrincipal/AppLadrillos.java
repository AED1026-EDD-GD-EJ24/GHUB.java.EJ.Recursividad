package miPrincipal;
public class AppLadrillos {
    public static void menu(){
        
       System.out.println("Iterativa:");
        dibujarPared_Iterativa(10);
        System.out.println("Recursiva: ");
        dibujarPared_Recursiva(10);

    }
    public static void dibujarPared_Iterativa(int n){
        for(int i=1;i<n;i++){
            System.out.println("--------------");
        }
    }
    public static void dibujarPared_Recursiva(int n){
        if(n>0)
            dibujarPared_Recursiva(n-1);
    
        System.out.println("--------------------");
    }

    
};