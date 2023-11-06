import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

class Person3(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(newValue) {
            // 뒷받침하는 필드에 접근할때 사용하는 "field" 식별자.
            val oldValue = field
            field = newValue
            // 프로퍼티 변경을 리스너에게 통지
            changeSupport.firePropertyChange(
                "age", oldValue, newValue
            )
        }
    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange(
                "salary", oldValue, newValue
            )
        }
}

fun main() {
    val p = Person3("Dmitry", 34, 2000)
    // 프로퍼티 변경 리스너를 추가한다.
    p.addPropertyChangeListener(
        PropertyChangeListener { evt ->
            println(
                "Property ${evt.propertyName} changed " +
                        "from ${evt.oldValue} to ${evt.newValue}"
            )
        }
    )
    p.age = 44
    p.salary = 45359230
}
