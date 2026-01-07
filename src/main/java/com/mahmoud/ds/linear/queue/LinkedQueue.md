# LinkedQueue

This module contains a **Queue implementation backed by a Doubly Linked List**.

It uses the head of the list as the front of the queue and the tail as the back,
allowing efficient operations without resizing.

---

## 📌 Overview

- Internally uses a `DoublyLinkedList`
- Enqueue adds elements to the tail
- Dequeue removes elements from the head
- No resizing or index management required

---

## ⚙️ Supported Operations

- `enqueue(value)`
- `dequeue()`
- `peek()`
- `size()`
- `isEmpty()`

---

## ⏱ Time Complexity

| Operation | Time Complexity |
|---------|----------------|
| `enqueue` | O(1) |
| `dequeue` | O(1) |
| `peek` | O(1) |
| `size` | O(1) |

---

## 💾 Space Complexity

- **O(n)** where `n` is the number of elements
- Extra memory used for node pointers

---

## ✅ Advantages

- No resizing cost
- Predictable performance
- Ideal for highly dynamic queues

---

## ❌ Disadvantages

- Higher memory overhead
- Cache-unfriendly compared to arrays

---

## 🎯 When to Use

✔ Unknown or highly dynamic queue sizes  
✔ Systems where resizing cost must be avoided  
✔ Deque and scheduler-like use cases

---

## 🧠 Learning Notes

- Linked queues trade memory for flexibility
- Pointer correctness is critical for stability
