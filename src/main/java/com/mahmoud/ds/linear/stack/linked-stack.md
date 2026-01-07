# LinkedStack

This module contains a **Stack implementation backed by a Doubly Linked List**.

The stack uses the tail of the list as the top of the stack, enabling efficient
push and pop operations without resizing.

---

## 🧠 How It Works

- Internally uses a `DoublyLinkedList`
- Stack top maps to the **tail node**
- Push → add to tail
- Pop → remove from tail

---

## ⏱ Time Complexity

| Operation | Time Complexity |
|---------|----------------|
| `push` | O(1) |
| `pop` | O(1) |
| `peek` | O(1) |
| `size` | O(1) |

---

## 💾 Space Complexity

- **O(n)** where `n` is the number of elements
- Higher memory usage due to node pointers

---

## ✅ Advantages

- No resizing
- Predictable performance
- Efficient for frequent push/pop operations

---

## ❌ Disadvantages

- Extra memory overhead
- Cache-unfriendly compared to arrays

---

## 🎯 When to Use

✔ Highly dynamic stacks  
✔ Unknown or unpredictable size  
✔ Systems where resizing cost is undesirable

---

## 🧠 Learning Notes

- Linked stacks trade memory for flexibility
- Pointer manipulation correctness is critical
