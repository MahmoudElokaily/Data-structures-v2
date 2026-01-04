# Dynamic Array (Custom Implementation in Java)

This module contains a custom implementation of a **Dynamic Array**, similar in concept to Java's `ArrayList`, built from scratch for learning and engineering purposes.

The goal is not only to implement the data structure, but to understand **design decisions, time complexity, and trade-offs**.

---

## 📌 Overview

A Dynamic Array solves the limitation of fixed-size arrays by automatically resizing when capacity is exceeded.

This implementation:
- Uses a backing array
- Grows dynamically (capacity ×2)
- Supports generic types (`<T>`)

---

## ⏱ Time Complexity

| Operation | Time Complexity | Notes |
|---------|----------------|------|
| `add(value)` | **O(1)** amortized | Occasional resize costs O(n) |
| `get(index)` | **O(1)** | Direct index access |
| `remove(index)` | **O(n)** | Elements are shifted |
| `resize()` | **O(n)** | Copies all elements |
| `size()` | **O(1)** | Stored as a variable |

---

## 💾 Space Complexity

- **O(n)** where `n` is the number of stored elements
- Extra unused capacity may exist after resizing

---

## ⚙️ Key Design Decisions

### 1️⃣ Capacity Growth Strategy
- Capacity doubles (`×2`) when full
- Provides amortized constant-time insertion
- Trades memory for performance

> Java's `ArrayList` grows by ~1.5× to reduce memory overhead.

---

### 2️⃣ Explicit Null Assignment
```java
data[--size] = null;
