package lab.lab_7.q3.b;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println("Miyaw Miyaw Miyaw");
    }
}
