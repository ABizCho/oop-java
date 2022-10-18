package lab.lab_7.q3.b;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println("waw waw waw");
    }
}
