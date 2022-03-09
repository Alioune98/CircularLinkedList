import java.util.Iterator;

/**
 * Test class for the circular list
 */
public class CircularListTest {
    public static void main(String[] args) {
        CircularList<Integer> list = new CircularList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();
        for (int i = 0; i < 5; i++){
            System.out.println(list.get());
            it.next();
        }
        System.out.println();

        it.remove();

        for (int i = 0; i < 5; i++){
            System.out.println(list.get());
            it.next();
        }
        System.out.println(list.get());
    }
}
