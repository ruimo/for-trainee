package procedural;

public class HalfAdder {
	public static int[] input(int input0, int input1) {
		if (input0 < 0 || 1 < input0)
			throw new IllegalArgumentException("input0(=" + input0 + ")は、0か1でなければなりません。");
		if (input1 < 0 || 1 < input1)
			throw new IllegalArgumentException("input1(=" + input1 + ")は、0か1でなければなりません。");
        
        int or0 = Or.input(input0, input1);

// TODO: Andクラスを使って計算してください。
//      int and0 = And.input(???, ???);

// TODO: Notクラスを使って計算してください。
//      int not0 = Not.input(???);

        int and1 = And.input(or0, not0);

        // 最初の要素がC、次の要素がS
		return new int[] {and0, and1};
	}
}
