package ss3_oop.baitap;

public class TestFanOOP {
    public static void main(String[] args) {
        FanOOP obj1 = new FanOOP();
        FanOOP obj2 = new FanOOP();

        obj1.setSpeed(obj1.FAST);
        obj1.setRadius(10);
        obj1.setColor("Yellow");
        obj1.setOn(true);
        System.out.println(obj1.toString());

        obj2.getSpeed();
        obj2.getRadius();
        obj2.getColor();
        obj2.isOn();
        System.out.println(obj2.toString());

    }
}
