package uaslp.objetos.list.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.exceptions.BadIndexException;
import uaslp.objetos.list.exceptions.NotNullAllowedException;


public class ArrayListTest {

    @Test
    public void whenListIsCreated_thenSizeIsZero1(){

        //initialization
        ArrayList <String> list = new ArrayList<>();
        //execution
        int size = list.getSize();
        //validation
        Assertions.assertEquals(0,size);
    }

    @Test
    public void givenAnEmptyList_whenAddAtTail_thenElementIsInserted() throws NotNullAllowedException {

        //initialization
        ArrayList<String> list = new ArrayList<>();

        //execution
        list.addAtTail("1");

        //validation
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("1",list.getAt(0));
    }

    @Test
    public void givenAList_whenAddAtTailNullValue_thenExceptionIsThrown()  {

        //initialization
        ArrayList<String> list = new ArrayList<>();


        //execution
        Assertions.assertThrows(NotNullAllowedException.class, () -> list.addAtTail(null));

        //validation
        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_whenAddAtTail_thenArrayIsFull() throws NotNullAllowedException {

        //initialization
        ArrayList<String> list = new ArrayList<>();

        //execution
        list.addAtTail("1");
        list.addAtTail("2");
        list.addAtTail("3");
        //validation
        Assertions.assertEquals(3, list.getSize());
        Assertions.assertEquals("1",list.getAt(0));
        Assertions.assertEquals("2",list.getAt(1));
        Assertions.assertEquals("3",list.getAt(2));
    }

    @Test
    public void givenAList_whenAddAtFront_thenElementIsInserted() throws NotNullAllowedException {

        //initialization
        ArrayList<String> list = new ArrayList<>();

        //execution
        list.addAtFront("1");

        //validation
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("1",list.getAt(0));
    }

    @Test
    public void givenAList_whenAddAtFrontNullValue_thenExceptionIsThrown()  {

        //initialization
        ArrayList<String> list = new ArrayList<>();


        //execution
        Assertions.assertThrows(NotNullAllowedException.class, () -> list.addAtFront(null));

        //validation
        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_whenAddAtFront_thenArrayIsFull() throws NotNullAllowedException {

        //initialization
        ArrayList<String> list = new ArrayList<>();

        //execution
        list.addAtFront("1");
        list.addAtFront("2");
        list.addAtFront("3");
        //validation
        Assertions.assertEquals(3, list.getSize());

    }

    @Test
    public void givenAnEmptyList_whenRemove_thenExceptionIsBad(){

        //initialization
        ArrayList<String> list = new ArrayList<>();

        //execution
        Assertions.assertThrows(BadIndexException.class, () -> list.remove(-1));

        //validation
        Assertions.assertEquals(0, list.getSize());

    }

    @Test
    public void givenAList_whenRemove_thenElementIsRemoved() throws NotNullAllowedException, BadIndexException {

        //initialization
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("1");
        //execution
        list.remove(0);

        //validation
        Assertions.assertEquals(0, list.getSize());

    }

    @Test
    public void givenAList_whenRemoveAll_thenElementsAreRemoved() throws NotNullAllowedException, BadIndexException {

        //initialization
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("1");
        //execution
        list.removeAll();

        //validation
        Assertions.assertEquals(0, list.getSize());

    }

    @Test
    public void givenAnEmptyList_whenSetAt_thenExceptionIsNotThrown(){

        //initialization
        ArrayList<String> list = new ArrayList<>();

        //execution
        Assertions.assertThrows(NotNullAllowedException.class, () -> list.setAt(0,null));

        //validation
        Assertions.assertEquals(0, list.getSize());

    }

    @Test
    public void givenAnEmptyList_whenSetAt_thenExceptionIsBadIndex(){

        //initialization
        ArrayList<String> list = new ArrayList<>();

        //execution
        Assertions.assertThrows(BadIndexException.class, () -> list.setAt(1,"1"));

        //validation
        Assertions.assertEquals(0, list.getSize());

    }

    @Test
    public void givenAList_whenSetAt_thenIndexIsEqualsData() throws NotNullAllowedException, BadIndexException {

        //initialization
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("1");
        //execution
        list.setAt(0,"1");

        //validation
        Assertions.assertEquals(1, list.getSize());
    }

    @Test
    public void givenAList_whenRemoveWithValue_thenElementIsRemoved() throws NotNullAllowedException{

        //initialization
        ArrayList<String> list = new ArrayList<>();
        list.addAtFront("1");
        list.addAtFront("2");
        Assertions.assertEquals(2, list.getSize());
        //execution
        list.removeAllWithValue("2");

        //validation
        Assertions.assertEquals(1, list.getSize());
    }

}
