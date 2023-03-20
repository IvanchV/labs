//Иванчиков Василий Александрович ККСО-02-20
public class Complex {
    private double Re;
    private double Im;
    private String sign;

    @Override
    public String toString() {
        return (Re + sign + Math.abs(Im));
    }

    public Complex(double x, double y) {

        Re = x;
        Im = y;
        if (Im < 0) {
            sign = "-i";
        } else
            sign = "+i";
    }

    public Complex() {
        Re = 1;
        Im = -1;
        if (Im < 0) {
            sign = "-i";
        } else
            sign = "+i";
    }

    public double module() {
        return Math.sqrt(Re * Re + Im * Im);
    }

    public double arg() {
        return Math.toDegrees(Math.atan(Im / Re));
    }

    public void add(Complex z) {
        Re += z.Re;
        Im += z.Im;
        String sign1;
        if (Im < 0) {
            sign1 = "-i";
        } else {
            sign1 = "+i";
        }
    }

    public void sub(Complex z) {
        Re -= z.Re;
        Im -= z.Im;
        String sign1;
        if (Im < 0) {
            sign1 = "-i";
        } else {
            sign1 = "+i";
        }
    }
}
