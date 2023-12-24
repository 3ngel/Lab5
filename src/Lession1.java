public class Lession1 {
    public static void main(String[] args){
        int A;
        Student std = new Student();
        std.One('А');
        A=std.Two('A');
        std.Three('A',A);

    }
}
class Student{
    public char symvol;

    public void One(char s){
        this.symvol = s;
    }
    public int Two(char s){
        return (int)s;
    }
    public void Three(char s, int A){
        System.out.println("Символ "+s+" номер "+A);
    }
}
