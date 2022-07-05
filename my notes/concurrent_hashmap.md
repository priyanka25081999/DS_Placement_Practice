#### Facts about ConcurrentHashMap

1. You should use ConcurrentHashMap when you need very high concurrency in the project.

2. It is thread safe without synchronizing the whole map.
Reads can happen very fast while write is done with a lock.

3. There is no locking at the object level. The locking is at a much finer granularity at a hashmap bucket level.

4. ConcurrentHashMap doesn’t throw a ConcurrentModification Exception if one thread tries to modify it while another is iterating over it.

5. ConcurrentHashMap uses multitude of locks.
