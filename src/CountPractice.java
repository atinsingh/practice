public class CountPractice {
    public static void main(String[] args) {
        Counter cnt1 = new Counter();
        Counter cnt2 = new Counter();

        cnt1.printCounter();
        cnt2.printCounter();
        cnt1.setInstanceCount(1000);
        System.out.println(cnt1.getInstanceCount());
    }
}
