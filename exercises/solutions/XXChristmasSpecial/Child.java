public class Child {
    private int niceNaughtyScore;
    public void openGift(String gift) {

        char[] giftArray = gift.toCharArray();

        for (int i = 0; i < giftArray.length; i++) {
            char a = giftArray[i];
            a--;
            System.out.print(a);
        }
        System.out.println();
    }

    public int getNiceNaughtyScore() {
        return niceNaughtyScore;
    }

    public Child (int score) {
        niceNaughtyScore = score;
    }
}
