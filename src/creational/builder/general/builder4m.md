When to Use the Builder Pattern:
1. When Object Construction is Complex:
   If creating an object involves many optional parameters or combinations.
   If the object requires several steps to build, making constructors or factory methods cumbersome.
   Example: Building a complicated object like a computer system with optional components (CPU, GPU, RAM, storage).

2. To Avoid "Telescoping Constructor" Problem:
   If a class has too many constructor parameters, it becomes confusing to manage them.
   Telescoping constructors make it hard to understand and use the class.

3. When You Want Immutable Objects:
   Builder pattern can enforce immutability by making the target class immutable.
   The builder itself is mutable, but the built object is immutable.

4. To Increase Code Readability:
   With fluent interfaces, the builder pattern makes the code more readable.
   Clearer code, especially when creating objects with many attributes.

5. When You Want to Reuse the Same Construction Code:
   The same builder can be used to create multiple variations of an object.
   Reduces code duplication.