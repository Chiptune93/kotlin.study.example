fun main() {
    val authors = listOf("Dmitry", "Svetlana")
    val readers = mutableListOf<String>(/**/)
    // fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>
    readers.filter { it !in authors }
}
