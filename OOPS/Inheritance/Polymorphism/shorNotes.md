
## 💥 Pehle Seedhi Baat

✅ **Runtime Polymorphism** tabhi hota hai jab  
`inheritance + overriding + parent reference + child object` ho.  

✅ **Compile-time Polymorphism** me inheritance **zaroori nahi hota**,  
ye **method overloading** se achieve hota hai.

---

## ⚙️ What is Polymorphism?

**Polymorphism** ka matlab hota hai — *"many forms"*.  
Java me iska matlab hai ek hi method naam alag-alag forms me behave kar sakta hai  
(according to situation ya object type).

Polymorphism helps achieve **flexibility**, **code reusability**, and **clean OOP design**.

---

## 🧩 Types of Polymorphism in Java

1. **Compile-time Polymorphism (Static Polymorphism)**
2. **Runtime Polymorphism (Dynamic Polymorphism)**

---

## 🔹 1️⃣ Compile-time Polymorphism (a.k.a Method Overloading)

### 📘 Definition:
Compile-time polymorphism tab hota hai jab **same class me** multiple methods  
**same name ke** hote hain, lekin **different parameters** (number, type, or order).

### ⚙️ Conditions:
- Inheritance **optional** hai (same class me bhi ho sakta hai).  
- Method name **same**, parameters **different**.  
- **Compiler** decide karta hai kaunsa method call hoga (compile time pe).

### 🧠 Example:
```java
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);       // add(int, int)
        calc.add(2.5, 3.5);     // add(double, double)
        calc.add(1, 2, 3);      // add(int, int, int)
    }
}



