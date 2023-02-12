import uaslp.objetos.list.linkedlist.LinkedListIterator;
import uaslp.objetos.list.linkedlist.Linkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Linkedlist linkedlist = new Linkedlist();

        System.out.println(linkedlist.getSize());

        LinkedListIterator iterator = linkedlist.getIterator();

        while(iterator.hasNext()){
            String data = iterator.next();
        }
    }

}
