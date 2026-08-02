# If Statement

## Objective

Learn how to make decisions in Java using the `if` statement.

---

## What is an If Statement?

An `if` statement is a decision-making statement in Java. It executes a block of code **only when the specified condition is true**.

If the condition is **false**, Java skips that block of code.

---

## Syntax

```java
if (condition) {
    // Code to execute if the condition is true
}
```

---

## Flow of Execution

```
          Condition
              │
      ┌───────┴───────┐
      │               │
    true           false
      │               │
 Execute Code      Skip Code
```

---

## Example

```java
int age = 21;

if (age >= 18) {
    System.out.println("Eligible to Vote");
}
```

### Output

```
Eligible to Vote
```

---

## Concepts Learned

- Decision making
- `if` statement
- Boolean conditions
- Code blocks using `{ }`
- Relational operators inside `if`
- Logical operators inside `if`

---

## Real-World Applications

- Voting eligibility
- ATM withdrawal validation
- Login authentication
- Exam result checking
- Bank transaction approval
- Shopping discount eligibility
- College admission systems

---

## Key Points

- The condition inside an `if` statement must return a boolean value (`true` or `false`).
- If the condition is `true`, the code inside the block executes.
- If the condition is `false`, Java skips the block.
- Always use curly braces `{}` for better readability, even for a single statement.

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

### ❌ Forgetting braces

Avoid

```java
if (age >= 18)
    System.out.println("Eligible");
```

Prefer

```java
if (age >= 18) {
    System.out.println("Eligible");
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

1. What is an `if` statement in Java?
2. What type of value must an `if` condition return?
3. What happens if the condition is false?
4. What is the difference between `=` and `==` inside an `if` statement?
5. Why are curly braces recommended in `if` statements?

---

## Files Included

- IfStatement.java

---

## Revision Checklist

- [x] Understood the `if` statement
- [x] Learned the syntax
- [x] Wrote the program
- [x] Tested different conditions
- [x] Committed and pushed to GitHub