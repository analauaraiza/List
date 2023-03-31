package uaslp.objetos.list.arraylist;
import uaslp.objetos.list.List;
import uaslp.objetos.list.exceptions.BadIndexException;
import uaslp.objetos.list.exceptions.CollectionsExceptions;


public class ArrayList<T> implements List<T>{
    private static final int INITIAL_SIZE = 2;
    private T []array;
    private int size;

    public ArrayList(){
        array = (T[])(new Object[INITIAL_SIZE]);
    }

    public void addAtTail(T data){
        if(size == array.length){
           increaseSize();
        }

        array[size] = data;
        size++;

    }

    public int getSize(){
        return size;
    }

    private void increaseSize(){
        T []newArray = (T[])new String[array.length*2];

        for(int i=0; i< array.length; i++){
            newArray[i]=array[i];
        }
        array = newArray;
    }

    public void addAtFront(T data){
        if(size == array.length){
            increaseSize();
        }
        for(int i = size-1; i >= 1; i--){
            array[i] = array[i-1];
        }
        array[0]= data;
        size++;
    }

    public  void remove(int index) throws BadIndexException {

        if (index < 0 || index >= size) {
            throw new BadIndexException();
        }

        for(int i=0; i< array.length; i++){
            if(index == i){
                array[index] = null;
            }
            size--;
        }
    }

    public void removeAll(){
        array = (T[])(new Object[INITIAL_SIZE]);
        size = 0;
    }

    public void setAt(int index, T data){
        if(index < 0 || index >= size){
            return;
        }
        array[index] = data;
    }

    public T getAt(int index){
        return array[index];
    }

    public void removeAllWithValue(T data){
        for(int i=0; i < array.length; i++){
            if(array[i].equals(data)){
                array[i] = null;
            }
        }
        size--;
        for(int index=0; index < size; index++){
            array[index]=array[index];
        }
    }

    public ArrayListIterator<T> getIterator(){
        return new ArrayListIterator<>(this);
    }


}
