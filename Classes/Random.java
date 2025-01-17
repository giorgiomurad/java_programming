import java.util.Random;

// ---- CONSTRUCORS ----
// Constructs a random object with the current time as its seed
public Random() {}

// Constructs a random object with the specified seed
public Random(long seed) {}


// ---- METHODS ----
// Returns a random int value
public int nextInt() {}

// + nextInt(n : int): int
// Returns a random int value between 0 and 'n' (exclusive) [0, n[
public int nextInt(int n) {}

// Returns a random integer value between the specified origin and the specified bound (exclusive)
public int nextInt(int origin, int bound) {}

// Returns a random long value
public long nextLong() {}

// Returns a random double value between 0.0 and 1.0 (exclusive) [0, 1[
public double nextDouble() {}

// Returns a random float value between 0.0F and 1.0F (exclusive) [0, 1[
public float nextFloat() {}

// Returns a random boolean value
public boolean nextBoolean() {}