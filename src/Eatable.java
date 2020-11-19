public interface Eatable {
    void add(Sweets sweet);
    void del();
    void del(int index);
    void printWeight();
    void printPrice();
    void printDescription();
    void smartOptimizationWeight(int weight);
    void smartOptimizationPrice(int price);
}
