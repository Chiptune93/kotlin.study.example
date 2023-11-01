package `Part6-NPE`

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    // null 로 초기화 하기 위해 널이 될 수 있는 타입인 프로퍼티를 선언한다.
    private var myService: MyService? = null

    @Before
    fun setUp() {
        // 셋업 메소드 안에서 진짜 초기 값을 지정한다.
        myService = MyService();
    }

    @Test
    fun testAction() {
        // Assert.assertEquals("foo", myService!!.performAction())
    }
}
