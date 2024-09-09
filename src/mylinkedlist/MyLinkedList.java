
package mylinkedlist;

public class MyLinkedList {
    private Node head;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        // Sau câu lệnh này đã tìm được node cuối cùng và gán được cho tmp
        tmp.next = newNode;
    }

    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        }else{
            Node tmp = head;
        }
    }
}
