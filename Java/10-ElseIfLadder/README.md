# Else-If Ladder

## Objective

Learn how to make decisions among multiple conditions in Java using the `else-if` ladder.

---

## What is an Else-If Ladder?

An `else-if` ladder is used when there are multiple conditions to evaluate. Java checks each condition one by one from top to bottom.

- If a condition is **true**, its corresponding block executes.
- The remaining conditions are skipped.
- If none of the conditions are true, the `else` block executes.

---

## Syntax

```java
if (condition1) {
    // Code
}
else if (condition2) {
    // Code
}
else if (condition3) {
    // Code
}
else {
    // Default Code
}
```

---

## Flow of Execution

```
              Condition 1
                   │
          ┌────────┴────────┐
          │                 │
        true             false
          │                 │
   Execute Block      Condition 2
                            │
                   ┌────────┴────────┐
                   │                 │
                 true             false
                   │                 │
            Execute Block     Condition 3
                                     │
                               ............
                                     │
                                 Else Block
```

Java stops checking conditions as soon as it finds the first `true` condition.

---

## Example

```java
int marks = 78;

if (marks >= 90) {
    System.out.println("Grade A");
}
else if (marks >= 75) {
    System.out.println("Grade B");
}
else if (marks >= 60) {
    System.out.println("Grade C");
}
else if (marks >= 40) {
    System.out.println("Grade D");
}
else {
    System.out.println("Fail");
}
```

### Output

```
Grade B
```

---

## Concepts Learned

- Multiple decision making
- Else-if ladder
- Sequential condition checking
- Code execution flow
- Importance of condition order
- Default case using `else`

---

## Real-World Applications

- Student grading system
- Income tax calculation
- Employee bonus calculation
- Electricity bill slabs
- Weather forecasting
- Movie ticket pricing
- Shopping discount system

---

## Key Points

- Java checks conditions from top to bottom.
- Only the first true condition executes.
- Remaining conditions are skipped.
- Always place the most specific or highest condition first.
- Use `else` to handle all remaining cases.

---

## Common Mistakes

### ❌ Wrong Order of Conditions

Wrong

```java
if (marks >= 40) {
    System.out.println("Pass");
}
else if (marks >= 90) {
    System.out.println("Grade A");
}
```

Correct

```java
if (marks >= 90) {
    System.out.println("Grade A");
}
else if (marks >= 40) {
    System.out.println("Pass");
}
```

---

### ❌ Forgetting the Final `else`

Always include an `else` block if you want to handle unexpected or remaining cases.

---

### ❌ Using `=` Instead of `==`

Wrong

```java
if (marks = 90)
```

Correct

```java
if (marks == 90)
```

---

## Interview Questions

1. What is an else-if ladder in Java?
2. How is an else-if ladder different from an if-else statement?
3. Why should conditions be arranged in descending order?
4. What happens after one condition becomes true?
5. When should you use an else-if ladder instead of multiple if statements?

---

## Files Included

- ElseIfLadder.java
- PracticeExercise.java
- MiniChallenge.java

---

## Revision Checklist

- [x] Understood the else-if ladder
- [x] Learned the syntax
- [x] Wrote the grading program
- [x] Completed the practice exercise
- [x] Completed the mini challenge
- [x] Learned why condition order matters
- [x] Updated GitHub repository