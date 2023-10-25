package `Part4-ClassObjectInterface`

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun countClicks(window: Window) {
    var clickCount = 0 // 로컬 변수를 정의한다.
    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            clickCount++ // 로컬 변수의 값을 변경한다.
        }
    })
}
