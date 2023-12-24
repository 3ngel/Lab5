public class Lession4 {
    public static void main(String[] args){
        Ret r = new Ret(66.1245);
        System.out.println(r.i+" "+r.p);
    }
}
class  Ret{
    int i;
    char p;
    public Ret(int i, char p){
        this.i=i;
        this.p=p;
    }
    public Ret(double h){
        this.p=(char)Math.floor(h);
        double u = h-Math.floor(h);
        u*=100;
        this.i=(int)Math.floor(u);

    }
}
