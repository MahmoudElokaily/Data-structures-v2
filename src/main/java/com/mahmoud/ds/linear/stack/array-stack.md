# ArrayStack

This module provides a **Stack implementation backed by a Dynamic Array**.
It follows the **LIFO (Last In, First Out)** principle and is optimized for
performance and simplicity.

The stack grows dynamically as elements are pushed, relying on the resizing
strategy of the underlying dynamic array.

---

## 📌 Overview

ArrayStack is implemented using a custom `DynamicArray`:
- The **top of the stack** maps to the **last index** of the array
- Push and pop operations work on the end of the array
- Resizing is handled internally by the dynamic array

---

## ⚙️ Supported Operations

- `push(value)` — add element to the top of the stack
- `pop()` — remove and return the top element
- `peek()` — return the top element without removing it
- `size()` — number of elements
- `isEmpty()` — check if the stack is empty

---

## ⏱ Time Complexity

| Operation | Time Complexity |
|---------|----------------|
| `push` | O(1) amortized |
| `pop` | O(1) |
| `peek` | O(1) |
| `size` | O(1) |
| `isEmpty` | O(1) |

> Occasional resizing may cost O(n), but the amortized complexity remains O(1).

---

## 💾 Space Complexity

- **O(n)** where `n` is the number of elements
- Extra unused capacity may exist due to resizing strategy

---

## ✅ Advantages

- Cache-friendly due to contiguous memory
- Very fast in practice
- Simple and clean implementation
- Minimal pointer overhead

---

## ❌ Disadvantages

- Resizing may cause occasional performance spikes
- Requires contiguous memory
- Not ideal for memory-constrained environments

---

## 🔍 Comparison with LinkedStack

| Feature | ArrayStack | LinkedStack |
|------|-----------|-------------|
| Push / Pop | O(1) | O(1) |
| Memory usage | Lower | Higher |
| Cache friendliness | High | Low |
| Resizing | Yes | No |

---

## 🎯 When to Use ArrayStack

✔ Performance-critical stack operations  
✔ Predictable or moderately growing data  
✔ Systems where cache locality matters

❌ Extremely memory-constrained systems  
❌ Highly unpredictable growth with strict latency limits

---

## 🧠 Learning Notes

- Array-based stacks are usually faster than linked stacks in real-world scenarios
- Resizing cost is amortized and does not affect average performance
- The simplicity of ArrayStack makes it a common default choice
