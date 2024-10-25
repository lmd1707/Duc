import java.util.function.Function;
import java.util.concurrent.CompletableFuture;

public class Main_thread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello world!");
    }
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Task completed");
            } catch (InterruptedException ex) {
                System.out.println("Task is interrupted");
            }
        });
        System.out.println("Doing other work...");
        Function<Integer, Integer> doubleIt = x -> x * 2;
        int doubledValue = doubleIt.apply(5);
        System.out.println(doubledValue);

        Main_thread thread = new Main_thread();
        thread.start();
        future.join();
    }
}
