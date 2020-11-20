public class Cheesecake extends Sweets {
    public Cheesecake() {
        super.name = "Чизкейк";
        super.price = 300;
        super.weight = 4;
        super.sweetnessIndex = 4;
    }

    public Cheesecake(String name, int price, int weight, int sIndex) {
        super.name = name;
        super.price = price;
        super.weight = weight;
        super.sweetnessIndex = sIndex;
    }
}
