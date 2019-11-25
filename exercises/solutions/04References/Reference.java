public class Reference {
	public static void main(String[] args) {
		int var1 = 4;
		int var2 = var1;

		var1 = 8;
		System.out.println(var2);

		Number ref1 = new Number(4);
		Number ref2 = ref1;
		ref1.number = 8;
		System.out.println(ref2.number);

		Number ref3 = new Number(4);
		Number ref4 = new Number(6);
		badSwap(ref3, ref4);
		System.out.println(ref3.number);
		System.out.println(ref4.number);
    }

    private static void badSwap(Object obj1, Object obj2) {
		Object temp = obj1;
		obj1 = obj2;
		obj2 = temp;
	}
}