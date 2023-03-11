import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;
import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       //LinkedList linkedlist = new LinkedList();

        List list1 = new LinkedList();
        list1.addAtTail("A");
        list1.addAtTail("B");
        list1.addAtTail("C");


        Iterator iterator = list1.getIterator();

        System.out.println("LinkedList");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //String data = iterator.next();
        }

        List list2 = new ArrayList();
        list2.addAtTail("1");
        list2.addAtTail("2");
        list2.addAtTail("3");


        Iterator it = list2.getIterator();

        System.out.println("ArrayList");
        while(it.hasNext()){
            System.out.println(it.next());
            //String data = iterator.next();
        }


    }


}
