public class Counter {
    private static int count;
    private int instanceCount;

    private void incrementCounter() {
        count++;
        instanceCount++;
    }

    public void printCounter() {
        this.incrementCounter();
        System.out.println("{ count:  " + count +" , instanceCount: "+ instanceCount + "}");
    }

    public static int getCount() {
        return count;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        if(instanceCount <0) return;
        this.instanceCount = instanceCount;
    }
}
