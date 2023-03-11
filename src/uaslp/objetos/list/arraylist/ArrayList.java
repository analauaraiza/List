package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.List;


public class ArrayList implements List{
    private static final int INITIAL_SIZE = 2;
    private String []array;
    private int size;

    public ArrayList(){
        array = new String[INITIAL_SIZE];
    }

    public void addAtTail(String data){
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
        String []newArray = new String[array.length*2];

        for(int i=0; i< array.length; i++){
            newArray[i]=array[i];
        }
        array = newArray;
    }

    public void addAtFront(String data){
        if(size == array.length){
            increaseSize();
        }
        for(int i = size-1; i >= 1; i--){
            array[i] = array[i-1];
        }
        array[0]= data;
        size++;
    }

    public  void remove(int index){
        if(index < 0 || index >= size){
            return;
        }
        for(int i=0; i< array.length; i++){
            if(index == i){
                array[index] = null;
            }
            size--;
        }
    }

    public void removeAll(){
        for(int i=0; i < array.length; i++){
            array[i]=null;
        }
        size = 0;
    }

    public void setAt(int index, String data){
        if(index < 0 || index >= size){
            return;
        }
        array[index] = data;
    }

    public String getAt(int index){
        return array[index];
    }

    public void removeAllWithValue(String data){
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

    public ArrayListIterator getIterator(){
        return new ArrayListIterator(this);
    }


}
