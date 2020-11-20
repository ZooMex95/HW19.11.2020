public class Cookie extends Sweets {
    public Cookie () {
        super.name = "Печеньки";
        super.price = 150;
        super.weight = 10;
        super.sweetnessIndex = 2;
    }

    public Cookie(String name, int price, int weight, int sIndex) {
        super.name = name;
        super.price = price;
        super.weight = weight;
        super.sweetnessIndex = sIndex;
    }
}
