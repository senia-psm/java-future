package lesson16.exercise;

import lesson12.cache.CachingDataStorage;

import java.util.function.Function;

public class MappingCachingDataStorage<K, K1, T1, T> implements CachingDataStorage<K, T> {

    public MappingCachingDataStorage(CachingDataStorage<K1, T1> storage,
                                     Function<K, K1> mapKey,
                                     Function<T1, T> mapValue) {
        // TODO
        throw new UnsupportedOperationException();
    }

    @Override
    public OutdatableResult<T> getOutdatable(K key) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
