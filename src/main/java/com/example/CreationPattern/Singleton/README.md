# Singleton pattern — Demo

This folder contains a small Java example that demonstrates the Singleton design pattern.

Contents

- `Singleton.java` — a simple lazy-initialized singleton with a private constructor and a `public static Singleton getInstance()` method.
- `DemoSingleThread.java` — a small runner that obtains the Singleton twice and checks that both references point to the same instance.

Theory (based on this code)

- Purpose: the `Singleton` class implements the canonical lazy-initialized singleton pattern: one and only one instance of `Singleton` is allowed, and it is created on first use.

- Key parts of `Singleton.java` in this project:

  - `private static Singleton instance;` — a private static field to hold the single instance.
  - `private Singleton()` — a private constructor prevents other classes from instantiating `Singleton` directly using `new`.
  - `public static Singleton getInstance()` — the public access point. The method checks `if (instance == null)` and, if so, assigns `instance = new Singleton()` and then returns it.

- Why this works:

  - Because `instance` is static, it belongs to the class, not to any object. All callers of `getInstance()` see the same static field.
  - The private constructor prevents external code from calling `new Singleton()`, so the only way to obtain an instance is via `getInstance()`.

- Demo behavior (`DemoSingleThread.java`):

  - The demo calls `Singleton.getInstance()` twice and compares the reference equality (`==`). Because the same static `instance` is returned both times, the demo prints "Both references point to the same instance." This proves the singleton property in a single-threaded context.

- Trade-offs & limitations in this implementation:

  - Not thread-safe: if two threads call `getInstance()` concurrently the first time, both can observe `instance == null` and each create a separate `Singleton` instance. That defeats the singleton guarantee in multi-threaded environments.
  - No lazy holder idiom: the simple `if (instance == null) instance = new Singleton();` is straightforward but doesn't guard against races.

- Common thread-safe alternatives (not implemented here but worth knowing):

  - Eager initialization: `private static final Singleton INSTANCE = new Singleton();` — thread-safe because class initialization is synchronized by the JVM, but instance is created even if never used.
  - Synchronized accessor: `public static synchronized Singleton getInstance()` — simple and correct, but adds synchronization overhead on every call.
  - Double-checked locking with a volatile field — reduces synchronization overhead but must be implemented correctly (volatile + synchronized block).
  - Initialization-on-demand holder idiom:
    ```java
    private static class Holder { static final Singleton INSTANCE = new Singleton(); }
    public static Singleton getInstance() { return Holder.INSTANCE; }
    ```
    This is lazy and thread-safe without synchronization overhead on each call.
  - Enum singleton (`enum Singleton { INSTANCE; }`) — best practice for singletons in many cases because it provides serialization safety and protects against multiple instantiation via reflection.

- When to use a singleton:
  - Use when you need a single shared resource or manager (e.g., configuration, caching, logging dispatcher) and when global access is justified. Avoid overusing singletons as they introduce global state and can make testing harder.

If you'd like, I can replace the simple lazy implementation with a thread-safe variant (e.g., holder idiom or enum) and add a short test that asserts both references are identical even under concurrent access.
