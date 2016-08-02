package db;

import java.util.concurrent.CompletableFuture;

public interface DataStorage<T> {
    CompletableFuture<T> get(String key);
}
