package generics;

public class Container<T> {
    private T field;

    public Container(T field) {
        this.field = field;
    }

    public T getValue() {
        return field;
    }

    public void getInstanceType() {
        if (field != null) {
            System.out.println(field.getClass().getSimpleName());
        } else {
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Container<String> c1 = new Container<>("MUBAS");
        Container<Integer> c2 = new Container<>(21);
        Container<Boolean> c3 = new Container<>(true);
        Container<Double> c4 = new Container<>(3.14);

        System.out.println(c1.getValue());
        System.out.println(c2.getValue());
        System.out.println(c3.getValue());
        System.out.println(c4.getValue());

        c1.getInstanceType();
        c2.getInstanceType();
        c3.getInstanceType();
        c4.getInstanceType();
    }
}