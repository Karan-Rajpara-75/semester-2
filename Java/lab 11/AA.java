interface A{
    int a = 10;
    void methodA();
}
interface A1 extends A{
    int b = 20;
    void methodA1();
}
interface A2 extends A{
    int c = 30;
    void methodA2();
}
interface A12 extends A1, A2{
    int d = 40;
    void methodA12();
}
public class AA implements A12{
    public void methodA(){
        System.out.println("Method A: " + a);
    }
    public void methodA1(){
        System.out.println("Method A1: " + b);
    }
    public void methodA2(){
        System.out.println("Method A2: " + c);
    }
    public void methodA12(){
        System.out.println("Method A12: " + d);
    }
    public static void main(String[] args) {
        AA obj = new AA();
        obj.methodA();
        obj.methodA1();
        obj.methodA2();
        obj.methodA12();
    }
}