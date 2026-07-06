
class  demo
{
    static int count = 0;

    demo()
    {
        count++;
    }
}
public class a2
{
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo();
        demo d3 = new demo();

        System.out.println(demo.count);
    }
}