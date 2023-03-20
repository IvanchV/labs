//Иванчиков Василий Александрович ККСО-02-20
public class TestBinaryTree {
    public static void main(String[] args) {
        var a = new BinaryTree<>();
        a.insertNode(10, "a");
        a.insertNode(8, "b");
        a.insertNode(20, "c");
        a.insertNode(15, "d");
        a.insertNode(13, "e");
        a.insertNode(17, "f");
        a.insertNode(25, "g");
        System.out.println();


        System.out.println(a.MinMax(a.rootNode));

        a.printTree();
        System.out.println("Число элементов " +  a.getNodeCount());
        a.findNodeData(90);
        a.findNodeData(13);
        var b = new BinaryTree<>(a);
        a.clear();
        a.findNodeData(11);
        System.out.println("Число элементов " +  a.getNodeCount());
        System.out.println();
        b.insertNode(1, false);
        b.insertNode(12, 133);
        b.insertNode(100, "hello");
        b.printTree();
        System.out.println(b.getNodeCount());


    }
}
