package lesson12.cache;

import db.SlowCompletableFutureDb;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class CachingDataStorageImpl<T> implements CachingDataStorage<T> {

    private final SlowCompletableFutureDb<T> db;
    private final int timeout;
    private final TimeUnit timeoutUnits;
    // TODO can we use Map<String, T> here? Why?
    private final ConcurrentMap<String, T> cache = new ConcurrentHashMap<>();

    public CachingDataStorageImpl(SlowCompletableFutureDb<T> db, int timeout, TimeUnit timeoutUnits) {
        this.db = db;
        this.timeout = timeout;
        this.timeoutUnits = timeoutUnits;
    }

    @Override
    public OutdatableResult<T> getOutdatable(String key) {
        // TODO implement
        // TODO use ScheduledExecutorService to remove outdated result from cache - see SlowCompletableFutureDb implementation
        // TODO complete OutdatableResult::outdated after removing outdated result from cache
        // TODO don't use obtrudeException on result - just don't
        throw new UnsupportedOperationException();
    }
}
