package ua.kiev.prog.shared;

public class Client {
    @Id
    private int id;

    private String name;
    private int age;
    private boolean isSingle;
    private double weight;

    //private long date;

    public Client() {
    }

    public Client(String name, int age, boolean isSingle, double weight) {
        this.name = name;
        this.age = age;
        this.isSingle = isSingle;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isSingle=" + isSingle +
                ", weight=" + weight +
                '}';
    }
}
