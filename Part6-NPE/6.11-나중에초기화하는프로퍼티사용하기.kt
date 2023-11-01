package `Part6-NPE`


class MyService2 {
    fun performAction(): String = "foo"
}

class MyTest2 {
    // 초기화 하지 않고 널이 될 수 없는 프로퍼티를 선언한다.
    private lateinit var myService: MyService2

    @Before
    fun setUp() {
        // 셋업 메소드 안에서 진짜 초기 값을 지정한다.
        myService = MyService2();
    }

    @Test
    fun testAction() {
        // 널 검사를 수행하지 않고 프로퍼티를 사용한다.
        // Assert.assertEquals("foo", myService.performAction())
    }
}

annotation class Test
annotation class Before
