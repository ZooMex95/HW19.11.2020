public class Main {
    public static void main(String[] args) {
        SweetBox sweetBox = new SweetBox();
        sweetBox.add(new Candy());
        sweetBox.add(new Cookie());
        sweetBox.add(new Waffles());
        sweetBox.add(new Cheesecake());
        sweetBox.printDescription();
        sweetBox.printPrice();
        sweetBox.printWeight();
        sweetBox.smartOptimizationPrice(25);
        sweetBox.printDescription();
        sweetBox.printPrice();
        sweetBox.printWeight();




    }

}
