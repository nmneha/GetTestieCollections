package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import sun.lwawt.macosx.CSystemTray;

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
        System.out.println("Before: " + theExos.keySet());
        Assert.assertFalse(theExos.isEmpty());
        Integer number = theExos.get("Baekhyun");
        assertEquals(4, (int) number);
        theExos.remove("Jimin");
        System.out.println("After " + theExos.keySet());
    }

    @Test
    public void linkedListTest() {
        LinkedList flowers = new LinkedList();
        flowers.add("tulips");
        flowers.add(0, "lavender");
        System.out.println("At index 0: " + flowers.peekFirst());
        System.out.println("At index 1: " + flowers.get(1));
        flowers.addLast("baby's breath");
        flowers.addFirst("lily of the valley");
        System.out.println("At the beginning: " + flowers.get(0));
        System.out.println("At the end: " + flowers.get(3));
        System.out.println("Before pop: " + flowers);
        System.out.println(flowers.pop());
        System.out.println("After pop: " + flowers);
        flowers.push("lily of the valley");
        flowers.push("quartz");
        flowers.pop();
        System.out.println("After push: " + flowers); //USES LIFO
    }

    @Test
    public void arrayDequeTest() {
        ArrayDeque<String> pokemon = new ArrayDeque<>(3);
        List<String> starters = new ArrayList<>(Arrays.asList("bulbasaur", "squirtle", "charmander"));
        pokemon.addAll(starters);
        System.out.println("Originals: " + pokemon);
        pokemon.add("pikachu");
        System.out.println("Added pikachu: " + pokemon);
        ArrayDeque<String> pokemon2 = pokemon.clone();
        System.out.println("Cloned pokemon: " + pokemon2);
        pokemon2.clear();
        System.out.println("Cleared pokemon2: " + pokemon2);
        System.out.println(pokemon2.contains("charmander"));
        System.out.println(pokemon2.isEmpty());
        Iterator pokemons = pokemon.iterator();
        System.out.println("List of pokemon: ");
        while (pokemons.hasNext()) {
            System.out.println(pokemons.next());
        }
    }

    @Test
    public void vectorTest() {
        Vector<String> avatar = new Vector<String>();
        avatar.add("earth");
        avatar.add("air");
        avatar.add("water");
        avatar.add("fire");
        avatar.add("metal");
        System.out.println(avatar.capacity());
        for (String element : avatar) {
            System.out.println(element);
        }
        System.out.println(avatar);
        avatar.remove(4);
        System.out.println(avatar);
    }

    @Test
    public void treeMapTest() {
        TreeMap<String, String> avengers = new TreeMap<>();
        avengers.put("Tony Stark", "Iron Man");
        avengers.put("Steve Rogers", "Captain America");
        avengers.put("Natasha Romanoff", "Black Widow");
        avengers.put("CLint Barns", "Hawkeye");
        avengers.put("Bruce Banner", "Hulk");
        avengers.put("Thor Odinson", "Thor");
        System.out.println("Avengers size: " + avengers.size());
        System.out.println("Avengers, Assemble!\n" + avengers);
        Assert.assertFalse(avengers.containsKey("Peter Parker"));
        Assert.assertFalse(avengers.containsValue("Spider-Man"));
        System.out.println("Tony Stark is " + avengers.get("Tony Stark"));
        Comparator<String> compare = (Comparator<String>) avengers.comparator();
        System.out.println("Comparator is: " + compare);
    }

    @Test
    public void treeSetTest() { //autosorts ints (0 ->), strings (a ->)
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(45);
        nums.add(36);
        Integer number = 56;
        System.out.println(nums.ceiling(number));
        List<Integer> numList = new ArrayList<>(Arrays.asList(33, 98, 15, 74));
        nums.addAll(numList);
        System.out.println(nums);
        System.out.println(nums.floor(number));
        nums.pollFirst();
        nums.pollLast();
        System.out.println(nums);
    }

    @Test
    public void iteratorTest() {
        List<String> bouquet = new ArrayList<>(Arrays.asList("lavender", "lilac", "lily", "rose", "daisy"));
        Iterator<String> flower = bouquet.iterator();
        while (flower.hasNext()) {
            System.out.println(flower.next()+ " ");
        }
    }

    @Test
    public void priorityQueueTest() {

    }

    @Test
    public void comparableTest() {
    }
}
