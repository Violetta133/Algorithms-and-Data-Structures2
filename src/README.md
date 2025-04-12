## Interfaces and Classes

### MyList<T>
A generic interface that defines basic list operations:
- `add(T item)`: Adds to end.
- `add(int index, T item)`: Adds at specific index.
- `addFirst(T item)`, `addLast(T item)`: Adds at beginning or end.
- `set(int index, T item)`: Updates element.
- `get(int index)`, `getFirst()`, `getLast()`: Access elements.
- `remove(int index)`, `removeFirst()`, `removeLast()`: Remove elements.
- `sort()`: Sorts the list using bubble sort.
- `index0f(Object o)`, `lastIndex0f(Object o)`: Search for index.
- `exists(Object o)`: Checks presence.
- `toArray()`: Returns contents as an array.
- `clear()`: Clears all elements.
- `size()`: Returns current size.

### MyArrayList<T>
Implements `MyList<T>` using a dynamic array.
- Automatically resizes when capacity is full.
- Elements stored in an `Object[]` array.
- Supports all MyList operations.

### MyLinkedList<T>
Implements `MyList<T>` using a doubly linked list.
- Uses inner class `MyNode` to store nodes with `prev` and `next`.
- Suitable for fast insertions/removals in the middle.
- Supports all MyList operations.

### MyStack<T>
Implements a LIFO stack using `MyArrayList<T>`.
- `push(T item)`: Adds to top.
- `pop()`: Removes and returns top.
- `peek()`: Returns top without removing.
- `isEmpty()`, `size()`: Stack info.

### MyQueue<T>
Implements a FIFO queue using `MyLinkedList<T>`.
- `enqueue(T item)`: Adds to end.
- `dequeue()`: Removes from front.
- `peek()`: Returns front element.
- `isEmpty()`, `size()`: Queue info.

### MyMinHeap<T>
Implements a min-heap using `MyArrayList<T>`.
- `insert(T value)`: Adds and reorders heap.
- `removeMin()`: Removes and returns min value.
- `peekMin()`: Returns min without removing.


