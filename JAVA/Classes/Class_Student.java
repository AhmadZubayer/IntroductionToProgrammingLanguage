class Class_Student {
    // Instance variables
    String name; // Represents the student's name
    int age;     // Represents the student's age
    static int weight; // Shared weight for all students

    // Constructor (called when creating an object)
    public Class_Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

    // Local variable (inside a method)
    public void updateAge(int newAge) {
        int previousAge = age; // Local variable
        age = newAge;
        System.out.println(name + "'s age updated from " + previousAge + " to " + age);
    }

    public static void main(String[] args) {
        // Create two student objects
        Class_Student student1 = new Class_Student("Alice", 20);
        Class_Student student2 = new Class_Student("Bob", 22);

        // Set weight (shared across all students)
        weight = 150;

        // Display information for both students
        System.out.println("Class_Student 1:");
        student1.displayInfo();

        System.out.println("\nClass_Student 2:");
        student2.displayInfo();

        // Update Alice's age
        student1.updateAge(21);
    }
}
