class Card {
    private String color;
    private int number;

    Card(String color, int number) {
        this.number = number;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public int getNumber() {
        return number;
    }
    
    @Override
    public String toString() {
        return color + " " + number;
    }
}
