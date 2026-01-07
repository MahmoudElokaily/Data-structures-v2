# ArrayQueue

This module provides a **Queue implementation backed by a Dynamic Array**.

It uses an index (`front`) to track the front of the queue, avoiding costly
element shifting during dequeue operations.

---

## 📌 Overview

- Internally uses a custom `DynamicArray`
- Enqueue adds elements to the end of the array
- Dequeue reads elements from the front index
- No element shifting is performed

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
| `enqueue` | O(1) amortized |
| `dequeue` | O(1) |
| `peek` | O(1) |
| `size` | O(1) |

---

## 💾 Space Complexity

- **O(n)** where `n` is the number of elements
- Additional unused space may exist due to dynamic resizing

---

## ⚠️ Important Note

This implementation is **educational**:
- The `front` index grows over time
- In production systems, a **circular buffer** or periodic compaction would be used

---

## ✅ Advantages

- Fast enqueue and dequeue
- Cache-friendly
- Simple implementation

---

## ❌ Disadvantages

- Front index can grow indefinitely
- Not memory-optimal without cleanup

---

## 🎯 When to Use

✔ Learning and understanding queue mechanics  
✔ Performance-focused scenarios  
✔ Situations where simplicity is preferred

---

## 🧠 Learning Notes

- Avoiding shifting is critical for performance
- Circular queues solve the front-growth limitation
