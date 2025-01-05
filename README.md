---
title: "Java Programming 101"
subtitle: "Assignment 1: Safety First!"
---

---

### Problem Statement

In the B@MER reactor, the engineers are analyzing some unusual data.
The unusual data consists of many reports, one report per line. Each report is a series of numbers called levels that are separated by spaces. For example:

```
7 6 4 2 1
1 2 7 8 9
9 7 6 2 1
1 3 2 4 5
8 6 4 4 1
1 3 6 7 9
```

This example data contains six reports each containing five levels.

The engineers are trying to figure out which reports are safe. The B@MER reactor safety systems can only tolerate levels that are either gradually increasing or gradually decreasing. So, a report only counts as safe if both of the following are true:

The levels are either all increasing or all decreasing.
Any two adjacent levels differ by at least zero and at most three.
In the example above, the reports can be found safe or unsafe by checking those rules:

- `7 6 4 2 1`: Safe because the levels are all decreasing by 1 or 2.
- `1 2 7 8 9`: Unsafe because 2 7 is an increase by 5.
- `9 7 6 2 1`: Unsafe because 6 2 is a decrease by 4.
- `1 3 2 4 5`: Unsafe because 1 3 is increasing but 3 2 is decreasing.
- `8 6 4 4 1`: Safe because 4 4 is neither an increase nor a decrease.
- `1 3 6 7 9`: Safe because the levels are all increasing by 1, 2, or 3.
So, in this example, 3 reports are safe.

Analyze the unusual data from the engineers. How many reports are safe?

---

**Input**

The first line of the input contains two integers that they are separated by space $n,m (1 \le n,m \le 1000)$ — n is the number of reports and m is the length of the sequence of the numbers in the reports. The next $m$ lines contains the reports, which consists of the digits from 0 to 9. The numbers are separated by spaces.

**Output**

Print one integer — the number of the safe reports.

---

**Examples**
   
- Example 1

**Input**

```
6 5
7 6 4 2 1
1 2 7 8 9
9 7 6 2 1
1 3 2 4 5
8 6 4 4 1
1 3 6 7 9
```

**Output**

```
3
```

- Example 2

**Input**

```
4 6
9 8 8 7 7 6
1 2 3 4 5 6
6 6 6 6 6 6
0 1 2 5 5 9
```

**Output**

```
3
```

- Example 3

**Input**

```
6 4
3 1 1 2
0 2 1 0
9 5 5 4
2 6 7 8
9 8 7 3
9 9 9 1
```

**Output**

```
0
```