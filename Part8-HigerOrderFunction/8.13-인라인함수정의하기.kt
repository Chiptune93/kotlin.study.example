import java.util.concurrent.locks.Lock

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun main() {
    // Lock 클래스의 인스턴스만을 요구하는 synchronized
    //    val l = Lock()
    //    synchronized(l) {
    //        // ...
    //    }
}
