package oo;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    Value value = Value.UNKNOWN;
    final List<Terminal> listeners = new ArrayList<Terminal>();
    
    public void setValue(Value v) {
        if (v == null) throw new NullPointerException();
        value = v;
        // TODO: listenersに登録されたTerminal全てに、新しい値をsetValue()してください。
        for (Terminal t: listeners) {
            t.setValue(v);
        }
    }

    public Value getValue() {
        return value;
    }

    public void addListener(Terminal t) {
        if (t == null) throw new NullPointerException();
        listeners.add(t);
        // TODO: listenersに登録してください。
    }
}
