
---

## 🧠 Java Inheritance – Quick Revision Notes

### 📝 Definition
Inheritance is the OOP mechanism where a **Child Class (Subclass)** acquires the **properties and methods** of a **Parent Class (Superclass)**.

* **Goal:** Code Reusability and Method Overriding.
* **Relationship:** It establishes an **"is-a"** relationship (e.g., `Dog` is-a `Animal`).

---

### 🔑 Core Concepts & Keywords

| Concept | Keyword | Description |
| :--- | :--- | :--- |
| **Inheritance Link** | `extends` | Keyword used by the Child class to inherit from the Parent. |
| **Redefining Logic** | **Method Overriding** | Child class provides a specific implementation for a method already defined in its Parent. |
| **Accessing Parent** | `super` | Used to call the Parent's constructor or its methods. |
| **Flexibility** | **Polymorphism** | A Parent reference can hold a Child object (`Animal a = new Dog();`). |

---

### 🚦 Access Modifier Rule Recap (Visibility)

| Modifier | Same Class | Same Package | Subclass (Diff Package) | Outside Package |
| :--- | :--- | :--- | :--- | :--- |
| **`private`** | ✅ | ❌ | ❌ | ❌ |
| **`default`** | ✅ | ✅ | ❌ | ❌ |
| **`protected`** | ✅ | ✅ | ✅ | ❌ |
| **`public`** | ✅ | ✅ | ✅ | ✅ |

> ⚠️ **Note:** For encapsulation, variables are often **`private`** in the Parent, and methods are often **`public`** for controlled access.

---

### 🧩 Polymorphism & Runtime Behavior

Polymorphism is the key to inheritance. The reference type (LHS) and the object type (RHS) play distinct roles:

| Declaration | Reference Type (LHS) | Object Type (RHS) | Result |
| :--- | :--- | :--- | :--- |
| `Animal a = new Dog();` | **Parent** (`Animal`) | **Child** (`Dog`) | The **Compiler** only knows methods in `Animal` (Compile-Time Access), but the **JVM** runs `Dog`'s overridden version (Runtime Behavior). |
| `Dog d = new Dog();` | **Child** (`Dog`) | **Child** (`Dog`) | Access to both `Dog` and `Animal` methods. |
| `Animal a = new Animal();` | **Parent** (`Animal`) | **Parent** (`Animal`) | Access only to `Animal` methods. |

#### Key Takeaways

1.  **🧠 Compile-Time Check (LHS):** Reference type (`Animal`) decides **WHICH** methods are **ACCESSIBLE** (e.g., `a.fetch()` fails because `fetch()` isn't in `Animal`).
2.  **🧩 Run-Time Execution (RHS):** Object type (`new Dog()`) decides **WHICH VERSION** of an overridden method will **EXECUTE**.

---

### 🚫 Types of Inheritance in Java

| Type | Description | Example | Java Support |
| :--- | :--- | :--- | :--- |
| **Single** | One Child inherits from one Parent. | `Class B extends A` | ✅ Yes |
| **Multi-level** | Chain of inheritance (A $\rightarrow$ B $\rightarrow$ C). | `Class C extends B` | ✅ Yes |
| **Hierarchical** | Multiple Children inherit from one Parent. | `B extends A`, `C extends A` | ✅ Yes |
| **Multiple** | One Child inherits from multiple Parents. | `Class C extends A, B` | ❌ **No** (Due to the Diamond Problem) |
| **Hybrid** | Combination of Multiple and others. | (e.g., Multiple + Hierarchical) | ❌ **No** (Indirectly achieved via Interfaces) |

> **💎 Diamond Problem:** Multiple Inheritance is not allowed directly in Java to avoid ambiguity (which Parent method to inherit if both have the same signature?).