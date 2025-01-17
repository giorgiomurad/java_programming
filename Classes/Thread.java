import java.lang.Thread;

// ------ CONSTRUCTOR ------
// Creates an empty thread
public Thread() {}

// Creates a thread for a specified task
public Thread(Runnable task) {}


// ------ METHODS ------
// Executes the thread
public void start() {}

// Tests whether the thread is currently running or not
public boolean isAlive() {}

// Sets the priority of the thread based on the given priority rate (rangin from 1 to 10)
public void setPriority(int p) {}

// Waits for this thread to finish its task
public void join() {}

// Puts the thread to sleep for a specified time in milliseconds
public static void sleep(long millis) {}

// Causes the thread to temporarily pause, and allow other threads to execute
public static void yield() {}

// Interrupts the thread
public void interrupt() {}