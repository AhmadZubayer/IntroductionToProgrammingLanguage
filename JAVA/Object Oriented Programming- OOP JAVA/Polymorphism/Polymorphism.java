// STATIC POLYMORPHISM: Achieved by Method Overloading
// DYNAMIC POLYMORPHISM: Achieved by Method Overridng
//**************************************
class ProgrammingLanguage {

    public void code() {
        
    }
}

//**************************************
class C extends ProgrammingLanguage {

    @Override
    public void code() {
        System.out.println("Coding in C");
    }
}

//**************************************
class CPlusPlus extends ProgrammingLanguage {

    @Override
    public void code() {
        System.out.println("Coding in C++");
    }
}

//**************************************
class Python extends ProgrammingLanguage {

    @Override
    public void code() {
        System.out.println("Coding in Python");
    }
}

//**************************************
class Java extends ProgrammingLanguage {

    @Override
    public void code() {
        System.out.println("Coding in Java");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        
        // polymorphism = 	greek word for poly-"many", morph-"form"
        //					The ability of an object to identify as more than one type
        
        C c = new C();
        CPlusPlus cpp = new CPlusPlus();
        Python python = new Python();
        Java java = new Java();
        
        ProgrammingLanguage[] languages = {c, cpp, python, java};
        
        for (ProgrammingLanguage x : languages) {
            x.code();
        }
        
    }
}
