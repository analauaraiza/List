package uaslp.objetos.list.arraylist;

public class ArrayListIterator {

    private ArrayList arrayList;
    private int currentIndex;
    public ArrayListIterator(ArrayList arrayList){
        this.arrayList=arrayList;
    }
    public boolean hasNext(){
        return currentIndex < arrayList.getSize();
    }

    public int next(){
        int current = arrayList.getAt(currentIndex);
        currentIndex++;
        return current;
    }
}
