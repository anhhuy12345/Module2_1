package Abstract_Interface.thuchanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cluck";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}