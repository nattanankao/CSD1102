import java.util.concurrent.atomic.AtomicInteger;

public class CoffeeMachine {

    private AtomicInteger orderNumber = new AtomicInteger(0);

    public synchronized void brew(String menu) {

        int order = orderNumber.incrementAndGet();

        System.out.println(Thread.currentThread().getName()
                + " กำลังใช้เครื่องชง Order " + order + " : " + menu);

        try {
            Thread.sleep((long)(Math.random() * 3000));
        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName()
                + " เครื่องชงเสร็จ Order " + order + " : " + menu);
    }
}