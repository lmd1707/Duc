import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class AsyncDispatcher {
    private ExecutorService executor;

    public AsyncDispatcher() {
        this.executor = Executors.newCachedThreadPool();
    }

    public <T> void dispatchTask(AsyncTask<T> task, Callback<T> callback) {
        executor.submit(() -> {
            try {
                T result = task.execute();
                callback.onComplete(result);
            } catch (Exception e) {
                callback.onError(e);
            }
                });
    }

    public void shutdown() {
        executor.shutdown();
    }
}
