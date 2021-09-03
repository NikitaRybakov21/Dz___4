import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
       SomeIterable someIterable = new SomeIterable();

        for (Iterator<Integer> i = someIterable.iterator(); i.hasNext();) {
            int item = i.next();
            System.out.println(item);
        }
    }
}
