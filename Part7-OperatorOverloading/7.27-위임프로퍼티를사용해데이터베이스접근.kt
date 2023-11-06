object Users : IdTable() { // 객체는 데이터베이스에 저장되어있다고 가정
    // 프로퍼티는 테이블 컬럼에 해당.
    val name = varchar("name", length = 50).index()
    val age = Integer("age")
}

// 각 User 인스턴스는 테이블에 들어있는 구체적인 엔티티이다.
class User(id: EntityID) : Entity(id) {
    // 사요자 이름은 데이터베이스 컬럼에 들어가 있다/
    var name: String by Users.name
    var age: Int by Users.age
}
