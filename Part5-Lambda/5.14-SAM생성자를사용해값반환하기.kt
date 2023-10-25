package `Part5-Lambda`

fun createAllDoneRunnable(): Runnable {
    // SAM 생성자(Runnable)를 감싸서 값을 리턴.
    return Runnable { println("All Done !") }
}

fun main() {
    createAllDoneRunnable().run()

    // SAM 생성자(OnClickListener)를 이용해 인스턴스로 만들어 저장하고 활용한다.
//    val listener = OnClickListener { view ->
//        val text = when (view.id) {
//            R.id.button1 -> "First Button"
//            R.id.button2 -> "Second Button"
//            else -> "Unknown Button"
//        }
//        toast(text)
//    }
//
//    button1.setOnClickListener(listener)
//    button2.setOnClickListener(listener)

}
