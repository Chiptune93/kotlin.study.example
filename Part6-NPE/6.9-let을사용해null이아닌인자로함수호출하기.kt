package `Part6-NPE`

fun sendEmailTo(email: String) {
    println("Sending Email to $email")
}

@Suppress("UNREACHABLE_CODE")
fun main() {
    var email: String? = "12@34.com"
    email?.let { sendEmailTo(it) }

    email = null
    email?.let { sendEmailTo(it) }
}
