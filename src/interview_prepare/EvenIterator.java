package interview_prepare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenIterator implements Iterator<Integer> {
    private final List<Integer> list;
    private int currentIndex = 0;

    public EvenIterator(List<Integer> list) {
        this.list = list;
    }

    public boolean hasNext() {
        while (currentIndex < list.size()) {
            if (list.get(currentIndex) % 2 != 0) return true;
            currentIndex++;
        }
        return false;
    }

    public Integer next() {
        if (hasNext()) return list.get(currentIndex);
        else return null;
    }
}