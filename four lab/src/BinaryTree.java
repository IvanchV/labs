//Иванчиков Василий Александрович ККСО-02-20
import java.util.Stack;

class Node<X>{
    protected int key;
    X data;
    protected Node<X> leftChild;
    protected Node<X> rightChild;

    Node(int key, X data) {
        this.key = key;
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
    Node(int key, X data, Node<X> leftChild, Node<X> rightChild) {
        this.key = key;
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    Node<X> copyFromNode() {
        Node<X> leftChild = null;
        Node<X> rightChild = null;

        if (this.leftChild != null) {
            leftChild = this.leftChild.copyFromNode();
        }
        if (this.rightChild != null) {
            rightChild = this.rightChild.copyFromNode();
        }

        return new Node<>(key, data, leftChild, rightChild);
    }

    public int getKey() {
        return key;
    }
    public Node<X> getLeftChild() {
        return leftChild;
    }
    public Node<X> getRightChild() {
        return rightChild;
    }
    public X getData() {
        return data;
    }
}
class BinaryTree<X> {
    public Node<X> rootNode;
    private int nodeCount;
    public BinaryTree() {
        this.rootNode = null;
        this.nodeCount = 0;
    }
    public BinaryTree(BinaryTree<X> tree) {
        this.rootNode = tree.rootNode.copyFromNode();
        this.nodeCount = tree.nodeCount;
    }
    static int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.key;
        int rres = findMax(node.rightChild);

        if (rres > res)
            res = rres;
        return res;
    }

    static int findMin(Node node) {
        int res;
       if (node.leftChild != null){
           return findMin(node.leftChild);
       }else {
           return node.key;
       }
    }

    public int MinMax(Node node){
        return findMax(node) - findMin(node);
    }//Функция для решения задания во время сдачи

    public void clear() {
        rootNode = null;
        nodeCount = 0;
    }
    public int getNodeCount() {
        return nodeCount;
    }
    public Node<X> findNodeByKey(int key) {
        Node<X> currentNode = rootNode;
        try {
            while (currentNode.getKey() != key) {
                if (key < currentNode.getKey()) {
                    currentNode = currentNode.getLeftChild();
                } else {
                    currentNode = currentNode.getRightChild();
                }
                if (currentNode == null) {
                    return null;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return currentNode;
    }
    public void findNodeData(int key) {
        try {
            Node<X> currentNode = findNodeByKey(key);
            System.out.println(currentNode == null ? "No Node with this key" : currentNode.data);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void insertNode(int key, X data) {
        Node<X> newNode = new Node<>(key, data);

        if (rootNode == null) {
            rootNode = newNode;
            nodeCount++;
        } else {
            Node<X> currentNode = rootNode;
            Node<X> parentNode;

            while (true) {
                parentNode = currentNode;

                if (key == currentNode.key) {
                    currentNode.data = data;
                    return;
                } else if (key < currentNode.key) {
                    currentNode = currentNode.leftChild;

                    if (currentNode == null) {
                        parentNode.leftChild = newNode;
                        nodeCount++;

                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;

                    if (currentNode == null) {
                        parentNode.rightChild = newNode;
                        nodeCount++;

                        return;
                    }
                }
            }
        }
    }

    public void printTree() {
        Stack<Node<X>> globalStack = new Stack<>();
        globalStack.push(rootNode);
        int gaps = 32;
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);
        while (!isRowEmpty) {
            Stack<Node<X>> localStack = new Stack<>();
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (!globalStack.isEmpty()) {
                Node<X> temp = globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getData());
                    localStack.push(temp.getLeftChild());
                    localStack.push(temp.getRightChild());
                    if (temp.getLeftChild() != null ||
                            temp.getRightChild() != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print("__");//
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;//
            while (!localStack.isEmpty())
                globalStack.push(localStack.pop());
        }
        System.out.println(separator);
    }

}
