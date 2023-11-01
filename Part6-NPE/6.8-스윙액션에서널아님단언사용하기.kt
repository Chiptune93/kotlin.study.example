package `Part6-NPE`

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JList

class CopyRowAction(val list: JList<String>) : AbstractAction() {
    override fun isEnabled(): Boolean =
        list.selectedValue != null

    override fun actionPerformed(e: ActionEvent?) {
        // actionPerformed는 isEnabled가 "true"인 경우에만 호출된다.
        val value = list.selectedValue!!
        // -> val value = list.selectedValue ?: return 처럼 널이 될 수 없는 타입의 값을 얻어야 한다.
    }
}
