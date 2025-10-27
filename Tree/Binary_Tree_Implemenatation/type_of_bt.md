
---

```markdown
# 🌳 Types of Binary Trees (With Examples & Visuals)

Binary Trees कई प्रकार के होते हैं —  
हर एक का structure और rule थोड़ा अलग होता है।  
नीचे सभी types को example, diagram और explanation के साथ देखा जा सकता है 👇  

---

## 1️⃣ **Full Binary Tree**

> हर node के या तो **0 या 2 children** होते हैं।

### 🧩 Example
```

```
    1
   / \
  2   3
 / \
4   5
```

```

### 📘 Explanation
- Node `1` और `2` के **2 child** हैं  
- Node `3`, `4`, `5` के **0 child** हैं  
- इसलिए यह **Full Binary Tree** कहलाता है ✅

---

## 2️⃣ **Complete Binary Tree**

> हर level **भरा हुआ होता है**,  
> except last — और last level **left se fill** होता है।

### 🧩 Example
```

```
    1
   / \
  2   3
 / \
4   5
```

```

### 📘 Explanation
- ऊपर के सारे levels full हैं  
- last level में nodes **left से fill** हैं  
- इसलिए यह **Complete Binary Tree** है ✅

---

## 3️⃣ **Perfect Binary Tree**

> हर level **पूरी तरह भरा** होता है  
> और **सारे leaves same level** पर होते हैं।

### 🧩 Example
```

```
    1
   / \
  2   3
 / \ / \
4  5 6  7
```

```

### 📘 Explanation
- हर level पूरा है  
- सारे leaves same depth पर हैं  
- Height = 3  
- Total Nodes = 2³ - 1 = 7 ✅  
- इसलिए यह **Perfect Binary Tree** है।

---

## 4️⃣ **Skewed Tree**

> सारे nodes एक ही तरफ होते हैं  
> (या तो left side या right side में)।

### 🧩 Example

**Left Skewed Tree**
```

```
1
```

/
2
/
3

```

**Right Skewed Tree**
```

1

2

3

```

### 📘 Explanation
- हर node का केवल **एक child** है  
- दिखने में यह **Linked List** जैसा होता है  
- Height = n  
- इसलिए यह **Skewed Tree** कहलाता है ✅

---

## 5️⃣ **Balanced Binary Tree**

> हर node के left aur right subtree ke height का फर्क ≤ 1 होता है।

### 🧩 Example
```

```
    1
   / \
  2   3
 / \
4   5
```

```

### 📘 Explanation
- Left subtree की height = 2  
- Right subtree की height = 1  
- फर्क = 1 ⇒ Allowed ✅  
- इसलिए यह **Balanced Binary Tree** है  
- इसका special case है **AVL Tree**।

---

## 🧠 Shortcut Trick to Remember

> **Perfect** → हर level भरा हुआ  
>  
> **Complete** → last level tak left fill  
>  
> **Full** → node ke ya to 0 ya 2 child  
>  
> **Skewed** → ek side jhuka hua  
>  
> **Balanced** → dono side lagbhag equal  

---

✨ **Quick Summary Table**

| Type | Definition |
|------|-------------|
| **Full Binary Tree** | हर node के या तो 0 या 2 children होते हैं |
| **Complete Binary Tree** | हर level भरा हुआ होता है (except last level) |
| **Perfect Binary Tree** | सारे levels पूरी तरह भरे हुए होते हैं |
| **Skewed Tree** | सारे nodes एक ही तरफ होते हैं (जैसे linked list) |
| **Balanced Binary Tree** | हर node का left aur right subtree ke height का फर्क ≤ 1 होता है |

---

```

---




