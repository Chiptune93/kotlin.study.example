
fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
    // 단순 복사를 해서 옮기는 것이기 때문에 타입이 정확하게 일치할 필요가 없다.
    for (item in source) {
        destination.add(item)
    }
}