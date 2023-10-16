package `Part4-ClassObjectInterface`

//class Users constructor(_nickname: String) {
//    val nickname: String
//
//    init {
//        nickname = _nickname
//    }
//}

// 위 클래스 선언을 아래와 같이 바꿀 수 있다.
// - 주 생성자 앞에 애노테이션이나 가시성 변경자가 없다면 constructor 생략 가능.

class Users(_nickname: String) { // '_' 는 프로퍼티와 생성자 파라미터를 구분한다.
    val nickname = _nickname // 프로퍼티를 주 생성자의 파라미터로 초기화 한다.
}

// 위 클래스를 자바로 바꾸면 ...
//public final class Users {
//    private final String nickname;
//
//    public final String getNickname() {
//        return this.nickname;
//    }
//
//    public Users(String _nickname) {
//        Intrinsics.checkNotNullParameter(_nickname, "_nickname");
//        super();
//        this.nickname = _nickname;
//    }
//}

open class User2(val nickname: String) {}
// 기반 클래스의 생성자를 호출하여 초기화
class TwitterUser(nickname: String) : User2(nickname) {}
