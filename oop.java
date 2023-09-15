import java.util.*;

public class OOP {
    public static void main(String[] args) {

        // Declaring an object (without initialization)
        Student student1;
        // "Student" is the class name, of which we want to create an
        // object, and "student1" is the reference variable for it.
        // At this stage, the student1 object is just declared and the
        // "student1" variable is just sitting in the stack memory,
        // pointing to "null". Once we initialize the student1 object,
        // it will actually point to something.
        // It is important to note that primitives that have not been
        // initialized don't necessarily point to null. For example,
        // a non-initialized int points to 0, non-initialized float
        // points to 0.0 and so on. An easy way to find out is to just
        // declare an array of the datatype that you want to know about
        // and then initialize it to an array object using the new keyword,
        // and just print it.
        // For example,
        // float[] man = new float[5];
        // System.out.println(Arrays.toString(man));
        // will make a float array object, and the elements of that object are
        // the things that non-initialized reference variables for that particular
        // objects/datatype will point towards. This will work for most primitive
        // and non-primitive data types (even user defined classes).


        // Initializing objects and dynamic memory allocation using the "new" keyword.
        student1 = new Student();
        // Here, we are actually creating an object of our user-defined class.
        // The "new" keyword is used to make an object out of a class. It allocates
        // memory to an object at runtime, and returns a reference to it. This is called
        // dynamic memory allocation. The reference to that object, returned by the new
        // keyword, is stored in the student1 reference variable.
        // (to view the reference to an object, just print any array without applying the
        // Arrays.toString method. There are other ways to view the reference addresses as well)
        // So basically when the student1 object was initialized, the student1 variable in the
        // stack memory is pointed towards an object in the heap memory which has all of the
        // properties of the Student class. But currently, this object has no values.

        // The creation of an object from its class is known as instantiation of the class.

        // Note: suppose you declare a student object like this,
        // Student student1 = new Student();
        // In this case, everything to the left of the equals sign happens at compile time,
        // and everything to the right of the equals sign happens at runtime.
        // (So basically, declaration happens at compile time and initialization/memory allocation
        // happens at runtime)
        // This is called dynamic memory allocation.

        System.out.println(student1.name);
    }
}

class Student {
    int rollno;
    String name;
    float marks;
    // When we create an object out of this class, the
    // values of that object will automatically be assigned
    // the variable names that are defined above. So if we make
    // an object called "student1" and give it a roll number
    // of 14, then if we try to access student1.rollno, it will
    // directly evaluate to 14, without us needing to explicitly
    // define rollno to be 14.

    // If we try to print the values of an object, which has not been
    // assigned any values, then it will just point to whatever value
    // that variable is supposed to point towards if it isn't initialized,
    // based on its datatype declared in the class definition.
    // For example, if we consider the student1 object which has not
    // been assigned any values yet, then student1.rollno will be 0,
    // student1.name will be null and student1.marks will be 0.0, because the
    // rollno, name and marks variables are declared as int, String and float
    // in the Student class definition, and non-initialized int, String and float variables
    // point towards 0, null and 0.0 respectively.
    // By the way, String is not a primitive datatype. It is a class. A way to distinguish
    // between primitive and non-primitive datatypes is just looking at their name. If the
    // first letter of that datatype is typed as a  capital letter (while defining an object
    // of that datatype or something), then it is a non-primitive datatype, which means that
    // it is a class. To view the code of the class in IntelliJ, just Ctrl+Right click on the
    // name of that class.
}
