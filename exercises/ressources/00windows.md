## Java Installation under Windows

* download the jdk from [this website](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* install with default settings should be fine
* on windows, you have to set the system variable. Help can be found [here](https://java.com/EN/DOWNLOAD/HELP/PATH.XML) (_the "value" has to look something like this: `[C:/Program Files/Java13/bin]`. It is important that you set it to the "bin" folder._) - This step is important to tell windows where java is installed and so that every program can access the java installation.
* check if it worked by opening a **new** terminal (it has to be new, when you changed the system variable) and typing `java -version` (if you get output that says something like `java version 13.x installed` you are good to go)
* if you run into any problems, contact us, write an issue on github, write us an email, etc...