fun main() {
    // 식이 본문인 무명함수를 사용하여 필터링
    people.filter(fun(person) = person.age < 30)
}
