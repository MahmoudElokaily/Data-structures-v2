# Binary Search Tree (BST)

This module contains a clean implementation of a **Binary Search Tree (BST)** in Java,
built from scratch as part of a deeper revision of core **Data Structures**.

The implementation focuses on correctness, simplicity, and understanding the
fundamental behavior of trees without relying on built-in collections.

---

## 🌳 What is a Binary Search Tree?

A Binary Search Tree is a binary tree with the following property:

- All values in the left subtree are **less than** the node value
- All values in the right subtree are **greater than** the node value

This property enables efficient search, insertion, and traversal operations.

---

## 📌 Supported Operations

- `insert(value)` — insert a new value into the tree
- `contains(value)` — check if a value exists in the tree
- `size()` — number of elements in the tree
- `isEmpty()` — check if the tree is empty

Duplicate values are ignored to preserve BST properties.

---

## ⏱ Time Complexity

| Operation | Average Case | Worst Case |
|---------|--------------|------------|
| Insert  | O(log n)     | O(n) |
| Search  | O(log n)     | O(n) |
| Size   | O(1)         | O(1) |

> Worst case occurs when the tree becomes skewed (similar to a linked list).

---

## 💾 Space Complexity

- **O(n)** where `n` is the number of nodes in the tree
- Additional space due to recursion depth (up to tree height)

---

## 🧠 Design Notes

- Implemented using recursion for clarity and correctness
- Generic type constrained with `Comparable` to enforce ordering
- Internal `Node` class is tightly coupled with the tree for simplicity
- Tree behavior is abstracted using a `Tree` interface

---

## 🧪 Testing

The implementation is fully tested using **JUnit 5**.

Tests cover:
- Empty tree behavior
- Insertion of elements
- Searching existing and non-existing values
- Duplicate handling
- Left-skewed and right-skewed trees
- Mixed insert/search scenarios

---

## ⚠️ Limitations

- This BST is **not self-balancing**
- Performance may degrade to O(n) in the worst case

For guaranteed balanced performance, consider:
- AVL Trees
- Red-Black Trees

---

## 🎯 When to Use a BST

✔ When data needs to be stored in sorted order  
✔ When average-case performance is acceptable  
✔ For learning and understanding tree fundamentals

❌ When strict performance guarantees are required

---

## 🧠 Learning Takeaways

- Trees naturally lend themselves to recursive solutions
- Ordering constraints define the power of BSTs
- Lack of balancing is the key drawback of basic BSTs
