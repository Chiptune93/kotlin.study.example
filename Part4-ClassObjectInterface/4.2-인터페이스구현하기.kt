package `Part4-ClassObjectInterface`

class Button1 : Clickable {
    override fun click() = println("I was clicked")
}

fun main() {
    Button1().click()
}
