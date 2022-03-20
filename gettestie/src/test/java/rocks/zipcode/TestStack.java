package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void hashSetTest() {
        Set<String> hashSetting = new HashSet<>();
        hashSetting.add("Bubble");
        hashSetting.add("Bubble");
        hashSetting.add("Toil");
        hashSetting.add("and");
        hashSetting.add("Trouble");
        hashSetting.remove("and");
        Iterator<String> index = hashSetting.iterator();
        while (index.hasNext()) {
            System.out.println(index.next()+ " ");
        }
        Assert.assertTrue(hashSetting.contains("Toil"));
        Assert.assertTrue(hashSetting.size() == 3);

    }

    @Test
    public void arrayListTest() {
        List<String> listings = new ArrayList<>();
        listings.add("My");
        listings.add("Name");
        listings.add("Is");
        listings.add("Slim");
        listings.add("Shady");
        Assert.assertTrue(listings.contains("Shady"));
        listings.remove("Shady");
        Assert.assertFalse(listings.contains("Shady"));
        Assert.assertTrue(listings.size() == 4);
    }

    @Test
    public void hashMapTest() {
        Map<String, Integer> theExos = new HashMap<>();
        theExos.put("Baekhyun", 4);
        theExos.put("Kai", 88);
        theExos.put("Suho", 1);
        theExos.put("Jimin", 94);
        Assert.assertFalse(theExos.isEmpty());
        Integer number = theExos.get("Baekhyun");
        assertEquals(4, (int) number);
        theExos.remove("Jimin");
        System.out.println(theExos.keySet());
    }

    @Test
    public void linkedListTest() {
        LinkedList<String> flowers = new LinkedList<>();
    }

    @Test
    public void arrayDequeTest() {
    }

    @Test
    public void vectorTest() {
    }

    @Test
    public void treeMapTest() {
    }

    @Test
    public void stackTest() {
    }

    @Test
    public void treeSetTest() {
    }

    @Test
    public void iteratorTest() {
    }

    @Test
    public void priorityQueueTest() {
    }

    @Test
    public void comparableTest() {
    }
}
