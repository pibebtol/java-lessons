public class Earth {
    public static void main(String[] args) {
        GiftFactory myFactory = new GiftFactory();
        Child johannes = new Child(25);
        String johannesGift = myFactory.getGift(johannes.getNiceNaughtyScore());
        johannes.openGift(johannesGift);
    }
}
