package ru.iterator;

import java.util.*;
import java.util.function.Consumer;

public class MyIterator<T> implements Iterator<T> {

    private LinkedList<T> elems;

    private T cursor;

    private int index = 0;

    public MyIterator(Collection<? extends T> src) {
        if (src != null) {
            if (!src.isEmpty()) {
                elems = new LinkedList<>(src);
                cursor = elems.getFirst();
            } else {
                elems = new LinkedList<>(src);
            }
        } else {
            elems = new LinkedList<>();
        }
    }

    @Override
    public boolean hasNext() {
        return index < elems.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            cursor = elems.get(index);
            index++;
            return cursor;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
