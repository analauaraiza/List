package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addAtTail(T data) {
        Node<T> node = new Node<>();


        if (size == 0) {
            head = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public void addAtFront(T data){
        Node<T> node = new Node<>();

        if(size == 0){
            tail = node;
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
            size--;
        }
    }

    public void removeAll(){
        while(getSize() > 0){
            head = null;
            tail = null;
        }
    }
    public void removeAllWithValue(T data){
        Iterator<T> iterator = getIterator();
        Node<T> node=head;
        while(iterator.hasNext()){
            if(data == iterator.next()){
                node.previous.next = node.next;
                node.next.previous = node.previous;
            }
        }

    }

    public T getAt(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> currentNode = head;
        for (int currentIndex = 0; currentIndex < index; currentIndex++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void setAt(int index, T data){
        Iterator<T> iterator = getIterator();
        int current_index = 0;

        while(iterator.hasNext() && current_index != index) {
            iterator.next();
            current_index++;
        }
    }

    public int getSize(){
        return size;
    }

    public Iterator<T> getIterator(){
        return new LinkedListIterator<>(head);
    }








}