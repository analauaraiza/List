package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;

public class ArrayListIterator implements Iterator {

    private ArrayList arrayList;
    private int currentIndex;
    public ArrayListIterator(ArrayList arrayList){
        this.arrayList=arrayList;
    }
    public boolean hasNext(){
        return currentIndex < arrayList.getSize();
    }

    public String next(){
        String current = arrayList.getAt(currentIndex);
        currentIndex++;
        return current;
    }
}
