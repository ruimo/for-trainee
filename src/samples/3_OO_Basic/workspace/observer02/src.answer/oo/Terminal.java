package oo;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
    Value value = Value.UNKNOWN;
    final List<TerminalListener> listeners = new ArrayList<TerminalListener>();
    
    public void setValue(Value v) {
        if (v == null) throw new NullPointerException();
        value = v;
        for (TerminalListener l: listeners) {
            l.onChange(v);
        }
    }

    public Value getValue() {
        return value;
    }

    /**
     * �[�q��ڑ�����B
     * @param t �ڑ���̒[�q�Bnull�͋�����܂���B
     */
    public void connectTo(final Terminal t) {
        if (t == null) throw new NullPointerException();
        listeners.add(new TerminalListener() {
            @Override
            public void onChange(Value newValue) {
                t.setValue(newValue);
            }
        });
    }

    public void addListener(TerminalListener l) {
        if (l == null) throw new NullPointerException();
        listeners.add(l);
    }
}
