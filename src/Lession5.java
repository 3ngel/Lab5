public class Lession5 {
    public static void main(String[] args){
        Pyt p = new Pyt(199);
        System.out.println(p.y);
    }
}
class Pyt{
    int y;
    public Pyt(){
        this.y=0;
    }
    public Pyt(int u){
        if(u<100){
            this.y=u;
            return;
        }
        this.y=100;
    }

    public void Set(int u){
        if(u<100){
            this.y=u;
            return;
        }
        this.y=100;
    }
    public void Set(){
        this.y=0;
    }
}
