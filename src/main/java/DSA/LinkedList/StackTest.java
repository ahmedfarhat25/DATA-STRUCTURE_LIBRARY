package DSA.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    }

    @AfterEach
    void tearDown() {
        stack = null; // Optional: Clean up the stack instance
    }

    @Test
    void push() {
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.peek()); // Verify the top element is 7
        assertEquals(7, stack.size()); // Assuming the stack size is now 7
    }

    @Test
    void pop() {
        assertEquals(4, stack.pop()); // Assuming pop removes and returns the top element
        assertEquals(3, stack.peek()); // Verify the new top element is 3
        assertEquals(3, stack.size()); // Verify the size has decreased
    }

    @Test
    void peek() {
        assertEquals(4, stack.peek()); // Verify the top element is 4 without removal
    }

    @Test
    void isEmpty() {
        assertFalse(stack.isEmpty()); // The stack should not be empty
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty()); // The stack should now be empty
    }

    @Test
    void testToString() {
        String expected = "[1]"; // Assuming the stack's toString outputs in this format
        assertEquals(expected, stack.toString());
    }
}
