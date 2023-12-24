public class Lession2 {
    public static void main(String[] args){
        Mem m = new Mem();
        char one, two;
        one  = 'F';
        two='L';
        m.one=one;
        m.two=two;
        m.One();

    }
}
class Mem{
    char one, two;
    public void One(){
        int A= (int)one;
        int B=(int)two;
        char t;
        while(A<=B){
            t=(char)A;
            System.out.println(t);
            A++;
        }
    }
}
