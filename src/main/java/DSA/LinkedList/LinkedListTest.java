package DSA.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<Integer> linkedlist;

    @BeforeEach
    void setUp() {
        linkedlist = new LinkedList<>();
    }

    @AfterEach
    void tearDown() {
        linkedlist = null;
    }

    @Test
    void testRemoveFirst() {
        linkedlist.addFirst(10);
        linkedlist.addFirst(20);
        linkedlist.addFirst(30);

        Integer removed = linkedlist.remove(0);
        assertEquals(30, removed);
        assertEquals(2, linkedlist.size());
    }




    @Test
    void testRemoveFromEmptyList() {
        assertThrows(IllegalCallerException.class, () -> linkedlist.remove(0));
    }

    @Test
    void testCloneEmptyList() throws CloneNotSupportedException {
        LinkedList<Integer> clonedList = linkedlist.clone();
        assertTrue(clonedList.isEmpty());
    }

    @Test
    void testSizeAfterMultipleRemovals() {
        linkedlist.addFirst(10);
        linkedlist.addFirst(20);
        linkedlist.addFirst(30);
        linkedlist.remove(0);
        assertEquals(2, linkedlist.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(linkedlist.isEmpty());
        linkedlist.addFirst(10);
        assertFalse(linkedlist.isEmpty());
    }

    @Test
    void testAddFirst() {
        linkedlist.addFirst(10);
        linkedlist.addFirst(20);
        assertEquals(20, linkedlist.getFirst());
        assertEquals(2, linkedlist.size());
    }

    @Test
    void testAddLast() {
        linkedlist.addLast(10);
        linkedlist.addLast(20);
        assertEquals(20, linkedlist.getLast());
        assertEquals(2, linkedlist.size());
    }

    @Test
    void testClear() {
        linkedlist.addFirst(10);
        linkedlist.addLast(20);
        linkedlist.clear();
        assertTrue(linkedlist.isEmpty());
        assertEquals(0, linkedlist.size());
    }


}
