# 🚀 Java DSA Journey — Keerthi

This repository documents my daily progress while learning **Data Structures & Algorithms using Java**.

The focus is on improving problem-solving skills, strengthening logical thinking, and maintaining consistency through daily practice. 

---

## 📊 Problem Progress Tracker

| Day | Problem | Topic | Pattern | Difficulty |
|----|--------|------|--------|-----------|
| 1 | Two Sum | Arrays / Hashing | HashMap Lookup | Easy |
| 2 | Best Time to Buy and Sell Stock | Arrays / Greedy | Prefix Minimum Tracking | Easy |
| 3 | Maximum Subarray | Arrays / Dynamic Programming | Kadane’s Algorithm | Medium |
| 4 | Merge Intervals | Arrays / Sorting | Sort + Greedy Merge | Medium |
| 5 | Product of Array Except Self | Arrays | Prefix & Suffix Product | Medium |
| 6 | 3Sum | Arrays / Sorting | Two Pointers | Medium |
| 7 | Container With Most Water | Arrays | Two Pointer Boundary Shrinking | Medium |
| 8 | Set Matrix Zeroes | Arrays / Matrix | In-place Marker Technique | Medium |
| 9 | Rotate Array | Arrays | Array Reversal Technique | Medium |
| 10 | Missing Number | Arrays / Math | Sum Formula / XOR | Easy |
| 11 | Longest Substring Without Repeating Characters | Strings | Sliding Window | Medium |
| 12 | Valid Anagram | Strings / Hashing | Character Frequency Counting | Easy |
| 13 | Group Anagrams | Strings / Hashing | Sorted Key Grouping | Medium |
| 14 | Longest Palindromic Substring | Strings | Expand Around Center | Medium |
| 15 | String to Integer (atoi) | Strings / Parsing | Controlled State Traversal | Medium |
| 16 | Reverse Words in a String | Strings | String Tokenization | Medium |
| 17 | Valid Parentheses (LeetCode #20) | Strings | Pair Matching (StringBuilder) | Easy |
| 18 | Implement strStr() (LeetCode #28) | Strings | Substring Search | Easy | 
| 19 | Decode Ways | Strings / Dynamic Programming | State Transition DP | Medium |
| 20 | Count and Say | Strings | Sequence Construction | Medium |

---

## 📅 Progress Log

### ✅ Day 1 — Two Sum (LeetCode #1)
Topic: Arrays / Hashing  
Pattern: HashMap Lookup  
Time: O(n) | Space: O(n)  
Learning: Complement storage removes nested loop comparisons.

---

### ✅ Day 2 — Best Time to Buy and Sell Stock (LeetCode #121)
Topic: Arrays / Greedy  
Pattern: Prefix Minimum Tracking  
Time: O(n) | Space: O(1)  
Learning: Maintaining the minimum value so far eliminates the need for pair comparisons.

---

### ✅ Day 3 — Maximum Subarray (LeetCode #53)
Topic: Arrays / Dynamic Programming  
Pattern: Kadane’s Algorithm (State Compression)  
Time: O(n) | Space: O(1)  

Learning:  
Instead of checking all subarrays, maintaining a running sum and resetting it when it becomes harmful leads to an optimal linear-time solution.

---

### ✅ Day 4 — Merge Intervals (LeetCode #56)  
Topic: Arrays / Sorting  
Pattern: Interval Merging (Sort + Greedy)  
Time Complexity: O(n log n)  
Space Complexity: O(n)

Key Learning:
Sorting intervals by start time simplifies overlap detection. Instead of comparing every pair, tracking only the last merged interval allows a clean linear merge process.
Insight:
Preprocessing through sorting often transforms complex comparison problems into simple single-pass solutions.

---

### ✅ Day 5 — Product of Array Except Self (LeetCode #238)
Topic: Arrays
Approach: Prefix & Suffix Product
Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Storing prefix products in the result array and multiplying with a running suffix product avoids division and reduces extra space usage.

---

### ✅ Day 6 — 3Sum (LeetCode #15)
  
Topic: Arrays / Sorting  
Pattern: Two Pointers with Duplicate Handling  
Time Complexity: O(n²)  
Space Complexity: O(1)

Key Learning:
Sorting converts the problem into a two-pointer search, while skipping duplicates prevents repeated triplets.

---

### ✅ Day 7 — Container With Most Water (LeetCode #11) 

Topic: Arrays  
Pattern: Two Pointers  
Time Complexity: O(n)  
Space Complexity: O(1)

Key Learning:
Maximum area depends on width and the smaller boundary height. Moving the smaller pointer is the only way to potentially increase area.

---

### ✅ Day 8 — Set Matrix Zeroes (LeetCode #73)

Topic: Arrays / Matrix
Pattern: In-Place Marker Technique
Time Complexity: O(m × n)
Space Complexity: O(1)

Key Learning:
Using the first row and first column as markers allows the algorithm to track which rows and columns should be zeroed without allocating extra memory.

Insight:
Careful use of existing array space can eliminate the need for auxiliary data structures.

--- 

### ✅ Day 9 — Rotate Array (LeetCode #189)

Topic: Arrays
Pattern: Array Reversal Technique
Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Reversing the entire array and then reversing subsegments achieves rotation efficiently without extra space.

Insight:
Breaking a complex transformation into multiple reversible operations simplifies the implementation.

---

### ✅ Day 10 — Missing Number (LeetCode #268)

Topic: Arrays / Bit Manipulation
Pattern: Mathematical Sum / XOR Trick
Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Using the expected sum formula n(n+1)/2 or XOR properties helps identify the missing value without sorting or additional memory.

Insight:
Mathematical properties often replace iterative comparisons in array problems.

---

### ✅ Day 11 — Longest Substring Without Repeating Characters (LeetCode #3)

Topic: Strings
Pattern: Sliding Window
Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
Expanding and shrinking a window while tracking characters in a set efficiently maintains a substring with unique characters.

Insight:
Sliding window techniques transform many brute-force substring problems into linear time solutions.

---

### ✅ Day 12 — Valid Anagram (LeetCode #242)

Topic: Strings / Hashing
Pattern: Character Frequency Counting
Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Tracking character counts in a fixed-size array provides a faster alternative to sorting for anagram detection.

Insight:
When dealing with fixed character sets, frequency arrays are often the most efficient structure.

---

### ✅ Day 13 — Group Anagrams (LeetCode #49)

Topic: Strings / Hashing
Pattern: Sorted Key Grouping
Time Complexity: O(n × k log k)
Space Complexity: O(n)

Key Learning:
Sorting characters of each word produces a canonical representation that allows grouping of anagrams using a HashMap.

Insight:
Transforming data into a normalized form simplifies grouping and comparison tasks.

---

### ✅ Day 14 — Longest Palindromic Substring (LeetCode #5)

Topic: Strings
Pattern: Expand Around Center
Time Complexity: O(n²)
Space Complexity: O(1)

Key Learning:
Every character (and pair of characters) can act as the center of a palindrome, allowing expansion outward to detect palindromes efficiently.

Insight:
Recognizing structural symmetry can drastically reduce unnecessary substring checks.

---

### ✅ Day 15 — String to Integer (atoi) (LeetCode #8)

Topic: Strings / Parsing
Pattern: Controlled State Traversal
Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Handling whitespace, sign detection, digit extraction, and overflow conditions step-by-step ensures correct integer conversion.

Insight:
Robust input parsing requires careful boundary checks and overflow handling.

---

### ✅ Day 16 — Reverse Words in a String (LeetCode #151)

Topic: Strings
Pattern: Reverse Traversal / String Manipulation
Time Complexity: O(n)
Space Complexity: O(n)

Key Learning:
Trimming spaces and reversing the word order produces a clean result without modifying individual characters.

Insight:
Breaking text processing problems into tokenization and reconstruction simplifies implementation.

---

### ✅ Day 17 — Valid Parentheses (LeetCode #20)

Topic: Strings  
Pattern: Pair Matching / Bracket Validation  
Time Complexity: O(n)  
Space Complexity: O(n)

Key Learning:
A StringBuilder can be used to simulate stack-like behavior by storing unmatched brackets. When a closing bracket matches the most recent opening bracket, the previous character is removed.

Insight:
Problems involving nested structures can be solved by tracking the most recent unmatched element. Even without using an explicit stack, similar behavior can be implemented using dynamic string structures like StringBuilder.

---

### ✅ Day 18 — Implement strStr() (LeetCode #28)

Topic: Strings  
Pattern: Substring Search / Brute Force Matching  
Time Complexity: O(n × m)  
Space Complexity: O(1)

Key Learning:
By comparing the substring starting at each index of the main string with the target string, we can detect the first occurrence of the pattern.

Insight:
Many string problems begin with simple brute-force matching before moving to optimized algorithms like KMP.

---

### ✅ Day 19 — Decode Ways (LeetCode #91)

Topic: Strings / Dynamic Programming  
Pattern: DP State Transition  
Time Complexity: O(n)  
Space Complexity: O(n)

Key Learning:
Dynamic Programming helps break complex problems into smaller overlapping subproblems. By storing results of previous computations, we avoid repeated work.

Insight:
Problems involving counting possible ways or combinations often lead to a dynamic programming solution.

---

### ✅ Day 20 — Count and Say (LeetCode #38)

Topic: Strings  
Pattern: Sequence Construction / Run-Length Encoding  
Time Complexity: O(n × length of string)  
Space Complexity: O(n)

Key Learning:
This problem involves generating a sequence by describing the previous string. Counting consecutive characters and constructing the next string step-by-step helps build the sequence.

Insight:
Many string problems involve recognizing patterns in previous outputs and building the next result accordingly.

---

## 🧠 Patterns Learned

### 🔹 Hashing Techniques
- HashMap Lookup (Two Sum)
- Frequency Counting (Valid Anagram)
- Hash-based Grouping (Group Anagrams)

### 🔹 Greedy Strategies
- Prefix Minimum Tracking (Best Time to Buy and Sell Stock)
- Boundary Elimination Strategy
- Greedy Pointer Movement

### 🔹 Sliding Window
- Dynamic Window Expansion & Shrinking (Longest Substring Without Repeating Characters)

### 🔹 Two Pointer Techniques
- Pair Search after Sorting (3Sum)
- Boundary Shrinking Strategy (Container With Most Water)

### 🔹 Array Transformation Techniques
- Prefix Product
- Suffix Product
- Prefix–Suffix Combination (Product of Array Except Self)

### 🔹 Sorting-Based Optimization
- Sort + Greedy Merge (Merge Intervals)
- Sorted Key Transformation (Group Anagrams)

### 🔹 Mathematical / Bit Manipulation
- Sum Formula Trick (Missing Number)
- XOR Elimination Technique

### 🔹 Matrix Manipulation
- In-place Marker Strategy (Set Matrix Zeroes)

### 🔹 String Processing
- Sliding Window for Character Constraints
- Character Frequency Tracking
- String Parsing with Overflow Handling (atoi)
- Word Tokenization and Reconstruction (Reverse Words)

### 🔹 Symmetry & Expansion
- Expand Around Center (Longest Palindromic Substring)

### 🔹 Space Optimization Techniques
- In-place Array Transformation
- State Compression
- Eliminating Auxiliary Data Structures

---

## 📂 Folder Structure
Arrays/
Strings/
LinkedList/
Stack_Queue/
Trees/
Graphs/
DynamicProgramming/


Each folder contains problem solutions along with approach and complexity analysis.

---

## 🎯 Goals

- Build strong DSA fundamentals
- Improve coding and debugging skills
- Learn common problem-solving patterns
- Maintain daily consistency
- Prepare for technical interviews

---

## 🌱 Current Focus

Arrays → Strings → Linked List → Stack & Queue → Trees → Graphs → Dynamic Programming

---

## 🔗 Connect

Sharing my learning journey and insights on LinkedIn alongside this repository.
