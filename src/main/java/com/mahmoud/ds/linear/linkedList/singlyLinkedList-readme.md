# Singly Linked List (From Scratch)

This module contains a custom implementation of a **Singly Linked List** in Java, built from scratch to understand how linked structures work internally without relying on built-in collections.

The implementation focuses on correctness, clarity, and understanding trade-offs compared to array-based structures.

---

## 📌 Overview

A Singly Linked List is a linear data structure composed of **nodes**, where each node contains:
- A value
- A reference to the next node

Unlike arrays:
- Memory is not contiguous
- There is no direct index-based access
- Insertions and removals do not require shifting elements

---

## 🧠 Key Characteristics

- Each node points only to the **next** node
- The list maintains a reference to the **head**
- Size is tracked explicitly
- Nodes are allocated dynamically

---

## ⏱ Time Complexity

| Operation | Time Complexity | Notes |
|---------|----------------|------|
| `add(value)` | O(n) | Traverses to the end |
| `get(index)` | O(n) | Sequential traversal |
| `remove(index)` | O(n) | Requires finding previous node |
| `size()` | O(1) | Stored as a variable |
| `isEmpty()` | O(1) | Simple size check |

---

## 💾 Space Complexity

- **O(n)** where `n` is the number of elements
- Additional memory overhead due to node references (`next`)

---

## ⚙️ Design Decisions

### 1️⃣ Node as an Inner Class
- `Node` is implemented as a **private static inner class**
- Improves encapsulation
- Prevents misuse outside the list implementation

### 2️⃣ No Tail Pointer (Initial Version)
- Simpler implementation
- Makes `add()` O(n)
- Can be optimized later by adding a `tail`

---

## ⚠️ Common Pitfalls

- Forgetting to update references during removal
- Off-by-one errors while traversing
- Incorrect handling of head removal
- Assuming random access is cheap (it is not)

---

## 🔍 Comparison with Dynamic Array

| Feature | Dynamic Array | Singly Linked List |
|------|--------------|-------------------|
| Access by index | O(1) | O(n) |
| Insert/remove middle | O(n) | O(1)\* |
| Memory layout | Contiguous | Non-contiguous |
| Cache friendliness | High | Low |

\* After reaching the node.

---

## 🧪 Testing

This implementation is fully covered by **JUnit 5** unit tests, including:
- Empty list behavior
- Adding elements
- Access by index
- Removing first, middle, and last elements
- Invalid index handling

Tests ensure correctness and catch edge cases early.

---

## 🎯 When to Use Singly Linked List

✔ Frequent insertions and deletions  
✔ Unknown or highly dynamic size  
✔ Sequential access patterns

❌ Heavy random access  
❌ Cache-sensitive workloads

---

## 🚀 Possible Improvements

- Add a `tail` pointer to make `add()` O(1)
- Implement an iterator
- Create a Doubly Linked List variant
- Add reverse operation

---

## 🧠 Learning Notes

- Removing a node breaks references automatically, allowing garbage collection
- Linked lists trade memory and cache efficiency for flexibility
- Most bugs come from incorrect reference updates, not syntax
