package kovalevskyi.collections;

import java.util.Collection;
import java.util.Iterator;

public class ArrayCollection<T> implements Collection<T> {
    private T[] array = (T[]) new Object[1];
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ElementsIterator();
    }

    private class ElementsIterator implements Iterator<T> {
        private int size;

        @Override
        public boolean hasNext() {
            return ArrayCollection.this.size() > size;
        }

        @Override
        public T next() {
            return ArrayCollection.this.array[size++];
        }
    }

    @Override
    public Object[] toArray() {
        final T[] newArray = (T[]) new Object[this.size];
        System.arraycopy(array, 0, newArray,0, this.size());
        return newArray;
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return (T1[]) this.toArray();
    }

    @Override
    public boolean add(T t) {
        if (array.length == size) {
            final T[] oldArray = array;
            array = (T[]) new Object[this.size() * 2];
            System.arraycopy(oldArray, 0, array, 0, oldArray.length);
        }
        array[size++] = t;
        return true;
    }

    @Override
    public boolean remove(final Object o) {
        for (int i = 0; i < size(); i++) {
            if (array[i].equals(o)) {
                if (i != this.size() - 1) {
                    System.arraycopy(array, i + 1, array, i, this.size() - i - 1);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(final Collection<?> collection) {
        for (final Object item : collection) {
            if (!this.contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        for (final T item : collection) {
            add(item);
        }
        return true;
    }

    @Override
    public boolean removeAll(final Collection<?> collection) {
        for (final Object item : collection) {
            remove(item);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        for (final Object item : this) {
            if (!collection.contains(item)) {
                this.remove(item);
            }
        }
        return true;
    }

    @Override
    public void clear() {
        array = (T[]) new Object[1];
        size = 0;
    }
}
