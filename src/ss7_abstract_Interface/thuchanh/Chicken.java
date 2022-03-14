package Abstract_Interface.thuchanh;

public class Chicken extends Abstract_Interface.thuchanh.Animal implements Abstract_Interface.thuchanh.Edible {
    @Override
    public String makeSound() {
        return "Cluck";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}