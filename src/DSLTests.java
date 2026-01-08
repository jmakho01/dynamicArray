import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DSLTests {

    @Test
    void testGet() {
        DynamicStringList list1 = new DynamicStringList();
        list1.add("Testing");
        list1.add("Testing");
        list1.add("is");
        list1.add("this");
        list1.add("thing");
        list1.add("on?");

        assertEquals("is", list1.get(2));
        assertEquals("thing", list1.get(4));
    }

    @Test
    void testSize() {
        DynamicStringList list1 = new DynamicStringList();
        list1.add("Hello");
        list1.add("World");
        assertEquals(2, list1.size());
        list1.add("!");
        assertEquals(3, list1.size());
    }

    @Test
    void testSet() {
        DynamicStringList list1 = new DynamicStringList();
        list1.add("Testing");
        list1.add("Testing");
        list1.add("is");
        list1.add("this");
        list1.add("thing");
        list1.add("on?");

        list1.set(4, "computer");
        list1.set(5, "working");
        assertEquals("computer", list1.get(4));
        assertEquals("working", list1.get(5));
    }

    @Test 
    void testRemove() {
        DynamicStringList list1 = new DynamicStringList();
        list1.add("Testing");
        list1.add("Testing");
        list1.add("is");
        list1.add("this");
        list1.add("thing");
        list1.add("on?");

        list1.remove(3);
        list1.remove(4);
        list1.remove(3);
        assertEquals(3, list1.size());
    }

    @Test
    void testCapacity() {
        DynamicStringList list1 = new DynamicStringList();
        DynamicStringList list2 = new DynamicStringList(15);

        assertEquals(10, list1.capacity());
        assertEquals(15, list2.capacity());
    }
}
