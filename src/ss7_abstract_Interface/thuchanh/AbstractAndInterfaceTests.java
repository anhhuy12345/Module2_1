package ss7_abstract_Interface.thuchanh;

import sun.font.FontRunIterator;

public class AbstractAndInterfaceTest {
        public static void main(String[] args) {
             Abstract_Interface.thuchanh.Animal[] animals = new Abstract_Interface.thuchanh.Animal[2];
            animals[0] = new Abstract_Interface.thuchanh.Tiger();
            animals[1] = new Abstract_Interface.thuchanh.Chicken();

            for (Abstract_Interface.thuchanh.Animal animal : animals) {
                System.out.println(animal.makeSound());

                if (animal instanceof Abstract_Interface.thuchanh.Chicken) {
                    System.out.println(((Abstract_Interface.thuchanh.Chicken) animal).howToEat());
                }
            }

            Abstract_Interface.thuchanh.Fruit[] fruits = new Abstract_Interface.thuchanh.Fruit[2];
            fruits[0] = new Abstract_Interface.thuchanh.Orange();
            fruits[1] = new Abstract_Interface.thuchanh.Apple(
            );

            for (Abstract_Interface.thuchanh.Fruit fruit : fruits) {
                System.out.println(fruit.howToEat());
            }
        }
    }

