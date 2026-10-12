package generics;

public class Generics<T> {
    private T variable;

    public Generics(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

    public void getInstance() {
        if (variable != null) {
            System.out.println(variable.getClass().getSimpleName());
        } else {
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Generics<Integer> object = new Generics<>(1);
        Generics<String> object2 = new Generics<>("Vitu");
        Generics<Double> object3 = new Generics<>(10.5);

        System.out.println(object.getVariable());
        System.out.println(object2.getVariable());
        System.out.println(object3.getVariable());

        object.getInstance();
        object2.getInstance();
        object3.getInstance();

        object.setVariable(100);
        object2.setVariable("MUBAS Generics");

        System.out.println(object.getVariable());
        System.out.println(object2.getVariable());
    }
}