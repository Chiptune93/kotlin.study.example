package `Part6-NPE`

import StringProcessor

class StringPrinter : StringProcessor {
    override fun process(value: String?) {
        println(value)
    }
}

class NullableStringPrinter : StringProcessor {
    override fun process(value: String?) {
        if (value != null) {
            println(value)
        }
    }
}
