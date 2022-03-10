import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the circular list
 */
public class CircularListTest {
    @Test
    @DisplayName("Add integers to the list")
    void add() {
        CircularList<Integer> list = new CircularList<>();
        list.add(1);
        assertEquals(1, list.get());
    }

    @Test
    @DisplayName("Retrieves number from list")
    void get() {
        CircularList<Integer> list  = new CircularList<>();
            list.add(1);
            assertEquals(1, list.get());
            list.add(2);
            assertEquals(2, list.get());
            list.add(3);
            assertEquals(3, list.get());
            list.add(4);
            assertEquals(4, list.get());
            list.add(5);
            assertEquals(5, list.get());
    }

    @Test
    @DisplayName("Retrieves the size of the list")
    void size() {
        CircularList<Integer> list1 = new CircularList<>();
        assertEquals(0, list1.size());
        CircularList<Integer> list2 = new CircularList<>();
        assertEquals(0, list2.size());
        CircularList<Integer> list3 = new CircularList<>();
        assertEquals(0, list3.size());
        CircularList<Integer> list4 = new CircularList<>();
        assertEquals(0, list4.size());
        CircularList<Integer> list5 = new CircularList<>();
        assertEquals(0, list5.size());
    }
}
