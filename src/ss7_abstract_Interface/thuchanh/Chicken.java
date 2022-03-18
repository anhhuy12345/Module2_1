package Abstract_Interface.thuchanh;

public class Chicken extends Abstract_Interface.thuchanh.Animal {
    @Override
    public String makeSound() {
        return "Cluck";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}