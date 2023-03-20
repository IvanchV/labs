//Иванчиков Василий Александрович ККСО-02-20
public class TestList {
    public static void main(String[] args) {
        MyList a = new MyList();
        a.addToStart(1);
        a.addToStart(false);
        a.addToStart(14);
        a.addToEnd("mid");
        a.addToEnd("end");
        a.printList();
        System.out.println(a.getSize());
        a.delAll();
        a.printList();
        System.out.println("");

        a.delForStart();
        a.addToStart(1);
        a.addToStart(false);
        a.addToStart(14);
        a.addToEnd("mid");
        a.addToEnd("end");
        a.delForStart();
        a.printList();
        System.out.println(a.getSize());
        System.out.println("");

        a.addToStart(14);
        a.printList();
        a.delForValue(14);
        a.delForValue("mid");
        a.delForValue("papa");
        a.printList();
        System.out.println(a.getSize());
        System.out.println("");

        MyList b = new MyList();
        b.CloneList(a);
        b.addToStart("a list + 158 in start");
        b.printList();
        System.out.println(b.getSize());
        a.printList();
    }
}