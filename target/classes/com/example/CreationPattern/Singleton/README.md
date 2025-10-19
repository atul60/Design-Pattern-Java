# Singleton pattern — Demo

This folder contains a small Java example that demonstrates the Singleton design pattern.

Contents

- `Singleton.java` — a simple lazy-initialized singleton with a private constructor and a `public static Singleton getInstance()` method.
- `DemoSingleThread.java` — a small runner that obtains the Singleton twice and checks that both references point to the same instance.

How it works

- The `Singleton` class stores a single private static instance and returns it via `getInstance()`.
- The constructor is private to prevent creating additional instances.

Compile and run (Windows PowerShell)

1. Compile the package sources into `target\classes`:

```powershell
javac -d target\classes src\main\java\com\example\CreationPattern\Singleton\*.java
```

2. Run the demo main class:

```powershell
java -cp target\classes com.example.CreationPattern.Singleton.DemoSingleThread
```

Expected output

```
Both references point to the same instance.
```

Build and run with Maven

```powershell
mvn -DskipTests package
java -cp target\classes com.example.CreationPattern.Singleton.DemoSingleThread
```

Troubleshooting

- "cannot find symbol Singleton" — ensure `Singleton.java` exists in the same package and its filename matches the class name exactly (no trailing spaces).
- "Could not find or load main class" — verify the package declaration in the Java files matches the directory structure and that `target\classes` contains `com\example\CreationPattern\Singleton\DemoSingleThread.class`.

Notes

- This example uses a simple lazy initialization without synchronization; it is fine for single-threaded demos but not thread-safe. For a thread-safe singleton, consider using an enum, a synchronized getter, or the Initialization-on-demand holder idiom.

License

- Copy or adapt for learning and demonstration purposes.
