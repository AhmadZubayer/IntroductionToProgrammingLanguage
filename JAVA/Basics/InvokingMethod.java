class Person {
    String name;
    int age;
    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class InvokingMethod {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 30;
        person.introduce(); // Using Dot Operator
    }
}
