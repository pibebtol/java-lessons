## Christmas Special

### Description
Es ist bald Weihnachten, und wir brauchen eure Hilfe beim Geschenkeausliefern. 

Wir stellen euch eine Geschenkfabrik zur Verfügung. Ihr übernehmt die Rolle von den Weihnachtswichteln. Das bedeutet, dass ihr die Geschenke abholt und Kindern beim Auspacken helfen sollt.

Die Geschenkfabrik hat eine Funktion `getGift`, welche einen `int` Wert (wie "gut" das Kind dieses Jahr war) entgegen nimmt. Der Wert muss zwischen 1 und 100 liegen.

Die Geschenke sind allerdings verpackt (verschlüsselt), deswegen müsst ihr ihnen beim Auspacken helfen. (Schaut euch die verschlüsselten Geschenke an und überlegt, wie ihr die Geschenke entschlüsseln könntet.)

Viel Spaß 😉

### Tasks
1. Get the class `GiftFactory.java` and create it in your project.
2. Implement the class `Child.java` that can open gifts and has a nice-naughty score.
3. Implement a class `Earth.java` that creates some childs with different nice-naughty values and give them some presents!
4. Profit!

### [Solution](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/XXChristmasSpecial)

### Hints
You can find the file [here](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/XXChristmasSpecial) or take this:
```java
public class GiftFactory {

	private String[] gifts = new String[11];

	GiftFactory() {
		gifts[0] = "Ejf!Svuf";
		gifts[1] = "Fjof!Lpimf";
		gifts[2] = "Fjof!Tdifjcf!Cspu";
		gifts[3] = "Fjof!Tpdlf";
		gifts[4] = "[xfj!Tpdlfo";
		gifts[5] = "Csbubqgfm!)nju!Sptjofo!)Hfjm\"**";
		gifts[6] = "Gvttcbmm";
		gifts[7] = "Ijhi!Ufdi!Tdimjuufo!)Ipu*";
		gifts[8] = "Fjo!gfsohftufvfsuft!Bvup!)Ojdf*";
		gifts[9] = "Ojoufoep!Txjudi\"!)Vmusb!ojdf\"*";
		gifts[10] = "Tp!ojdiu-!Gsfvoedifo\"";
	}

	public String getGift(int niceNaughtyScore) {
		if (niceNaughtyScore >= 1 && niceNaughtyScore <= 100) {
			return gifts[(niceNaughtyScore-1)/10];
		} else {
			return gifts[10];
		}
	}
}
```


