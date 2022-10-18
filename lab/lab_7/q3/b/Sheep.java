package lab.lab_7.q3.b;

public class Sheep implements Animal{
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println("Ba Ba Ba");
    }
}
