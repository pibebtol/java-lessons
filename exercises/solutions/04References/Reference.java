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
	}
}