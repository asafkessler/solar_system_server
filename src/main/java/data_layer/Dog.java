package data_layer;

public class Dog extends Object{

    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(String name) {
        this.age = 0;
        this.name = name;
    }

    @Override
    public boolean equals(Object dog) {
        Dog handler = (Dog) dog;
        if (handler.getAge() == this.getAge() &&
                handler.getName() == this.getName()) {
            return true;
        } else {
            return false;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
