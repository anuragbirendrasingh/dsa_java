
---

# 🧭 Case 3: Upcasting in Java

*(Parent reference → Child object)*

---

## 📘 1. Definition

**Upcasting** is the process of assigning a **child class object** to a **parent class reference variable**.
It is a type of **implicit casting** in Java (automatically handled by JVM).

### 🔹 Syntax:

```java
Parent reference = new Child();
```

### 🔹 Example:

```java
Animal a = new Dog();
```

---

## 🎯 2. Why is it called *Up*casting?

In the **class hierarchy tree**, the parent class is always above the child class.
When we assign a child object to a parent reference, we are moving **upward in the hierarchy**,
hence the term **“Upcasting.”**

```
   Parent
     ↑
   Child
```

---

## ⚙️ 3. Code Example

```java
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
    void onlyChild() {
        System.out.println("Child specific method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();  // Upcasting
        p.show();   // Output: Child class method (Runtime Polymorphism)
        // p.onlyChild(); // ❌ Not accessible
    }
}
```

---

## 🧠 4. How Upcasting Works (Step-by-Step)

1. **Memory Allocation:**
   When we write `Parent p = new Child();`,
   JVM creates a **Child object** in heap memory, which internally contains both:

   * Parent’s properties and methods
   * Child’s own properties and methods

   ```
   Heap Memory:
   --------------------------
   p → [ Child object ]
         ├── Parent section (inherited methods)
         └── Child section (extra methods)
   ```

2. **Reference Type Check (Compile-Time):**

   * Compiler looks only at the **reference type** (`Parent`).
   * It allows access only to **Parent class methods and variables**.

3. **Method Execution (Runtime):**

   * JVM executes method of the **actual object** (`Child`), not the reference type.
   * This is called **Runtime Polymorphism** or **Dynamic Method Dispatch**.

---

## 🧩 5. Output Behavior Example

```java
Parent p = new Child();
p.show();   // ✅ Executes Child's overridden show() method
p.onlyChild(); // ❌ Compile-time error (method not visible to Parent type)
```

### ✅ Output:

```
Child class method
```

---

## 💬 6. Key Points (Interview Focus)

| Point                             | Description                                        |
| --------------------------------- | -------------------------------------------------- |
| **Type of casting**               | Implicit (automatic)                               |
| **Allowed members**               | Only Parent class members                          |
| **If method overridden**          | Child’s method runs (runtime polymorphism)         |
| **When used**                     | To achieve generalization and runtime polymorphism |
| **Object type (runtime)**         | Child                                              |
| **Reference type (compile-time)** | Parent                                             |
| **Access level**                  | Determined by reference type at compile-time       |
| **Execution (method call)**       | Determined by actual object type at runtime        |

---

## 🧠 7. Runtime Polymorphism / Dynamic Method Dispatch

Upcasting enables **runtime polymorphism**, where:

* The **method call** is decided at **runtime**, not compile time.
* This allows Java to support **dynamic behavior** and **flexibility**.

Example:

```java
Parent p = new Child();
p.show();  // Method executed: Child’s version
```

Even though reference `p` is of type `Parent`,
the **actual object is Child**, so JVM executes **Child’s show()** method.

---

## ⚠️ 8. Limitations of Upcasting

1. You **cannot access** child-specific members using the parent reference.
2. To access child-specific methods, you must **Downcast**:

   ```java
   ((Child)p).onlyChild();
   ```
3. If the object is **not truly a child object**, downcasting causes
   **`ClassCastException`** at runtime.

---

## 🚀 9. Advantages of Upcasting

| Advantage              | Explanation                                                         |
| ---------------------- | ------------------------------------------------------------------- |
| ✅ **Polymorphism**     | Enables dynamic method dispatch (runtime method overriding)         |
| ✅ **Flexibility**      | Same parent reference can point to different child objects          |
| ✅ **Code Reusability** | Functions can use parent reference to handle multiple child classes |
| ✅ **Decoupling**       | Promotes loose coupling between components                          |

---

## 🧩 10. Practical Real-Life Example

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Upcasting
        Animal a2 = new Cat();  // Upcasting

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }
}
```

🧠 **Why useful?**
You can use **one reference type (Animal)** to represent **multiple object types (Dog, Cat)** —
this is the core of **polymorphism**.

---

## 🧾 11. Summary Table

| Concept              | Description                                    |
| -------------------- | ---------------------------------------------- |
| **Definition**       | Assigning a child object to a parent reference |
| **Syntax**           | `Parent p = new Child();`                      |
| **Type**             | Implicit casting                               |
| **Purpose**          | To achieve runtime polymorphism                |
| **Access**           | Only parent class members visible              |
| **Execution**        | Child’s overridden methods executed            |
| **Advantage**        | Flexibility, generalization, reusability       |
| **Limitation**       | Child-specific members hidden                  |
| **Opposite Concept** | Downcasting (`Child c = (Child)p;`)            |

---

## 🧩 12. Key Interview Questions

1. **What is Upcasting in Java?**

   > Assigning a subclass object to a superclass reference.

2. **Is Upcasting implicit or explicit?**

   > Implicit (automatic).

3. **Why do we need Upcasting?**

   > To achieve runtime polymorphism and generalization.

4. **Can we access child-specific methods after Upcasting?**

   > No, unless we Downcast.

5. **What happens when the method is overridden?**

   > Child’s version of the method executes (runtime polymorphism).

6. **What’s the difference between compile-time and runtime binding?**

   > Compile-time uses reference type, runtime uses actual object type.

---

## ✅ Final Takeaway

> **Upcasting** = Parent reference → Child object
> Allows **runtime polymorphism**, promotes **flexibility**,
> but hides child-specific features until **downcasting** is applied.

---

