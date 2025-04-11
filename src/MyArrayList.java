public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private Object[] elements;
    private int length;

    public MyArrayList() {
        elements = new Object[5];
        length = 0;
    }

    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + " not found");
        }
    }

    public void add(T element) {
        if (length == elements.length) increaseCapacity();
        elements[length++] = element;
    }

    public void add(int index, T item) {
        if (length == elements.length) increaseCapacity();
        for (int i = length; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        length++;
    }

    public void set(int index, T item) {
        checkIndex(index);
        elements[index] = item;
    }

    public void addFirst(T item) {
        add(0, item);
    }

    public void addLast(T item) {
        add(item);
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    public T getFirst() {
        return get(0);
    }

    public T getLast() {
        return get(length - 1);
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--length] = null;
    }

    public void removeFirst() {
        remove(0);
    }

    public void removeLast() {
        remove(length - 1);
    }

    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                T a = (T) elements[j];
                T b = (T) elements[j + 1];
                if (a.compareTo(b) > 0) {
                    elements[j] = b;
                    elements[j + 1] = a;
                }
            }
        }
    }

    public int index0f(Object obj) {
        for (int i = 0; i < length; i++) {
            if (elements[i].equals(obj)) return i;
        }
        return -1;
    }

    public int lastIndex0f(Object obj) {
        for (int i = length - 1; i >= 0; i--) {
            if (elements[i].equals(obj)) return i;
        }
        return -1;
    }

    public boolean exists(Object obj) {
        return index0f(obj) != -1;
    }

    public Object[] toArray() {
        Object[] arr = new Object[length];
        System.arraycopy(elements, 0, arr, 0, length);
        return arr;
    }

    public void clear() {
        for (int i = 0; i < length; i++) {
            elements[i] = null;
        }
        length = 0;
    }

    public int size() {
        return length;
    }
}
