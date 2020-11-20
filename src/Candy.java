public class Candy extends Sweets {
    public Candy() {
        super.name = "Конфетки";
        super.price = 100;
        super.weight = 5;
        super.sweetnessIndex = 1;
    }

    public Candy(String name, int price, int weight, int sIndex) {
        super.name = name;
        super.price = price;
        super.weight = weight;
        super.sweetnessIndex = sIndex;
    }

}
