# If-Else Statement

## Objective

Learn how to make decisions in Java using the `if-else` statement.

---

## What is an If-Else Statement?

An `if-else` statement allows a program to execute one block of code when a condition is **true** and another block when the condition is **false**.

Unlike the `if` statement, one of the two blocks will always execute.

---

## Syntax

```java
if (condition) {
    // Executes when the condition is true
} else {
    // Executes when the condition is false
}
```

---

## Flow of Execution

```
             Condition
                 │
         ┌───────┴────────┐
         │                │
       true            false
         │                │
 Execute if Block   Execute else Block
```

---

## Example

```java
int age = 17;

if (age >= 18) {
    System.out.println("Eligible to Vote");
} else {
    System.out.println("Not Eligible to Vote");
}
```

### Output

```
Not Eligible to Vote
```

---

## Concepts Learned

- Decision making
- if statement
- else statement
- Boolean conditions
- Relational operators with if-else
- Logical thinking

---

## Real-World Applications

- Login authentication
- Voting eligibility
- ATM withdrawal approval
- Bank transaction validation
- Student pass/fail result
- Shopping discount eligibility
- Online payment verification

---

## Key Points

- `if` executes when the condition is true.
- `else` executes when the condition is false.
- Exactly one block executes.
- The condition must return a boolean value.
- Always use curly braces `{}` for better readability.

---

## Difference Between if and if-else

| if | if-else |
|----|----------|
| Executes only when the condition is true. | Executes either the if block or the else block. |
| May produce no output when the condition is false. | Always executes one of the two blocks. |

---

## Common Mistakes

### ❌ Using `=` instead of `==`

Wrong

```java
if (age = 18)
```

Correct

```java
if (age == 18)
```

---

### ❌ Forgetting Curly Braces

Avoid

```java
if (marks >= 40)
    System.out.println("Passed");
else
    System.out.println("Failed");
```

Prefer

```java
if (marks >= 40) {
    System.out.println("Passed");
} else {
    System.out.println("Failed");
}
```

---

### ❌ Condition is not boolean

Wrong

```java
if (age)
```

Correct

```java
if (age >= 18)
```

---

## Interview Questions

1. What is an if-else statement?
2. What is the difference between if and if-else?
3. What type of value must an if condition return?
4. Can an else statement exist without an if statement?
5. When should you use if-else instead of a simple if statement?

---

## Files Included

- IfElseStatement.java
- PracticeExercise.java
- MiniChallenge.java

---

## Revision Checklist

- [x] Understood if-else statements
- [x] Learned the syntax
- [x] Wrote the main program
- [x] Completed the practice exercise
- [x] Completed the mini challenge
- [x] Tested different conditions
- [x] Updated GitHub repository