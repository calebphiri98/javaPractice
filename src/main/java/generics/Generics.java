package generics;

// the T in this case could be any data type
public class Generics <T>{
    private T variable;

    public Generics(T variable) {
        this.variable = variable;
    }

    public void getInstance(){
        System.out.println();
    }


    public static void main(String[] args) {
        Generics<Integer> object = new Generics<>(1);
        Generics<String> object2 =new Generics<>("Vitu");


    }
}
