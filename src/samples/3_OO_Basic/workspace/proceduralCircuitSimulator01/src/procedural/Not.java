package procedural;

public class Not {

    public static int input(int input) {
        if (input < 0 || 1 < input) throw new IllegalArgumentException
            ("入力(=" + input + ")は、0か1でなければなりません。");
        if (input == 1) return 0;
        else return 1;
    }

}
