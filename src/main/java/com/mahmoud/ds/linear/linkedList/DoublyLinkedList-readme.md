# Doubly Linked List (From Scratch)

This module contains a custom implementation of a **Doubly Linked List** in Java, built from scratch to understand how bidirectional linked data structures work internally.

The implementation focuses on correctness, performance, and real-world usage patterns such as inserting and removing elements from both ends efficiently.

---

## 📌 Overview

A Doubly Linked List is a linear data structure where each node contains:
- A value
- A reference to the next node
- A reference to the previous node

This allows:
- Traversal in both directions
- Efficient insertion and removal at both ends
- Easier node deletion compared to singly linked lists

---

## 🧠 Key Characteristics

- Maintains both **head** and **tail** references
- Each node has `next` and `prev` pointers
- Dynamic size (no resizing required)
- Supports deque-like operations

---

## ⚙️ Supported Operations

- `pushFront(value)` — insert at the beginning
- `pushBack(value)` — insert at the end
- `popFront()` — remove from the beginning
- `popBack()` — remove from the end
- `get(index)` — access element by index
- `remove(index)` — remove element by index

---

## ⏱ Time Complexity

| Operation | Time Complexity |
|---------|----------------|
| `pushFront` | O(1) |
| `pushBack` | O(1) |
| `popFront` | O(1) |
| `popBack` | O(1) |
| `get(index)` | O(n) |
| `remove(index)` | O(n) |
| `size()` | O(1) |
| `isEmpty()` | O(1) |

> Traversal is optimized by starting from the closest end (head or tail).

---

## 💾 Space Complexity

- **O(n)** where `n` is the number of elements
- Extra memory overhead due to two pointers per node (`next`, `prev`)

---

## 🔍 Comparison with Singly Linked List

| Feature | Singly Linked List | Doubly Linked List |
|------|-------------------|-------------------|
| Traversal | One direction | Both directions |
| Remove node | Needs previous | Direct |
| Insert/remove ends | O(1) / O(n) | O(1) / O(1) |
| Memory usage | Lower | Higher |

---

## 🧪 Testing

This implementation is fully covered using **JUnit 5** unit tests.

Tests include:
- Insertion at front and back
- Removal from front and back
- Indexed access and removal
- Boundary and edge cases
- Empty list scenarios

Testing ensures correctness and helps catch pointer-related bugs early.

---

## ⚠️ Common Pitfalls

- Forgetting to update both `next` and `prev` pointers
- Not handling head/tail updates correctly
- Missing size updates during removal
- Off-by-one errors when traversing

---

## 🎯 When to Use Doubly Linked List

✔ Frequent insertions and deletions at both ends  
✔ Need bidirectional traversal  
✔ Deque or cache-like behavior

❌ Heavy random access  
❌ Memory-sensitive systems

---

## 🧠 Learning Notes

- Maintaining both head and tail enables O(1) operations at both ends
- Optimized traversal improves real-world performance without changing Big-O
- Most bugs come from incorrect pointer manipulation, not logic
