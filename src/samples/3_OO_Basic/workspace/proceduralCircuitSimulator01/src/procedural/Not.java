package procedural;

public class Not {

    public static int input(int input) {
        if (input < 0 || 1 < input) throw new IllegalArgumentException
            ("����(=" + input + ")�́A0��1�łȂ���΂Ȃ�܂���B");
        if (input == 1) return 0;
        else return 1;
    }

}
