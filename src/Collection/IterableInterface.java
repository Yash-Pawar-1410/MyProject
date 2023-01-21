package Collection;

import java.util.Iterator;

public class IterableInterface {
    public static void main(String[] args) {
        Iterable iterable =()-> new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}
