# Logical Operators

## Objective

Learn how to combine multiple conditions in Java using logical operators.

---

## What are Logical Operators?

Logical operators are used to combine two or more boolean expressions (conditions). They always return either **true** or **false**.

---

## Types of Logical Operators

| Operator | Name | Description |
|----------|------|-------------|
| && | Logical AND | Returns true if both conditions are true. |
| \|\| | Logical OR | Returns true if at least one condition is true. |
| ! | Logical NOT | Reverses the boolean value. |

---

## Truth Table

### Logical AND (&&)

| Condition 1 | Condition 2 | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

### Logical OR (||)

| Condition 1 | Condition 2 | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

### Logical NOT (!)

| Original | Result |
|----------|--------|
| true | false |
| false | true |

---

## Example

```java
int age = 21;
boolean hasLicense = true;

System.out.println(age >= 18 && hasLicense);
```

### Output

```
true
```

---

## Concepts Learned

- Logical AND (`&&`)
- Logical OR (`||`)
- Logical NOT (`!`)
- Combining multiple conditions
- Boolean expressions
- Real-world decision making

---

## Real-World Applications

- Login authentication
- Online shopping eligibility
- ATM transactions
- College admission criteria
- Exam eligibility
- Driving license validation

---

## Key Points

- Logical operators work with boolean expressions.
- `&&` returns true only if both conditions are true.
- `||` returns true if at least one condition is true.
- `!` reverses the boolean value.
- Logical operators are commonly used with `if` statements and loops.

---

## Common Mistakes

❌ Confusing `&&` with `||`

❌ Using `!` without understanding that it reverses the result.

❌ Forgetting to use parentheses for better readability.

---

## Interview Questions

1. What are logical operators in Java?
2. Explain the difference between `&&` and `||`.
3. What does the `!` operator do?
4. Which data type is returned by logical operators?
5. Where are logical operators used in real-world applications?

---

## Files Included

- LogicalOperators.java
- PracticeExercise.java
- MiniChallenge.java

---

## Revision Checklist

- [x] Understood logical operators
- [x] Wrote the program
- [x] Practiced examples
- [x] Completed the mini challenge
- [x] Updated GitHub repository