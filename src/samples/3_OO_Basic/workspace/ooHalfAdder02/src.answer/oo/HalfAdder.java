package oo;

public class HalfAdder extends Logic {
    public HalfAdder() {
        super(2, 2);

        And and0 = new And();
        And and1 = new And();
        Or or = new Or();
        Not not = new Not();

        // Œ‹ü‚·‚éB
        input[0].connectTo(and0.getInput(0));
        input[0].connectTo(or.getInput(0));

        input[1].connectTo(and0.getInput(1));
        input[1].connectTo(or.getInput(1));

        or.getOutput(0).connectTo(and1.getInput(0));
        and0.getOutput(0).connectTo(not.getInput(0));
        and0.getOutput(0).connectTo(output[1]);
        not.getOutput(0).connectTo(and1.getInput(1));
        and1.getOutput(0).connectTo(output[0]);
    }
}
