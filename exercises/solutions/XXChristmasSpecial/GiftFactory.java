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
