package creational.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    }
}
