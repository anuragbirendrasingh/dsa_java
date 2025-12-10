# Permutation + Recursion + Loop Interaction (Quick Revision Notes)

## 🔥 How Recursion and Loops Work Together in Permutation Problems

**In permutation problems, recursion and loops work together in a way where the loop at each recursion level iterates, but the actual movement to the next iteration only happens after the deeper recursive calls return.**

This means:

* The recursive call **blocks** the loop.
* That iteration waits until the **entire subtree** is completed.
* Once the base case is reached and the call returns, **only then** the loop moves to the next iteration.

### ✅ Short Summary

**In short, recursion suspends the current loop iteration, goes deeper, completes that entire branch, comes back, then continues the next iteration. This behavior creates the full permutation tree.**

### ⭐ Interview One-Liner

**A recursive call freezes the current loop iteration until the entire recursive subtree finishes. Only after the function returns does the loop continue. This suspension‑and‑resume pattern is exactly what generates the permutation tree.**

---

# ⚡ Why Number of Recursive Calls Depends on String Length

Example string: **"abc"**

**At each recursion level, we choose 1 character out of the remaining characters.**
So, the number of recursive calls at that level equals the **remaining string length**.

### Levels Explanation

* **Level 1 → 3 choices → 3 recursive calls**
* **Level 2 → 2 choices → 2 recursive calls per branch**
* **Level 3 → 1 choice → 1 recursive call per branch**
* **Level 4 → 0 (base case reached)**

This shrinking number of choices builds the full permutation tree.

---

# ⭐ Interview Summary Line

**In permutations, the recursion depth equals the string size, and the number of recursive calls at each level equals the number of characters still available. This shrinking length multiplies across levels, producing `n!` total calls.**
