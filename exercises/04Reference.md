## Reference

### Description
```
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
```
### Task
1. Write the class `Number` that fits the code above.
2. What output do you expect the program to give you?
3. Execute the program and check against your expectations - what do conclude?
