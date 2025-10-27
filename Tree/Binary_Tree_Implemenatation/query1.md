
````md
# 🌳 Java — Public + Private Recursive Method Pattern

### 📘 Concept Overview
In Java (especially in Tree, Graph, or Recursion problems), we often define:
- One **public method** — as a clean entry point.
- One **private method** — for actual recursive logic.

This pattern is known as  
👉 **Public Wrapper + Private Recursive Helper**

---

## 🧩 Example Code

```java
public void Display() {
    Display(root);
}

private void Display(Node nn) {
    if (nn == null) return;

    String s = "<--" + nn.val + "-->";
    s = (nn.left != null ? nn.left.val : ".") + s;
    s = s + (nn.right != null ? nn.right.val : ".");
    
    System.out.println(s);
    Display(nn.left);
    Display(nn.right);
}
````

---

## 💭 Query 1: Why two methods (public + private)?

**Answer:**
To maintain **abstraction** and **encapsulation**.

| Role                       | Access   | Purpose                 |
| -------------------------- | -------- | ----------------------- |
| `public Display()`         | External | Safe entry for users    |
| `private Display(Node nn)` | Internal | Handles recursion logic |

Users shouldn’t know about internal `Node` structure — they just call `tree.Display()`.

---

## 💭 Query 2: Why pass `Node nn` as parameter when we already have `root`?

**Answer:**
Although `root` holds a reference to the root node,
passing it as a parameter offers **flexibility** and **reusability**.

✅ **When you call:**

```java
Display(root);
```

* The **reference** of `root` (not the copy of object) is passed.
* Both `root` and `nn` point to the same node in memory.

```
root ──► [ Node(10) ]
nn   ──► [ same Node(10) ]
```

---

## ⚙️ Why not use `root` directly inside recursion?

| Approach              | Technically Possible? | Drawback                             |
| --------------------- | --------------------- | ------------------------------------ |
| Using `root` directly | ✅ Yes                 | Hardcoded, not reusable for subtrees |
| Using `nn` parameter  | ✅ Best practice       | Clean, generic, flexible recursion   |

Example of reusability:

```java
public void displayLeftSubtree() {
    Display(root.left);
}
```

---

## 🧠 Concept Summary

* `root` = entry point (stored in class)
* `nn` = local reference (recursion parameter)
* Each recursive call has its **own copy** of `nn` (stack frame)
* Both point to the same memory reference unless reassigned.

---

## 💡 Analogy

Like a restaurant:

* Customer says: **"Display()"** → public entry
* Kitchen decides how to **cook recursively** → private helper

User doesn’t see the internal recipe — just the final result.

---

## 🪄 Key Takeaways

✅ Public method → external interface
✅ Private method → internal logic
✅ Pass-by-reference copy → safe + reusable recursion
✅ Cleaner, more modular, and professional code style

---

📘 **Pattern Name:**

> 🧩 “Public Wrapper + Private Recursive Helper Pattern”
> Used in: Binary Trees, Graph traversals, Backtracking, DFS/BFS.

---

```

---


```
