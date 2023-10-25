package Part4

import javax.swing.plaf.nimbus.State;
import javax.swing.text.View;

public class Button implements View {
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }
    @Override
    public void restoreState(State state) { /* */ }
    // 아래 클래스는 자동으로 내부 클래스가 된다. 외부 버튼 클래스에 대한 참조가 묵시적으로 포함되기 때문.
    public class ButtonState implements State { /* */ }
}

