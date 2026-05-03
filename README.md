# Lab-Assignment-8-Composite-Design-Pattern

A Java implementation of the **Composite Design Pattern** modeling New Era University's organizational hierarchy.

---

## Files

| File | Role |
|------|------|
| `Educationalunit.java` | Component interface |
| `College.java` | Composite |
| `Department.java` | Composite |
| `Teacher.java` | Leaf |
| `Student.java` | Leaf |
| `UniversityClient.java` | Client / demo |

---

## How to Run

```bash
javac *.java
java UniversityClient
```

---

## Pattern Summary

- `Educationalunit` defines `display()`, `getStudentCount()`, and `getBudget()`
- `College` and `Department` hold a list of `Educationalunit` children
- `Teacher` budget = salary · `Student` budget = −tuition fee
- All operations recurse through the tree automatically

---
## Screenshot
<img width="1362" height="1109" alt="uml" src="https://github.com/user-attachments/assets/e34d88f9-f2d1-4b30-a050-2aeac54abbf2" />
