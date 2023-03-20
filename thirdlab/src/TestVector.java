//Иванчиков Василий Александрович ККСО-02-20
public class TestVector {
    public static void main(String[] args) {
        var a = new MyVector<>();
        MyVector.ball ball1 = new MyVector.ball(10, "red");
        MyVector.ball ball2 = new MyVector.ball(5, "blue");
        MyVector.ball ball3 = new MyVector.ball(7, "green");
        MyVector.ball ball4 = new MyVector.ball(8, "green");
        MyVector.ball ball5 = new MyVector.ball(7, "green");
        MyVector.ball ball6 = new MyVector.ball(7, "green");
        a.addLast(ball1);
        a.addLast(ball2);
        a.addLast(ball3);
        a.addLast(ball4);
        a.addLast(ball5);

        a.printVector();
        a.delForValueFirst(ball6);
        //a.delForValueFirst(ball5);
        a.printVector();
        System.out.println("//////////////////////");
        a.addForIndex("added", 2);
        a.printVector();
        a.addLast(88);
        a.printVector();
        a.delLast();
        a.printVector();
        a.delForIndex(0);
        a.delForIndex(100);
        a.printVector();
        System.out.println(a.getSize());
        System.out.println(a.getMax());

        System.out.println("//////////////////////////////////");

        var b = new MyVector<>();
        b.cloneMyVector(a);
        b.addForIndex("this", 0);
        b.addLast("is vector b");
        b.setMax(-1);
        b.printVector();
        b.delAll();
        b.printVector();
        a.printVector();

    }
}
