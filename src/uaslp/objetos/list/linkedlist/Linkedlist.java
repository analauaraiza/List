package uaslp.objetos.list.linkedlist;

public class Linkedlist{
    private Node head;
    private Node tail;
    private int size;

    public void addAtTail(String data) {
        Node node = new Node();

        node.setData(data);

        if (size == 0) {
            head = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public void addAtFront(String data){
        Node node = new Node();
        node.setData(data);

        if(size == 0){
            head = node;
        }else{
            node.setPrevious(head);
            head.setNext(node);
        }
        head = node;
        size++;
    }


    public String getAt(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node currentNode = head;
        for (int currentIndex = 0; currentIndex < index; currentIndex++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public int getSize(){
        return size;
    }

    public LinkedListIterator getIterator(){
        return new LinkedListIterator(head);
    }




}