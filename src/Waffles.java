public class Waffles extends Sweets {
    public Waffles() {
        super.name = "Вафельки";
        super.price = 200;
        super.weight = 8;
        super.sweetnessIndex = 3;
    }

    public Waffles(String name, int price, int weight, int sIndex) {
        super.name = name;
        super.price = price;
        super.weight = weight;
        super.sweetnessIndex = sIndex;
    }

}
