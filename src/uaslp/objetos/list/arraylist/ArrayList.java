package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class ArrayList {
    private static final int INITIAL_SIZE = 2;
    private String []array;
    private int size; //cuantos se han insertado al arreglo

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
        array[0]= data;
        size++;
    }

    public  void remove(String index){
        for(int i=0; i< array.length; i++){
            if(index == array[i]){
                remove(index);
            }
            size--;
        }
    }

    public void removeAll(){
        for(int i=0; i< array.length; i++){
            array[i]=null;
        }
    }

    public void setAt(String index, String data){
        this.addAtTail(data);
        this.remove(index);
    }

    public String getAt(String index){
        return index;
    }

    public ArrayListIterator getIterator(){
        return new ArrayListIterator();
    }


}
