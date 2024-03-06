package miPrincipal;
public class Performace{
    private long tf;
    private boolean stopped=false;
    public Performace(){
        start();
    }
    public void start(){
        tf=System.currentTimeMillis();
        stopped=false;
    }
    public void stopd(){
        tf=System.currentTimeMillis()-tf;
        stopped=true;
    }

    public long getMillis(){
        return tf-ti;
    }

    public String toString(){
        if(!stopped){
            stop();
        }
        long diff=tf-ti;
        long min=diff/1000/60;
        long seg=(diff/1000)%60;
        return diff+"milisegundos("+min+"minutos" + " "+seg+"segundos)";
    }
public long  getTi() {
    return ti;  

}
