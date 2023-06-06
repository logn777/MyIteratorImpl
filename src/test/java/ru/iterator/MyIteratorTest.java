package ru.iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyIteratorTest {

    private MyIterator<Integer> iterator;

    private List<Integer> testData;

    @BeforeEach
    public void setUp() {
        testData = new LinkedList<>();

        testData.add(2);
        testData.add(2);
        testData.add(3);
        testData.add(4);
        testData.add(5);
        testData.add(6);
        testData.add(7);
        testData.add(8);

        iterator = new MyIterator<>(testData);
    }

    @Test
    public void hasNext() {
        assertTrue(iterator.hasNext());
    }

    @Test
    public void next() {
        Integer test = 2;
        assertEquals(test, iterator.next());
    }

    @Test
    void remove() {
        assertThrows(UnsupportedOperationException.class, () -> iterator.remove());
    }

}