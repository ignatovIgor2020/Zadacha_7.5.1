abstract class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void sayWhoIam() {
        System.out.println("my name " + name + ", age " + age + ", weight " + weight + ",");
    }

    public String GetName() {
        return name;
    }

}
