package procedural;

public class And {
    public static int input(int in0, int in1) {
        if (in0 < 0 || 1 < in0) throw new IllegalArgumentException
			("in0(=" + in0 + ")�́A0��1�łȂ���΂Ȃ�܂���B");

        if (in1 < 0 || 1 < in1) throw new IllegalArgumentException
			("in1(=" + in1 + ")�́A0��1�łȂ���΂Ȃ�܂���B");

        if (in0 == 1 && in1 == 1) return 1;
        else return 0;
    }
}
