class Person2(val name: String) {
    val emails by lazy { loadEmails(this)}

    private fun loadEmails(person2: Person2) {
        // ... 데이터 가져오는 부분
    }
}
