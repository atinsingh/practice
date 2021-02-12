package io.learning.old;

public interface Work {
    default void work() {
        System.out.println("I am a worker");
    }
}
