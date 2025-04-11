public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next, prev;
        MyNode(T data) { this.data = data; }
    }

    private MyNode head, tail;
    private int length;

    public MyLinkedList() {
        head = tail = null;
        length = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException("Index: " + index + " not found");
    }

    private MyNode getNode(int index) {
        checkIndex(index);
        MyNode current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current;
    }

    public void add(T item) {
        addLast(item);
    }

    public void add(int index, T item) {
        if (index == 0) {
            addFirst(item);
        } else if (index == length) {
            addLast(item);
        } else {
            MyNode next = getNode(index);
            MyNode prev = next.prev;
            MyNode newNode = new MyNode(item);
            newNode.next = next;
            newNode.prev = prev;
            prev.next = newNode;
            next.prev = newNode;
            length++;
        }
    }

    public void set(int index, T item) {
        getNode(index).data = item;
    }

    public void addFirst(T item) {
        MyNode node = new MyNode(item);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public void addLast(T item) {
        MyNode node = new MyNode(item);
        if (tail == null) {
            head = tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public T get(int index) {
        return getNode(index).data;
    }

    public T getFirst() {
        return head.data;
    }

    public T getLast() {
        return tail.data;
    }

    public void remove(int index) {
        MyNode node = getNode(index);
        if (node.prev != null) node.prev.next = node.next;
        else head = node.next;
        if (node.next != null) node.next.prev = node.prev;
        else tail = node.prev;
        length--;
    }

    public void removeFirst() {
        remove(0);
    }

    public void removeLast() {
        remove(length - 1);
    }

    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            MyNode nodeI = getNode(i);
            for (int j = i + 1; j < length; j++) {
                MyNode nodeJ = getNode(j);
                if (nodeI.data.compareTo(nodeJ.data) > 0) {
                    T temp = nodeI.data;
                    nodeI.data = nodeJ.data;
                    nodeJ.data = temp;
                }
            }
        }
    }

    public int index0f(Object object) {
        MyNode current = head;
        for (int i = 0; current != null; i++, current = current.next) {
            if (current.data.equals(object)) return i;
        }
        return -1;
    }

    public int lastIndex0f(Object object) {
        MyNode current = tail;
        for (int i = length - 1; current != null; i--, current = current.prev) {
            if (current.data.equals(object)) return i;
        }
        return -1;
    }

    public boolean exists(Object object) {
        return index0f(object) != -1;
    }

    public Object[] toArray() {
        Object[] arr = new Object[length];
        MyNode current = head;
        for (int i = 0; i < length; i++, current = current.next) {
            arr[i] = current.data;
        }
        return arr;
    }

    public void clear() {
        head = tail = null;
        length = 0;
    }

    public int size() {
        return length;
    }
}
