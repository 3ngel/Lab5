public class Lession3 {
    public static void main(String[] args){
        Test t = new Test(1);
        System.out.println(t.one+" "+t.two);
    }
}
class Test{
    int one;
    int two;
    public Test(int one, int two){
        this.one=one;
        this.two=two;
    }
    public Test(int one){
        this.one=one;
        this.two=0;
    }
    public Test(){
        this.one=0;
        this.two=0;
    }
}
