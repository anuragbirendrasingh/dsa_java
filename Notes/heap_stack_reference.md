

# 🧠 Java मेमोरी और रेफ़रेंस कॉन्सेप्ट (Heap vs Stack)

> 🔥 **“a और b दोनों एक ही लड़की (heap object) को देख रहे हैं।”**
> — अनुराग, ज्ञान प्राप्ति के बाद 😎

-----

## 🚀 मुख्य विचार: Java का 'दिल और दिमाग'

| मेमोरी | रोल | क्या स्टोर होता है? |
| :--- | :--- | :--- |
| **Stack** 🧠 | **दिमाग** | वेरिएबल्स (`int a`, `String s`) और **Heap ऑब्जेक्ट्स का पता (Reference)**। |
| **Heap** ❤️ | **दिल** | असली **ऑब्जेक्ट्स** (`new Object()`) या **ऐरे**। यह कॉमन डेटा स्टोर है। |

➡️ **निष्कर्ष:** वेरिएबल्स ऑब्जेक्ट को नहीं रखते, बल्कि **उसका पता (Reference)** रखते हैं जो Heap में स्टोर होता है।

-----

## ⚙️ मेमोरी स्ट्रक्चर को विज़ुअलाइज़ करो

यहां $\text{int}[]$ $\text{a}$ और $\text{b}$ के उदाहरण से स्टेप-बाय-स्टेप समझते हैं:

### 📊 स्टेप 1: $\text{int}[]$ $\text{a}$ को बनाना

```java
int[] a = {1, 2, 3};
```

| मेमोरी | लोकेशन | कंटेंट |
| :--- | :--- | :--- |
| **Stack** | $\text{a}$ | $\rightarrow$ $\mathbf{0x100}$ (Reference) |
| **Heap** | $\mathbf{0x100}$ | $\mathbf{[1, 2, 3]}$ |

➡️ **रिजल्ट:** $\text{Heap}$ में $\text{[1, 2, 3]}$ नाम का एक नया ऐरे बना, और $\text{a}$ के पास उसका **पता ($\mathbf{0x100}$)** चला गया।

-----

### 📊 स्टेप 2: $\text{b}$ को $\text{a}$ का $\text{Reference}$ देना

```java
int[] b = a;
```

| मेमोरी | लोकेशन | कंटेंट |
| :--- | :--- | :--- |
| **Stack** | $\text{a}$ | $\rightarrow$ $\mathbf{0x100}$ |
| **Stack** | $\text{b}$ | $\rightarrow$ $\mathbf{0x100}$ |
| **Heap** | $\mathbf{0x100}$ | $\mathbf{[1, 2, 3]}$ |

✅ **रिजल्ट:** अब $\text{a}$ और $\text{b}$ दोनों **एक ही ऐरे को देख रहे हैं (Shared Reference\!)**। यानी दोनों के पास $\mathbf{0x100}$ का $\text{Address}$ है।

-----

### 📊 स्टेप 3: $\text{b}$ से $\text{Shared}$ $\text{Object}$ में बदलाव करना

```java
b[0] = 99; // 0x100 पर बदलाव होगा
```

| मेमोरी | लोकेशन | कंटेंट |
| :--- | :--- | :--- |
| **Stack** | $\text{a}$ | $\rightarrow$ $\mathbf{0x100}$ |
| **Stack** | $\text{b}$ | $\rightarrow$ $\mathbf{0x100}$ |
| **Heap** | $\mathbf{0x100}$ | $\mathbf{[99, 2, 3]}$ |

➡️ **रिजल्ट:** क्योंकि दोनों एक ही $\text{Object}$ को देख रहे थे, इसलिए $\text{a[0]}$ भी अब $\mathbf{99}$ हो गया।

-----

### 📊 स्टेप 4: $\text{b}$ को $\text{New}$ $\text{Object}$ देना

```java
b = new int[]{5, 6, 7}; // b को नया Reference मिला
```

| मेमोरी | लोकेशन | कंटेंट |
| :--- | :--- | :--- |
| **Stack** | $\text{a}$ | $\rightarrow$ $\mathbf{0x100}$ |
| **Stack** | $\text{b}$ | $\rightarrow$ $\mathbf{0x200}$ (New Reference\!) |
| **Heap** | $\mathbf{0x100}$ | $\mathbf{[99, 2, 3]}$ |
| **Heap** | $\mathbf{0x200}$ | $\mathbf{[5, 6, 7]}$ |

➡️ **रिजल्ट:** अब $\text{b}$ एक **नए $\text{Array}$ ($\mathbf{0x200}$)** को $\text{Point}$ कर रहा है। $\text{a}$ अभी भी $\mathbf{0x100}$ पर है। इसलिए $\text{b}$ में किए गए बदलाव $\text{a}$ पर असर नहीं डालेंगे।

-----

## 💡 $\text{Code}$ $\text{Recap}$

```java
int[] a = {1, 2, 3}; // a -> 0x100
int[] b = a;        // b -> 0x100
b[0] = 99;          // 0x100 पर बदलाव

System.out.println(a[0]); // Output: 99

b = new int[]{5, 6, 7}; // b अब 0x200 पर पॉइंट कर रहा है
// b अब a से अलग हो गया है

System.out.println(a[0]); // Output: 99 (a पर कोई असर नहीं पड़ा)
```

-----

## 🧠 मस्त $\text{Analogy}$ 😆

| $\text{Concept}$ | $\text{Analogy}$ |
| :--- | :--- |
| **$\text{Heap}$ $\text{Object}$** | **लड़की 👩‍🦰** (असली चीज़) |
| **$\text{a}$ और $\text{b}$** | **दो दोस्त ($\text{References}$)** |
| `b = a;` | $\rightarrow$ दोनों एक ही लड़की को देख रहे हैं 😜 |
| `b = new int[]{...};` | $\rightarrow$ $\text{b}$ ने अब दूसरी लड़की देख ली ❤️ |

-----

## ✅ $\text{Final}$ $\text{Summary}$

| क्रिया | क्या दोनों एक ही ऑब्जेक्ट को देख रहे हैं? | क्या $\text{a}$ और $\text{b}$ दोनों पर असर होगा? |
| :--- | :--- | :--- |
| `b = a;` | ✅ हाँ | ✅ हाँ |
| `b = new int[]{...};` | ❌ नहीं | ❌ नहीं |

-----
