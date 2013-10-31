package procedural;

public class And {
	public static int input(int input0, int input1) {
		if (input0 < 0 || 1 < input0)
			throw new IllegalArgumentException("input0(=" + input0 + ")は、0か1でなければなりません。");
		if (input1 < 0 || 1 < input1)
			throw new IllegalArgumentException("input1(=" + input1 + ")は、0か1でなければなりません。");
		if (input0 == 1 && input1 == 1) return 1;
		else return 0; 
	}
}
