//Иванчиков Василий Александрович ККСО-02-20
public class Test_complex {
    public static void main (String[] args) {
        Complex a = new Complex(0, 1);
        System.out.println(a.module());
        System.out.println(a.arg());

        System.out.println();

        Complex b = new Complex(1, 0);
        System.out.println(b.module());
        System.out.println(b.arg());

        System.out.println();

        Complex c = new Complex(0, -1);
        System.out.println(c.module());
        System.out.println(c.arg());

        System.out.println();

        Complex d = new Complex(-1, 0);
        System.out.println(d.module());
        System.out.println(d.arg());

        System.out.println();

        Complex e = new Complex(10, -2);
        System.out.println(e.module());
        System.out.println(e.arg());

        System.out.println();

        Complex f = new Complex(2, -10);
        System.out.println(f.module());
        System.out.println(f.arg());

        System.out.println();

        a.add(c);
        a.sub(a);
        e.add(f);
        f.sub(e);
        System.out.println(a);
        System.out.println(e);
        System.out.println(f);
    }
}