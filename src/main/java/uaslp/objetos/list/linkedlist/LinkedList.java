package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.exceptions.BadIndexException;
import uaslp.objetos.list.exceptions.NotNullAllowedException;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addAtTail(T data) throws NotNullAllowedException {
        if(data == null){
            throw new NotNullAllowedException();
        }
        Node<T> node = new Node<>(data);

        if (size == 0) {
            head = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public void addAtFront(T data) throws NotNullAllowedException{

        if(data == null){
            throw new NotNullAllowedException();
        }
        Node<T> node = new Node<>(data);

        if(size == 0){
            tail = node;
        }else{
            node.setPrevious(head);
            head.setNext(node);
        }
        head = node;
        size++;
    }


    public void removeAll(){
        LinkedListIterator<T> iterator = (LinkedListIterator<T>) getIterator();

        while(iterator.hasNext()) {
            Node<T> temp = iterator.getCurrentNode();
            iterator.next();
            if(head == temp && tail == temp){
                head = null;
                tail = null;
            }
        size = 0;
        }
    }

    public void removeAllWithValue(T data){
        LinkedListIterator<T> iterator = (LinkedListIterator<T>) getIterator();
        while(iterator.hasNext()){
            Node<T> node = iterator.getCurrentNode();
            if(node.data.equals(data)){
                node.previous.next = node.next;
                node.next.previous = node.previous;
                size--;
            }
            iterator.next();
        }

    }

    public void remove(int index) throws BadIndexException{
        Node currentNode = head;
        int i=0;
        if (index < 0 || index >= size) {
            throw new BadIndexException();
        }
        /*while(currentNode.getNext() != null){
            if(currentNode.getNext().equals(index)){
                if(currentNode.getPrevious() == null){
                    head.setNext(currentNode.getNext());
                }else{
                    currentNode.setPrevious(currentNode.getNext());
                }
            }
            i++;
            size--;
        }*/
    }

    public T getAt(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Iterator<T> iterator = getIterator();
        int currentIndex = 0;

        while(iterator.hasNext() && currentIndex != index) {
            iterator.next();
            currentIndex++;
        }
        return iterator.next();
    }

    public void setAt(int index, T data)throws BadIndexException, NotNullAllowedException{
        if(data == null){
            throw new NotNullAllowedException();
        }
        if(index < 0 || index >= size){
            throw new BadIndexException();
        }
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