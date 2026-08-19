package generics;

public class Container <T> {
    private T field;
    // the constructor that takes a T value
    public Container(T field){
        this.field = field;
    }

    // The method that returns the T
    T getValue(){
        return field;
    }
    void getInstanceType(T field){
        System.out.println(field.getClass());
    }

    // The main method
    public static void main(String[] args) {
        Container<String> c1 = new Container<>("MUBAS");
        Container<Integer> c2 = new Container<>(21);
        Container<Boolean> c3 = new Container<>(true);

        //Printing the value using the gtValue method in the class
        System.out.println(c1.getValue());
        System.out.println(c2.getValue());
        System.out.println(c3.getValue());

        //Printing the value types
        c1.getInstanceType("Mubas");
        c2.getInstanceType(21);
        c3.getInstanceType(false);


    }

}
