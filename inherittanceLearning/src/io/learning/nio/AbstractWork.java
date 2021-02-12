package io.learning.nio;

public abstract class AbstractWork {
    private String name = "Abstract Class";

    public void abWork() {
        System.out.println("Abstract work");
    }

    public abstract void sleep();
}
