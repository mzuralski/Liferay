package pl.first.fdata;

import org.slf4j.Logger;

/**
 * Created by Marcin on 2015-08-02.
 */
public class Singleton {


    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private String cos;

    private Singleton() {

    }

    public Singleton(String cos) {
        this.cos = cos;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }
}
