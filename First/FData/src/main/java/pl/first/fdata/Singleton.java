package pl.first.fdata;

/**
 * Created by Marcin on 2015-08-02.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
