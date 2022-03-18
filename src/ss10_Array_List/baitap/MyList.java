package ss10_Array_List.baitap;

import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    public static final int DEFAUL_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAUL_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity :" + capacity);
        }

    }

    public int size(){
        return this.size;
    }
    public void clear(){
        size = 0;
        for(int i = 0;i<elements.length;i++){
            elements[i] = null;
        }
    }

    public boolean add(E element){
        if(elements.length == size){
            this.ensureCapacity(5);
        }
            elements[size]= element;
        size++;
        return true;
    }

    public boolean add(E element,int index){
        if(index > elements.length){
            throw new IllegalArgumentException("index" + index);
        }else if(elements.length == size){
            this.ensureCapacity(5);
        }
        if(elements[index]==null){
            elements[index] = element;
            size++;
        }else {
            for(int i = size+1;i>=index;i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapacity(int mincapacity){
        if(mincapacity >= 0){
            int newSize = elements.length + mincapacity;
            elements = Arrays.copyOf(elements,newSize);
        }else {
            throw new IllegalArgumentException("mincapacity" + mincapacity);
        }
    }

}
