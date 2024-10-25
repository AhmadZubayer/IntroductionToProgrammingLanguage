import java.util.Scanner;

/**
 * ARRAY OF OBJECTS
 * Normal main method without user input and with a predefined student limit:
 *      studentArr[0] = new Students("23000", "Ahmad Zubayer", "AIUB", "CSE");
        studentArr[0].setCgpa(3.9);
        
        studentArr[1] = new Students("23001", "Farhan Sadique", "MIST", "AE");
        studentArr[1].setCgpa(3.9);
 */

class Students {
    String ID;
    String name;
    String university;
    String department;
    double cgpa;
    
    Students() {}
    
    Students(String ID, String name, String university, String department) {
        this.ID = ID;
        this.name = name;
        this.university = university;
        this.department = department;
    }
    
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
    public double getCgpa() {
        return this.cgpa;
    }
    
    public void display(int studentNumber) {
        System.out.println(
                "Information of Student " + studentNumber + ": \n" + 
                "Name: " + name + "\n" + 
                "ID: " + ID + "\n" + 
                "University: " + university + "\n" +
                "Department: " + department + "\n" +
                "CGPA: " + cgpa);
    }
}


public class ArrayOfObjects {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Students do you want to create records for?");
        
        int numberOfStudents = scan.nextInt();
        scan.nextLine(); // consume newline
        
        Students[] studentArr = new Students[numberOfStudents];
        
        int initialID = 23000;
        
        for(int i=0; i<studentArr.length; i++) {
            System.out.printf("Enter Data for Student %d: \n", i + 1);
            
            System.out.print("Enter Name: ");
            String name = scan.nextLine();
            
            System.out.print("Enter University: ");
            String university = scan.nextLine();
            
            System.out.print("Enter Department: ");
            String department = scan.nextLine();
            
            System.out.print("Enter CGPA: ");
            double cgpa = scan.nextDouble();
            scan.nextLine(); // consume newline
            
            String ID = Integer.toString(initialID + i); 
            
            Students student = new Students(ID, name, university, department);
            student.setCgpa(cgpa);
            
            studentArr[i] = student;
        }
        
        System.out.println("\nStudent Records:");
        for(int i = 0; i < studentArr.length; i++) {
            studentArr[i].display(i + 1);
            System.out.println();
        }
        
        scan.close();
    }
}
