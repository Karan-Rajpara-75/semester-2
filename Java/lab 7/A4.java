import java.util.Scanner;
class Complex {
    int real, imag;

    Complex() {
        real = 0;
        imag = 0;
    }

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}
public class A4{
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        System.out.print("Enter real number A1: ");
        int a=st.nextInt();
        System.out.print("Enter Complex number A1: ");
        int b=st.nextInt();
        System.out.print("Enter real number A2: ");
        int a1=st.nextInt();
        System.out.print("Enter Complex number A2: ");
        int b1=st.nextInt();
        Complex c1 = new Complex(a, b);
        Complex c2 = new Complex(a1, b1);

        Complex c3 = c1.add(c2);

        System.out.print("Sum = ");
        c3.display();
    }
}