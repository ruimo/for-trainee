package procedural;

public class HalfAdder {
	public static int[] input(int input0, int input1) {
		if (input0 < 0 || 1 < input0)
			throw new IllegalArgumentException("input0(=" + input0 + ")�́A0��1�łȂ���΂Ȃ�܂���B");
		if (input1 < 0 || 1 < input1)
			throw new IllegalArgumentException("input1(=" + input1 + ")�́A0��1�łȂ���΂Ȃ�܂���B");
        
        int or0 = Or.input(input0, input1);

// TODO: And�N���X���g���Čv�Z���Ă��������B
//      int and0 = And.input(???, ???);

// TODO: Not�N���X���g���Čv�Z���Ă��������B
//      int not0 = Not.input(???);

        int and1 = And.input(or0, not0);

        // �ŏ��̗v�f��C�A���̗v�f��S
		return new int[] {and0, and1};
	}
}
