import uaslp.objetos.list.linkedlist.LinkedListIterator;
import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList linkedlist = new LinkedList();

        System.out.println(linkedlist.getSize());

        LinkedListIterator iterator = linkedlist.getIterator();

        while(iterator.hasNext()){
            String data = iterator.next();
        }
    }

}
