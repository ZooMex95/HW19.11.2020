public class Main {
    public static void main(String[] args) {
        SweetBox sweetBox = new SweetBox();
        sweetBox.add(new Candy("Рафаэлло", 200, 10, 2));
        sweetBox.add(new Cookie("Юбилейное", 300, 20, 4));
        sweetBox.add(new Waffles("Яшкино", 400, 16, 6));
        sweetBox.add(new Cheesecake("Чизкейк", 500, 8, 9));
        sweetBox.add(new Waffles("Простые вафли", 120, 7, 5));
        sweetBox.printDescription();
        sweetBox.printPrice();
        sweetBox.printWeight();
        sweetBox.smartOptimizationPrice(25);
        sweetBox.printDescription();
        sweetBox.printPrice();
        sweetBox.printWeight();




    }

}
