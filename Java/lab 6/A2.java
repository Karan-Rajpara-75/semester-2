import java.util.Scanner;
class Cube {
    private double height;
    private double width;
    private double depth;
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getDepth() {
        return depth;
    }
    public double volume() {
        return height * width * depth;
    }
}
public class A2 {
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        Cube c1 = new Cube();
        c1.setHeight(3.0);
        c1.setWidth(4.0);
        c1.setDepth(5.0);
        Cube c2 = new Cube();
        c2.setHeight(4.0);
        c2.setWidth(5.0);
        c2.setDepth(6.0);
        System.out.print("enter Cube number:");
        int a = st.nextInt();
        if(a==1){
            System.out.println("Volume of Cube 1 = " + c1.volume());
        }
        else if (a==2) {
            System.out.println("Volume of Cube 2 = " + c2.volume());
        }
        else{
            System.out.println("error 404");
        }
    }
}
