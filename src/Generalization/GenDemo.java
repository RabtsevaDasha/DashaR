package Generalization;

public class GenDemo<T, V, K> {
    private T ob1;
    private V ob2;
    private K ob3;

    public GenDemo(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void showTypes(){
        System.out.println("ob1: " + ob1.getClass().getName());
        System.out.println("ob2: " + ob2.getClass().getName());
        System.out.println("ob3: " + ob3.getClass().getName());
    }

    public static void main(String[] args) {
        GenDemo<Integer, Float, String> genDemo = new GenDemo<>(5, 7.5f, "like");
        genDemo.showTypes();
    }
}
