package creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Uncomment this to check result of trying to create new Object
        // Singleton test1 = new Singleton();
        Singleton x = Singleton.getInstance();
        System.out.println(x);
        System.out.println(x);


        // Uncomment this to check result of trying to create new Object
        // LazySingleton test2 = new LazySingleton();
        LazySingleton y = LazySingleton.getInstance();
        System.out.println(y);
        System.out.println(y);


        // Uncomment this to check result of trying to create new Object
        // Singleton test3 = new Singleton();
        ThreadSafeSingleton z = ThreadSafeSingleton.getInstance();
        System.out.println(x);
        System.out.println(x);
    }
}
