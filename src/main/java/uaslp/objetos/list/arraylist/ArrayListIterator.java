package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;

public class ArrayListIterator<T> implements Iterator<T> {

    private final ArrayList<T> arrayList;
    private int currentIndex;

    public ArrayListIterator(ArrayList<T> arrayList){
        this.arrayList=arrayList;
    }
    public boolean hasNext(){
        return currentIndex < arrayList.getSize();
    }

    public T next(){
        T current = arrayList.getAt(currentIndex);
        currentIndex++;
        return current;
    }
}
