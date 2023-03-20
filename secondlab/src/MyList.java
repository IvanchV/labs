//Иванчиков Василий Александрович ККСО-02-20
public class MyList<X>{
    ListItem head;
    ListItem tail;
    private int size = 0;
    private  class ListItem{
        X data;
        ListItem next;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addToEnd(X item){
        ListItem newItem = new ListItem();
        newItem.data = item;
        size++;
        if (isEmpty()){
            head = newItem;
            tail = newItem;
        } else {
            tail.next = newItem;
            tail = newItem;
        }
    }
    public void addToStart(X item) {
        ListItem newItem = new ListItem();
        newItem.data = item;
        size++;
        if (isEmpty()) {
            head = newItem;
            tail = newItem;
        } else {
            newItem.next = head;
            head = newItem;
        }
    }

    public void delForStart(){
        try{
            if (isEmpty()) throw new Exception("The list is empty deletion is not possible");
            head = head.next;
            size--;
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void delForValue(X key) {
        try {
            if (isEmpty()) throw new Exception("Can`t delete element by value: empty list");
            ListItem del = head;
            ListItem prev = null;
            while (del != null && del.data != key) {
                prev = del;
                del = del.next;
            }
            if (del != null) {
                if (null == prev) {
                    head = head.next;
                    size--;
                    return;
                } else {
                    prev.next = del.next;
                    size--;
                    return;
                }
            }
            throw new Exception("Can`t delete element by value: no element "+key+" with this value in list");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printList() {
        ListItem item = head;
        System.out.print("[ ");
        while (item != null) {
            System.out.print(item.data + " ");
            item = item.next;
        }
        System.out.println("]");
    }

    public void delAll () {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public void CloneList(MyList<X> list){
        ListItem item = list.head;
        while(item != null){
            addToEnd(item.data);
            item = item.next;
        }
    }
}





