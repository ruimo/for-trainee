package procedural;

public class Not {

    public static int input(int input) {
        if (input < 0 || 1 < input) throw new IllegalArgumentException
            ("“ü—Í(=" + input + ")‚ÍA0‚©1‚Å‚È‚¯‚ê‚Î‚È‚è‚Ü‚¹‚ñB");
        if (input == 1) return 0;
        else return 1;
    }

}
