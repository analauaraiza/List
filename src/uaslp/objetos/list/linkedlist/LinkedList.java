package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class LinkedList implements List {
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
    public void removeAllWithValue(String data){
        Iterator iterator = getIterator();

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

    public void setAt(int index, String data){
        Iterator iterator = getIterator();
        int current_index = 0;

        while(iterator.hasNext() && current_index != index) {
            iterator.next();
            current_index++;
        }
    }

    public int getSize(){
        return size;
    }

    public Iterator getIterator(){
        return new LinkedListIterator(head);
    }







}