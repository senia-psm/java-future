package lesson16.exercise;

import lesson12.cache.CachingDataStorage;

import java.util.List;

public class ListCachingDataStorage<K, T> implements CachingDataStorage<List<K>, List<T>> {

    public ListCachingDataStorage(CachingDataStorage<K, T> storage) {
        // TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public OutdatableResult<List<T>> getOutdatable(List<K> key) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
