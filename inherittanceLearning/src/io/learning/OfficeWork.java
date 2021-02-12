package io.learning;

import io.learning.nio.Work;

public class OfficeWork implements Work {
    @Override
    public void work() {
        System.out.println("Workin in office");
    }
}
