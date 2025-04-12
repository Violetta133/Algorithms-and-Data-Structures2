public class Main {
    public static void main(String[] args) {
        //MyArrayList
        System.out.println("MyArrayList");
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.addFirst(5);
        arrayList.addLast(40);
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("First element: " + arrayList.getFirst());
        System.out.println("Last element: " + arrayList.getLast());
        arrayList.sort();
        System.out.println("Sorted array list:");
        for (Object o : arrayList.toArray()) {
            System.out.print(o + " ");
        }
        System.out.println("\nIndex of 20: " + arrayList.index0f(20));

        //MyLinkedList
        System.out.println("\nMyLinkedList");
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("C");
        linkedList.addFirst("A");
        linkedList.add(1, "B");
        linkedList.addLast("D");
        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("Elements:");
        for (Object o : linkedList.toArray()) {
            System.out.print(o + " ");
        }
        System.out.println("\nIndex of 'B': " + linkedList.index0f("B"));

        //MyStack
        System.out.println("\nMyStack");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        //MyQueue
        System.out.println("\nMyQueue");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("apple");
        queue.enqueue("banana");
        queue.enqueue("cherry");
        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());

        //MyMinHeap
        System.out.println("\nMyMinHeap");
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.insert(50);
        minHeap.insert(30);
        minHeap.insert(20);
        minHeap.insert(40);
        minHeap.insert(10);
        System.out.println("Heap size: " + minHeap.size());
        System.out.println("Minimum element: " + minHeap.peekMin());
        System.out.println("Removed min: " + minHeap.removeMin());
        System.out.println("New min after removal: " + minHeap.peekMin());
    }
}

