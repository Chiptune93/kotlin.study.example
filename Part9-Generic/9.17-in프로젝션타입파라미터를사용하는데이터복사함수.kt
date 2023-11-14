fun <T> copyData4(source: MutableList<T>, destination: MutableList<in T>) {
    // 원본 리스트 원소 타입의 상위 타입을 대상 리스트 원소 타입으로 허용한다.
    for ( item in source) {
        destination.add(item)
    }
}
