package procedural;

public class Not {

	public static int input(int input) {
		if (input == 1) return 0;
		else if (input == 0) return 1;
		else throw new IllegalArgumentException
			("値(=" + input + ")は、0か1でなければなりません。");
	}

}
