package uaslp.objetos.list.linkedlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import uaslp.objetos.list.exceptions.BadIndexException;
import uaslp.objetos.list.exceptions.NotNullAllowedException;
import uaslp.objetos.list.linkedlist.LinkedList;

public class LinkedListTest {
    @Test
    public void whenListIsCreated_thenSizeIsZero(){

        //initialization
        LinkedList<String> list = new LinkedList<>();

        //execution
        int size = list.getSize();

        //validation
        Assertions.assertEquals(0,size);
    }

    @Test
    public void givenAnEmptyList_whenAddAtTail_thenElementIsInserted() throws NotNullAllowedException {

        //initialization
        LinkedList<String> list = new LinkedList<>();

        //execution
        list.addAtTail("1");

        //validation
        Assertions.assertEquals(1,list.getSize());



    }

    @Test
    public void givenANonEmptyList_whenAddAtTail_thenElementIsInserted() throws NotNullAllowedException {

        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("1");

        //execution
        list.addAtTail("2");

        //validation
        Assertions.assertEquals(2,list.getSize());

    }

    @Test
    public void givenAList_whenAddAtTailNullValue_thenExceptionIsThrown()  {

        //initialization
        LinkedList<String> list = new LinkedList<>();


        //execution
        Assertions.assertThrows(NotNullAllowedException.class, () -> list.addAtTail(null));

        //validation
        Assertions.assertEquals(0,list.getSize());

    }

    @Test
    public void givenAnEmptyList_whenAddAtFront_thenElementIsInserted() throws NotNullAllowedException {

        //initialization
        LinkedList<String> list = new LinkedList<>();

        //execution
        list.addAtFront("1");

        //validation
        Assertions.assertEquals(1,list.getSize());


    }

    @Test
    public void givenANonEmptyList_whenAddAtFront_thenElementIsInserted() throws NotNullAllowedException {

        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtFront("1");

        //execution
        list.addAtFront("2");

        //validation
        Assertions.assertEquals(2,list.getSize());

    }

    @Test
    public void givenAList_whenAddAtFrontNullValue_thenExceptionIsThrown()  {

        //initialization
        LinkedList<String> list = new LinkedList<>();


        //execution
        Assertions.assertThrows(NotNullAllowedException.class, () -> list.addAtFront(null));

        //validation
        Assertions.assertEquals(0,list.getSize());

    }


    @Test
    public void givenAList_whenRemoveWrongIndex_thenExceptionIsThrown(){

        //initialization
        LinkedList<String> list = new LinkedList<>();


        //execution
        Assertions.assertThrows(BadIndexException.class, () -> list.remove(3));

        //validation
        Assertions.assertEquals(0,list.getSize());

    }

    @Test
    public void givenAListWithIsDifferentNull_whenRemove_thenElementIsRemoved() throws NotNullAllowedException, BadIndexException {

        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("10");
        //execution
        list.remove(0);

        //validation
        Assertions.assertEquals(1,list.getSize());
    }

    @Test
    public void givenAList_whenRemove_thenElementsAreRemoved() throws NotNullAllowedException, BadIndexException {

        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("10");
        //execution
        list.remove(0);

        //validation
        Assertions.assertEquals(1,list.getSize());
    }



    @Test
    public void givenAListWithXElements_whenRemoveAll_thenElementsAreRemoved() throws NotNullAllowedException{

        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("10");
        list.addAtTail("3");
        list.addAtTail("2");
        //execution

        list.removeAll();

        //validation
        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAListWithOneElement_whenRemoveAll_thenElementIsRemoved() throws NotNullAllowedException{

        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("10");
        //execution

        list.removeAll();

        //validation
        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAListWithValue_whenRemoveWithValue_thenElementIsRemoved() throws NotNullAllowedException{

        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("3");
        list.addAtTail("1");
        list.addAtTail("5");
        //execution

        list.removeAllWithValue("1");

        //validation
        Assertions.assertEquals(2,list.getSize());

    }

    @Test
    public void givenAList_whenGetAtIndexInvalid() throws NotNullAllowedException {
        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("10");
        //execution
        list.getAt(2);

        //validation
        Assertions.assertEquals(1,list.getSize());
    }

    @Test
    public void givenAList_whenGetAtIndex() throws NotNullAllowedException {
        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("10");
        list.addAtTail("3");
        //execution
        list.getAt(1);

        //validation
        Assertions.assertEquals(2,list.getSize());
    }

    @Test
    public void givenAList_whenSetAt_thenExceptionIsThrown(){

        //initialization
        LinkedList<String> list = new LinkedList<>();


        //execution
        Assertions.assertThrows(BadIndexException.class, () -> list.setAt(1,"2"));
        Assertions.assertThrows(NotNullAllowedException.class, () -> list.setAt(1,null));

        //validation
        Assertions.assertEquals(0,list.getSize());

    }
    @Test
    public void givenAList_whenSetAtIndex() throws NotNullAllowedException, BadIndexException {
        //initialization
        LinkedList<String> list = new LinkedList<>();
        list.addAtTail("10");
        list.addAtTail("3");
        //execution
        list.setAt(1,"10");

        //validation
        Assertions.assertEquals(2,list.getSize());
    }



}

