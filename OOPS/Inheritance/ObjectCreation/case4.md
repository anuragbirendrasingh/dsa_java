
---

# 🧭 Case 4: Downcasting in Java

*(Child reference ← Parent object)*

---

## 📘 1. Definition

**Downcasting** is the process of assigning a **parent class reference** to a **child class reference variable**.

It’s the **opposite of Upcasting**.

### 🔹 Syntax:

```java
Child c = (Child) parentReference;
```

---

## ⚠️ 2. Important Rule

Downcasting is **not automatically allowed** (unlike Upcasting).
You must use **explicit type casting** — i.e. `(Child)`.

Also:

> It is **only valid** if the actual object being referred to **is originally a child object**.

Otherwise, Java throws:

```
java.lang.ClassCastException
```

---

## 🧩 3. Example Code

```java
class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show()");
    }
    void display() {
        System.out.println("Child specific method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();   // ✅ Upcasting
        Child c = (Child) p;      // ✅ Valid Downcasting (object actually Child)
        
        c.show();      // Output: Child show()
        c.display();   // Output: Child specific method
    }
}
```

---

## 🧠 4. Step-by-Step Working

### 🧩 Step 1: `Parent p = new Child();`

* Upcasting — parent reference, child object
* Only parent-level methods visible to compiler

### 🧩 Step 2: `Child c = (Child)p;`

* Explicitly typecast parent reference into child reference
* Compiler allows it (syntax-wise)
* JVM checks at **runtime** whether `p` is truly pointing to a `Child` object

### 🧩 Step 3: Method Calls

* Now, `c` is a **child reference**, so you can access **both parent + child methods**

---

## ⚠️ 5. Invalid Downcasting Example

```java
Parent p = new Parent();
Child c = (Child)p;  // ❌ INVALID
```

### 🧨 Runtime Error:

```
java.lang.ClassCastException: class Parent cannot be cast to class Child
```

🧠 **Reason:**
Object `p` is actually a `Parent` —
it doesn’t contain any child-specific structure in memory,
so JVM can’t safely convert it into a `Child`.

---

## 🧠 6. How JVM Handles Downcasting (Internally)

1. At compile-time:

   * Compiler only checks that classes are related by inheritance.
   * It **allows the cast** syntax-wise.

2. At runtime:

   * JVM checks the **actual type** of the object.
   * If the actual object is a `Child`, cast succeeds ✅
   * If not, `ClassCastException` is thrown ❌

---

## 🧩 7. Memory Visualization

```
Heap Memory:

Upcasting:
-----------------------------
Parent p → [ Child object ]
              ├── Parent part
              └── Child part

Downcasting:
-----------------------------
Child c = (Child)p;
Now both references (p & c) point to the same Child object.
```

---

## ⚙️ 8. Real-Life Analogy

Imagine:

* **Parent class = Animal**
* **Child class = Dog**

> Every Dog is an Animal ✅ (Upcasting always safe)
> But every Animal is not a Dog ❌ (Downcasting unsafe unless confirmed)

Hence, you must “check before you convert.”

---

## 🔍 9. Safe Downcasting using `instanceof` Operator

Before performing downcasting, always check with `instanceof` to avoid runtime exceptions.

```java
Parent p = new Parent();

if (p instanceof Child) {
    Child c = (Child)p;   // Safe Downcasting
    c.display();
} else {
    System.out.println("Downcasting not possible");
}
```

✅ Output:

```
Downcasting not possible
```

---

## 💬 10. Summary Table

| Concept              | Description                                          |
| -------------------- | ---------------------------------------------------- |
| **Definition**       | Converting a parent reference into a child reference |
| **Syntax**           | `Child c = (Child) parentRef;`                       |
| **Casting Type**     | Explicit                                             |
| **When Valid**       | Only if actual object is of Child type               |
| **When Invalid**     | If parent object is not originally Child             |
| **Error Thrown**     | `ClassCastException`                                 |
| **Checked By**       | JVM at runtime                                       |
| **Purpose**          | To access child-specific methods after Upcasting     |
| **Use `instanceof`** | To ensure safe downcasting                           |

---

## 🧩 11. Practical Example (Interview Level)

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starting...");
    }
    void openSunroof() {
        System.out.println("Opening sunroof...");
    }
}

public class TestCasting {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // Upcasting ✅
        v1.start();               // Output: Car starting...

        // Downcasting ✅ (valid)
        Car c1 = (Car)v1;
        c1.openSunroof();         // Output: Opening sunroof...

        // Invalid downcast ❌
        Vehicle v2 = new Vehicle();
        Car c2 = (Car)v2;         // Runtime Error: ClassCastException
    }
}
```

---

## ⚙️ 12. Advantages of Downcasting

| Advantage     | Description                                             |
| ------------- | ------------------------------------------------------- |
| ✅ Access      | Allows access to child-specific members after upcasting |
| ✅ Flexibility | Works with polymorphic references dynamically           |
| ✅ Complements | Complements upcasting in OOP hierarchy                  |

---

## ⚠️ 13. Disadvantages / Risks

| Disadvantage    | Description                                           |
| --------------- | ----------------------------------------------------- |
| ❌ Unsafe        | Can throw `ClassCastException` if misused             |
| ❌ Manual effort | Requires explicit casting                             |
| ❌ Confusing     | Can lead to logical errors if hierarchy misunderstood |

---

## 💡 14. Key Interview Points

| Question                             | Answer                                                          |
| ------------------------------------ | --------------------------------------------------------------- |
| What is downcasting?                 | Assigning a parent reference to a child reference (explicitly). |
| Is downcasting implicit or explicit? | Explicit.                                                       |
| What happens if downcasting fails?   | `ClassCastException` at runtime.                                |
| How can you avoid runtime error?     | Use `instanceof` operator before casting.                       |
| What’s the purpose of downcasting?   | To access child-specific methods after upcasting.               |
| Who checks downcasting validity?     | JVM at runtime.                                                 |
| When is downcasting safe?            | When object was originally created as a child object.           |

---

## 🧾 15. Example with Both Upcasting & Downcasting

```java
class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show()");
    }
    void childMethod() {
        System.out.println("Child specific logic");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();  // Upcasting ✅
        p.show();                // Output: Child show()

        if (p instanceof Child) {
            Child c = (Child)p;  // Downcasting ✅ Safe
            c.childMethod();     // Output: Child specific logic
        }
    }
}
```

---

## 🧩 16. Final Summary

| Aspect           | Upcasting                            | Downcasting                     |
| ---------------- | ------------------------------------ | ------------------------------- |
| **Definition**   | Child → Parent                       | Parent → Child                  |
| **Casting Type** | Implicit                             | Explicit                        |
| **Purpose**      | Generalization, runtime polymorphism | Access child-specific members   |
| **Checked At**   | Compile-time                         | Runtime                         |
| **Safe**         | Always                               | Only if actual object is child  |
| **Error Type**   | —                                    | `ClassCastException` if invalid |
| **Use Case**     | Common                               | Conditional / Advanced usage    |

---

## ✅ Final Takeaway

> **Downcasting** allows us to recover the child-specific features from a parent reference,
> but it should always be used **carefully** and **only after `instanceof` verification**
> to avoid runtime crashes.

---

