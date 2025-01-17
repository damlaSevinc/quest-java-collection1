public class Hero {

    // attributes
    private String name;
    private int age;

    // constructors
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accessors (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutators (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}