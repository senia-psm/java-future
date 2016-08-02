package lesson12.cache;

import data.typed.Employee;
import data.typed.Employer;
import data.typed.Position;

public class TypedEmployeeCachedStorage implements CachingDataStorage<data.typed.Employee> {

    private final CachingDataStorage<data.Employee> employeeStorage;
    private final CachingDataStorage<Position> positionStorage;
    private final CachingDataStorage<Employer> employerStorage;

    public TypedEmployeeCachedStorage(CachingDataStorage<data.Employee> employeeStorage,
                                      CachingDataStorage<Position> positionStorage,
                                      CachingDataStorage<Employer> employerStorage) {
        this.employeeStorage = employeeStorage;
        this.positionStorage = positionStorage;
        this.employerStorage = employerStorage;
    }

    @Override
    public OutdatableResult<Employee> getOutdatable(String key) {
        // TODO note that you don't know timeouts for different storage. And timeouts can be different.
        throw new UnsupportedOperationException();
    }
}
