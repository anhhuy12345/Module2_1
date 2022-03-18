package ss11_Stack_Queue.thuchanh;

import static ss11_Stack_Queue.thuchanh.MyGenericStack.stackOfIntegers;
import static ss11_Stack_Queue.thuchanh.MyGenericStack.stackOfString;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1: Stack Of Integers");
        stackOfIntegers();
        System.out.println("2: Stack Of Strings");
        stackOfString();
    }
}
