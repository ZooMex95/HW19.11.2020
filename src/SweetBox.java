import java.util.ArrayList;

public class SweetBox implements Eatable {
    private ArrayList <Sweets> list = new ArrayList<>();

    @Override
    public void add(Sweets sweet) {
        list.add(sweet);
    }

    @Override
    public void del() {
        list.remove(list.size() - 1);

    }

    @Override
    public void del(int index) {
        list.remove(index);

    }

    public int getWeight() {
        int weight = 0;
        for (Sweets sweet : list
        ) {
            weight += sweet.weight;
        }
        return weight;
    }

    @Override
    public void printWeight() {
        System.out.println("Вес коробки = " + getWeight());
    }

    public int getPrice() {
        int price = 0;
        for (Sweets sweet : list
        ) {
            price += sweet.price;
        }
        return price;
    }

    @Override
    public void printPrice() {
        System.out.println("Цена коробки = " + getPrice());
    }

    @Override
    public void printDescription() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". Наименование: " + list.get(i).name + ". Вес: " + list.get(i).weight
                + ". Цена: " + list.get(i).price + ". Индекс сладости: " + list.get(i).sweetnessIndex + ".");
        }

    }

    @Override
    public void smartOptimizationWeight(int weight) {
        int minWeight = list.get(0).weight;
        int temp = 0;
        while (getWeight() > weight) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).weight < minWeight) {
                    minWeight = list.get(i).weight;
                    temp = i;
                }
            }
            del(temp);
        }

    }

    @Override
    public void smartOptimizationPrice(int weight) {
        int minPrice = list.get(0).price;
        int temp = 0;
        while (getWeight() > weight) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).price < minPrice) {
                    minPrice = list.get(i).price;
                    temp = i;
                }
            }
            del(temp);
        }


    }
}
