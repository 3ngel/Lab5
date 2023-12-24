public class Lession6 {
    public static void main(String[] args){
        Der d  = new Der(34);
        System.out.println(d.min+" "+d.max);
    }
}
class Der{
    int max, min;
    public Der(int min, int max){
        if(min<=max){
            this.min=min;
            this.max=max;
        }
        else{
            this.min=max;
            this.max=min;
        }
    }
    public Der(int m){
        this.min=0;
        this.max=m;
    }
    public void Set(int min, int max){
        if(min<=max){
            this.min=min;
            this.max=max;
        }
        else{
            this.min=max;
            this.max=min;
        }
    }
    public void Set(int m){
        this.min=0;
        this.max=m;
    }

}
