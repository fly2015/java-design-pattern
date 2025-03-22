
1. Object Pool Pattern
   Purpose: Manages a pool of reusable objects to optimize resource usage (e.g., database connections, thread pools).
   Example: A pool of database connections where requests can borrow and return connections instead of creating new ones each time.

2. Lazy Initialization
   Purpose: Delay the creation of an object until it is needed.
   Often used alongside Singleton or with heavy objects.

3. Multiton Pattern
   Purpose: Similar to Singleton, but allows for multiple instances identified by keys.
   Useful when you need controlled access to limited instances.

4. Dependency Injection (DI)
   Purpose: A technique to reduce tight coupling by injecting dependencies instead of creating them internally.
   Often used in frameworks like Spring.

5. Prototype Registry
   Purpose: Extends the Prototype Pattern by maintaining a registry of prototypes.
   Allows dynamic retrieval of prototype instances by keys.

🔵 Summary of When to Use These Patterns:
Pattern;	Use When...
Object Pool;	Expensive objects need to be reused frequently.
Lazy Initialization;	Object creation is costly and unnecessary until used.
Multiton;	A fixed, limited number of instances with unique keys are required.
Dependency Injection;	You want to reduce coupling and make testing easier.
Prototype Registry;	Need to clone objects dynamically with a registry of prototypes.
