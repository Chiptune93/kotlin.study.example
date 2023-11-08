fun main() {
    // 무명함수를 넘겨서 사용
    people.filter(fun(person): Boolean {
        return person.age < 30
    })
}
