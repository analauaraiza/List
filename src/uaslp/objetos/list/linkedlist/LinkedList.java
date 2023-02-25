package uaslp.objetos.list.linkedlist;

public class LinkedList {
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

    public void remove(int index){
        Node currentNode = head;
        int i=0;
        while(currentNode.getNext() != null){
            if(currentNode.getNext().equals(index)){
                if(currentNode.getPrevious() == null){
                    head.setNext(currentNode.getNext());
                }else{
                    currentNode.setPrevious(currentNode.getNext());
                }
            }
            i++;
        }
    }

    public void removeAll(){
        while(getSize() > 0){
            head = null;
            tail = null;
        }
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