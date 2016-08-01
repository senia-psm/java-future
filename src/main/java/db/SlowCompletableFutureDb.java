package db;

import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.*;

public class SlowCompletableFutureDb<T> implements Closeable {


    private final Map<String, T> values;
    private final ScheduledExecutorService scheduledExecutorService =
            Executors.newSingleThreadScheduledExecutor();

    public SlowCompletableFutureDb(Map<String, T> values) {
        this.values = values;
    }

    public CompletableFuture<T> get(String key) {
        final T value = values.get(key);
        final CompletableFuture<T> result = new CompletableFuture<T>();

        final int timeout = ThreadLocalRandom.current().nextInt(100);

        scheduledExecutorService.schedule(
                () -> result.complete(value),
                timeout,
                TimeUnit.MILLISECONDS);

        return result;
    }

    @Override
    public void close() throws IOException {
        scheduledExecutorService.shutdown();
        scheduledExecutorService.shutdownNow();
        try {
            scheduledExecutorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
