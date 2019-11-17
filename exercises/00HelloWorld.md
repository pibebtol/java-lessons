## Hello World and Setup

### Setup and Usage Guides

[Install Java on Windows](https://pibebtol.github.io/java-lessons/exercises/ressources/00windows.html)

[Command Line Usage Guide](https://pibebtol.github.io/java-lessons/exercises/ressources/00command.html)

[Intellij Usage Guide](https://pibebtol.github.io/java-lessons/exercises/ressources/00intellij.html)

[Eclipse Usage Guide](https://pibebtol.github.io/java-lessons/exercises/ressources/00eclipse.html)

### Hello World

* Create a new file `HelloWorld.java`.
* A new class has to be created:
```
public class HelloWorld {
    // this is the inner body of the class
}
```
* Within that class, create a main-function:
```
public static void main(String[] args) {
	System.out.println("Hello World!");	
}
```
* Execute the class (see usage guides in the top on how to do that):

* What happens, when we run it?
  * When the class HelloWorld is executed, the *main* function will be run.
  * Within the *main* function, the command `System.out.println` is executed.
  * That prints the string "Hello World!" to the console.

Example solution: [HelloWorld](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/00HelloWorld)
