बहुत ही बढ़िया बात पकड़ी भाई 💪🔥
हाँ बिल्कुल — interviewer या test में **Symmetric**, **Mirror**, **Equal**, **Identical**, **Structurally same**, वगैरह एक ही pattern पर सवाल घुमा-घुमा के पूछे जाते हैं।

चल अब मैं नीचे **पूरे possible question patterns** एकदम organized तरीके से दे रहा हूँ — ताकि तू देखे तो तुरंत समझ जाए कि कौन-सा logic लगाना है।

---

# 🌳 **Binary Tree Concept-Based Question Patterns**

| 🧩 **Question Type**                   | 📘 **Explanation (What it asks)**                           | 💻 **Example / Input Description** | 🧠 **What to Check / Return**                                    |
| -------------------------------------- | ----------------------------------------------------------- | ---------------------------------- | ---------------------------------------------------------------- |
| **1️⃣ Symmetric Binary Tree**          | Tree अपने आप का mirror image है या नहीं                     | एक ही tree दिया गया है             | Return `true` अगर left और right subtree mirror हैं               |
| **2️⃣ Mirror Image Trees**             | दो trees दिए हैं; check करो कि क्या एक दूसरे का mirror हैं  | Tree A & Tree B                    | Return `true` अगर A.left ↔ B.right और A.right ↔ B.left समान हैं  |
| **3️⃣ Identical (Equal) Binary Trees** | दो trees के structure और node values दोनों same हैं या नहीं | Tree A & Tree B                    | Return `true` अगर दोनों का structure और data same है             |
| **4️⃣ Structurally Same Trees**        | दो trees का structure same है, values जरूरी नहीं            | Tree A & Tree B                    | Return `true` अगर केवल structure match करता है                   |
| **5️⃣ Isomorphic Trees**               | Structure same है लेकिन left-right swap allowed है          | Tree A & Tree B                    | Return `true` अगर swapping से same बनाया जा सकता है              |
| **6️⃣ Equal Number of Nodes / Leaves** | दोनों trees में nodes या leaves की संख्या same है या नहीं   | Tree A & Tree B                    | Return `true` अगर count बराबर हैं                                |
| **7️⃣ Subtree Check**                  | एक tree दूसरे tree के अंदर मौजूद है या नहीं                 | Tree A (main), Tree B (subtree)    | Return `true` अगर B, A का part है                                |
| **8️⃣ Same Height / Depth**            | Compare करो दोनों trees की height या depth                  | Tree A & Tree B                    | Return `true` अगर height बराबर है                                |
| **9️⃣ Mirror + Identical Combo**       | दिया गया tree mirror भी है और equal भी है                   | Tree A & Tree B                    | Return `true` अगर mirror condition और equality दोनों satisfy हों |
| **🔟 Symmetric but Not Identical**     | Symmetric structure है लेकिन value अलग हो सकती है           | एक ही tree                         | Return `true` अगर shape symmetric है, value same न भी हो         |
| **11️⃣ Equal Leaf Sequence**           | दोनों trees के leaf nodes (L→R) का sequence same है या नहीं | Tree A & Tree B                    | Compare leaf node values in left-to-right order                  |

---

# 💡 **Shortcut Difference Table**

| Concept               | Same Structure?        | Same Values? | Mirror Check? |
| --------------------- | ---------------------- | ------------ | ------------- |
| **Symmetric**         | ✅ (Mirror self)        | ✅            | ✅             |
| **Mirror Trees**      | ✅ (Mirrored structure) | ✅            | ✅             |
| **Identical Trees**   | ✅                      | ✅            | ❌             |
| **Structurally Same** | ✅                      | ❌            | ❌             |
| **Isomorphic Trees**  | ✅ (with swapping)      | ❌            | ⚙️ Optional   |
| **Subtree**           | Partial                | ✅            | ❌             |

---

# ⚙️ **Quick Java Logic Summary**

| Type                  | Code Idea                                                   |
| --------------------- | ----------------------------------------------------------- |
| **Symmetric**         | `isMirror(root.left, root.right)`                           |
| **Mirror Trees**      | `isMirror(tree1, tree2)`                                    |
| **Identical Trees**   | Compare both recursively: `a.val == b.val && left && right` |
| **Structurally Same** | Ignore value check: only compare `null` and non-`null`      |
| **Isomorphic**        | Check both swapped and non-swapped subtrees                 |
| **Subtree**           | Recursively search: `isSubtree(main, sub)`                  |

---

# 🧠 **Interview Trick**

कई बार interviewer बोलेगा —

> “क्या दो Symmetric trees हमेशा Identical होते हैं?”
> ❌ नहीं। क्योंकि **Symmetric** का मतलब है *mirror structure*, लेकिन value अलग हो सकती है।

> “क्या दो Identical trees हमेशा Symmetric होंगे?”
> ❌ नहीं। Identical मतलब same shape और values, symmetry जरूरी नहीं।

---

अगर तू चाहे तो मैं **इन सारे types के visual diagrams (side-by-side)** भी बना दूँ ताकि तू देखकर तुरंत पहचान सके कि कौन mirror है, कौन identical, कौन symmetric etc.

क्या visuals भी बनाऊँ भाई अगला step में?
