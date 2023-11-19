fun <T> copyData3(source: MutableList<out T>, destination: MutableList<T>) {
    // out 키워드를 타입을 사용하는 위치 앞에 붙이면 T 타입을 in 위치에 사용하는 메서드를 호출하지 않는다는 뜻이다.
    for (item in source) {
        destination.add(item)
    }
}

