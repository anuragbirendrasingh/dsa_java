
---

# ⚖️ Java Object Creation — Quick Summary (Cases 1 to 4)

| **Case** | **Syntax**                 | **Casting Type**       | **Accessible Members**            | **Safe?**        | **Polymorphism** | **Use / Purpose**             |
| -------- | -------------------------- | ---------------------- | --------------------------------- | ---------------- | ---------------- | ----------------------------- |
| **1**    | `Parent p = new Parent();` | None                   | Parent only                       | ✅                | ❌                | Simple object creation        |
| **2**    | `Child c = new Child();`   | None                   | Parent + Child                    | ✅                | ❌                | Regular use                   |
| **3**    | `Parent p = new Child();`  | Implicit (Upcasting)   | Parent (compile), Child (runtime) | ✅                | ✅                | Achieve runtime polymorphism  |
| **4**    | `Child c = (Child)p;`      | Explicit (Downcasting) | Parent + Child                    | ⚠️ Only if valid | ✅                | Access child-specific methods |

---

## 🧠 Key Interview Notes

* **Upcasting** → Safe, implicit, used for runtime polymorphism.
* **Downcasting** → Unsafe without check, must use explicit `(Child)` cast.
* **`instanceof`** → Always check before downcasting to prevent `ClassCastException`.
* **Parent reference** → Can point to any child (flexible, general behavior).
* **Child reference** → Cannot hold parent object unless valid downcast.
* **Overridden methods** → Always resolved at **runtime** (dynamic dispatch).

---

## ✅ Quick Takeaway

> 🔹 **Upcasting → Generalization** (access only common behaviors)
> 🔹 **Downcasting → Specialization** (access child-specific behaviors)
> ⚠️ Always verify with `instanceof` before performing downcasting.

---

