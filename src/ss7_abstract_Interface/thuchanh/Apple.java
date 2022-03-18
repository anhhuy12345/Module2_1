package Abstract_Interface.thuchanh;

public class Apple extends Abstract_Interface.thuchanh.Fruit {
    public Apple() {}
    public Apple(String type, String color) {
        super(type,color);
    }

    @Override
    public String howToEat() {
        return "Apple could be sliced";
    }
}