public class OOP2nd {
    public static void main(String[] args) {

        // All concepts referred from:- https://youtu.be/BSVKUk58K6U?si=i_ghXlu4-HEaJfD7

        // Constructors
        StudentClass student1 = new StudentClass(14, "Generic Name", 78.4f);
        // To give values to an object, the most introductory way is to set them one by one.
        // For example,
        // student1.rollno = 14;
        // student1.name = "Generic Name";
        // student1.marks = 78.4;

        // This is one of the ways to set values to an object. But suppose that the object has
        // hundreds of properties, then you have to set all of their values one by one in seperate
        // statements. But there is a way to just pass the values to a method and the method will
        // automatically set the values to corresponding properties. This method is called a contructor.
        // In the uncommented line of code above, we are declaring and initializing a student1 object of the
        // StudentClass class. In the initialization part, next to the new keyword, we have the constructor function
        // for the StudentClass class, the StudentClass() method. Even if we apparently have not created any function in
        // the class definition, the StudentClass() method is created by default. Hence, it is called a default constructor.
        // The constructor is a special function, which is created along with the object, and it is used to allocate
        // values to the properties (instance variables) of an object. If you have not written any code in the class definition
        // to allocate values to properties in the created objects (i.e constructor function), then the default constructor will
        // be created, that sets the default value to each property, depending on its datatype.

        // To understand how the arguments passed to the StudentClass() method above are being allocated as values to the new objects,
        // read the explanation of the "this" keyword in the constructor function in the class definition below.
        StudentClass student2 = new StudentClass(17, "New Name", 77.9f);
        System.out.println(student1.rollno + " " + student1.name + " " + student1.marks);
        System.out.println(student2.rollno + " " + student2.name + " " + student2.marks);
        // Here, we have defined the student2 object using the constructor function, and then we have printed the values of the properties
        // of student1 and student2 in a simple systematic manner. Go ahead and run the code to view the values in the console.
        StudentClass student5 = new StudentClass(55);
        System.out.println(student5.rollno + " " + student5.name + " " + student5.marks);
        final int fin = 5;
    }


}

   class StudentClass {
       int rollno;
       String name;
       float marks;
       // If you look closely at the constructor function definition below,
       // you would find that the class has no name, it just has a return datatype
       // which is StudentClass.
       // For example, while defining a function in Java, we type something like
       // static int swap(){}
       // Where "static" is the access modifier, "int" is the return datatype and "swap" is the name.
       // But in the case of the constructor function, the StudentClass is supposed to be the return type.
       // Then where is the name for the function? Actually, constructors do not need a name. You can just
       // pass the name of your class/datatype and that will be the name as well as the return type of your
       // constructor function.
       StudentClass(int rollnumber, String name, float marks) {
           // This is a constructor function of the StudentClass class/datatype.
           this.rollno = rollnumber;
           this.name = name;
           this.marks = marks;
           // When we create the student1 object in the main method above, then the name of that object (variable)
           // is student1. Now in here, we have the "this" keyword. When we create an object named student1 and call
           // the constructor function of that object while initializing that object (in the main method in our case),
           // then the "this" keyword gets replace by the name of the object (variable) that we are calling the constructor
           // function for. So in the case of student1, in here, this.rollno will evaluate to student1.rollno, and the value
           // of student1.rollno will be set to the value of the variable rollnumber. The variable rollnumber is a parameter
           // of the StudentClass() constructor function, and its value will be set to the value of the first argument to the
           // constructor function in any constructor function call. For example, in StudentClass(14, "Generic Name", 78.4f);
           // the value of rollnumber will be 14, and that value will be set to this.rollno, which evaluates to student1.rollno.
           // Note:- conventionally, this.rollno = rollnumber will be this.rollno = rollno, (along with the parameter name of course),
           // But here, the rollno parameter is named rollnumber to understand the concepts clearly. For example, this.name = name and
           // this.marks = marks. Hence, the name of the parameter variables of the constructor function and the name of the instance
           // variables can be different. If you want more clarification, just think about it for some time.

           // So eventually, the value of the rollno property of the student1 object will be set to 14. Now why are we going through
           // the trouble of making a constructor function? Because imagine if we create a student2 object, and its we call its
           // constructor function like StudentClass(17, "New Name", 77.9f); then the values of the rollno, name, and marks properties
           // of the student2 function will be automatically set to 17, "New Name", and 77.9f respectively because of the "this" keyword
           // in the constructor.
           // Hence, for student2, this.rollno, this.name, and this.marks will evaluate to student2.rollno, student2.name and
           // student2.marks respectively and the values will be asssigned to those properties according the arguments and parameters of the
           // constructor function. Which eventually means that we are setting the rollno property of only the student2 object to be 17, the name
           // property of only the student2 object to be "New Name", and the marks property of only the student2 object to be 77.9f.
           // If we had a student3 object, whose constructor looked like StudentClass(20, "Another Name", 89.9f); then we will be
           // setting the rollno property of only the student3 object to be 20, the name property of only the student3 object to be "Another Name"
           // and the marks property of only the student3 object to be 89.9f. Each values of the properties of each unique object can be different.

           // Hence, we can call the constructor function for an unlimited amount of unique objects.

           // Note: "this" keyword refers to the variable name of the object that invoked the constructor function.

       }

       // Constructor Overloading
       // It is the concept of having different constructors of the same name with different type or number of parameters in the same class.
       // For example;
       StudentClass() {
           this.rollno = 81;
           this.name = "Default Name";
           this.marks = 86.4f;
       }
       // This constructor has no parameters, hence we cannot pass any arguments to it.
       // If we make an object using this constructor:-
       // StudentClass student4 = new Student();
       // then student4.rollno will be 81, student4.name will be "Default Name" and student4.marks will be 86.4f.

       StudentClass(int rollno){
           this.marks = 90.6f;
           this.rollno = rollno;
           this.name = "The Name";
           // The order in which we write the value assignment code (the 3 lines above) doesn't matter.
           // Just make sure that the properties are the same amount and type as defined.

       }
       // In this constructor, we only expect one argument and the other properties are set by the default values in the
       // constructor itself.

       // In any type of constructor that we make, the properties that we are setting should be the exact same properties
       // that are defined in the class definition as instance variables. We cannot add or leave out any properties.

       // Also, we need to give this exact amount and type of arguments that the constructor expects.
       // For example, note that we have not created a constructor that takes two values So if
       // we try to create an object by passing any two arguments to its constructors, it will result
       // in an error because there is no constructor that takes two arguments. Also, follow the order
       // that the parameters are listed in to give arguments.
       // For example, if we create a constructor like this:
       // StudentClass(String name, int rollno){
       //    this.rollno = rollno;
       //    this.name = name;
       //    this.marks = 95.4f;
       // }
       // And we pass the arguments to the constructor like this, StudentClass(53, "Good Name");
       // then it will result in an error because the datatypes of arguments and parameters do not match.
       // Even if there is not datatype conflict, an incorrect order of arguments can result in incorrect
       // assignments of properties to values. For example, if we create a constructor for a class named Name
       // (which we have not created) and let's say the constructor of that class looks like this.
       // Name(String firstName, String lastName){
       // this.firstName = firstName;
       // this.lastName = lastName;
       // }
       // And we pass arguments to the constructor like this:
       // Name name = new Name( "Lastname", "Firstname");
       // Then even if the constructor will not throw any error and the datatype of the arguments and parameters match,
       // even then the values of the properties will be mis-matched. Which means that the value of name.firstName will
       // be "Lastname" and the value of name.lastName will be "Firstname" which is clearly wrong. Hence, the order of
       // the arguments that we have passed to the constructor matters a lot.

       // Note: don't create totally identical constructors. Which means that don't create constructors whose name is same,
       // and their parameters and their order is same as well.

       // Let's say that you want to assign the properties of a new object based on the properties of an existing object.
       // We can do that by passing the existing object as an argument to the constructor.
       // For example, if we create an object like this:-
       // Student max = new Student(30, "Max", 90.9f);
       // Then max.rollno is 30, max.name is "Max" and max.marks is 90.9f.
       // If we want to inherit the properties of the max object for new objects, we can create a constructor like this:
       // StudentClass ( StudentClass existing ) {
       // this.rollno = existing.rollno;
       // this.name = existing.name;
       // this.marks = existing.marks;
       // }
       // And we make a new object by passing the max object to its constructor like:
       // StudentClass newobj = new StudentClas(max);
       // Then in the new constructor, the StudentClass existing parameter will be replaced
       // with the StudentClass max object, and existing.rollno will be max.rollno, existing.name
       // will be max.name and existing.marks will be max.marks. And the "this" keyword will be replaced
       // by the newobj variable. So, inside the constructor, everything will be evaluated as
       // StudentClass ( StudentClass max ) {
       // newobj.rollno = max.rollno;
       // newobj.name = max.name;
       // newobj.marks = max.marks;
       // }
       // Hence, finally newobj.rollno will be 30, newobj.name will be "Max" and newobj.marks will be 90.9f.
       // Hence, newobj inherited its properties from max.

       // We can also call a constructor from inside a constructor.
       // For example, if we create a constructor with no parameters and call the constructor
       // with three parameters from it (the one defined above)
       // StudentClass(){
       // this (13, "Def Name", 97.9f);
       // }
       // In this case, this will be replaced with the classname StudentClass, because StudentClass()
       // with three parameters exist but objectName() with three parameters doesn't. (It maybe figures out on its own).
       // It does so because while trying to access a property of an object like this.name or this.rollno, the "this" keyword
       // is replaced by the object name because you are calling it via a reference variable.
       // But while creating an object like this(9, "Name", 80.5f), "this" refers to the classname StudentClass.
       // Calling constructors from constructors can get a little complex. Look into it as needed.

       // ********Hence, to wrap it up, the "this" keyword refers to the name of whatever object or method called it.********

    }

    // Important doubt: Why don't we use the "new" keyword to initialize primitives?
    // The "new" keyword is not used to declare and initialize primitives in Java because in Java, primitives are not stored as objects.
    // We know that objects are stored in the heap memory. But in Java, primitives are stored in the stack memory to increase the speed and
    // efficiency of code execution. Hence, primitives are not interpreted as objects. Research to find out more about this topic.
    // There is a way to create primitives as objects, by using wrapper classes.
    // As an example, the syntax for creating an int as an object using the Integer wrapper class is:
    // Integer num = new Integer(7); or Integer num = 7;
    // Note that the first way to use wrapper class shown above is about to be deprecated.
    // In both cases, the integer 7 is created as an object.
    // Suppose we create two things:
    // int a = 10;
    // Integer num = 45;
    // Here, "a" will be a primitive and "num" will be an object.
    // An advantage of initializing primitives as objects is that you can get to use all of the methods defined inside the
    // Integer wrapper class. You don't have as many methods to use if you declare a primitive using just "int" (as a primitive).
    // To find out more about the pass by value and pass by reference issues related to wrapper classes and primitives, watch the video
    // linked at the top of the code, and more importantly, watch this video which starts at a specific timestamp:
    // https://youtu.be/vvanI8NRlSI?si=oy_OvVszoOXQinfZ&t=1504

    // Important note:- When we create an object, then declare another variable and equate it to the first object, like:
    // StudentClass s1 = new StudentClass();
    // StudentClass s2 = s1;
    // Then both the s1 and s2 variables will be in the stack memory, and both of them will point at only one and the same object in the heap memory.
    // Suppose we make some changes to the object via variable s1, then those changes will also be visible for variable s2.
    // So in this case, we are not creating a new object or a copy of the first object for variable s2, we are just making s2 point towards the same
    // object that s1 is pointing towards.

    // The 'final' keyword:-
    // The 'final' keyword is used to declare constant values for variables. It is basically like the "const" variable type in JavaScript.
    // For example, if we declare a variable called "fin" like:
    // final int fin = 5;
    // then the value of fin will remain 5, until directly changed in the code.
    // So you cannot just type:
    // fin = 2; or fin = fin + 4;
    // and expect the value of fin to change. It won't change and it will throw an error.

    // Also note that the final keyword is mostly used to declare variables with primitive datatypes, not for the reference
    // values passed by objects (all objects pass a reference to themselves to the variable, hence it is called a reference variable).
    // This is so, because objects always pass their reference to variables. The reference passed by the object to the variable
    // can remain unchanged but there is no guarantee that the object itself will remain unchanged. Hence, using the final keyword for reference
    // variables for objects kind of defeats the purpose of the final keyword itself. We can declare objects with the final keyword like
    // final StudentClass s3 = new Student(14, "Naam", 97.9f);
    // but in this case, doing something like s3.rollno = 7; will actually work. Because the final keyword only keeps the reference of the
    // object unchanged, because the reference is the thing that is actually stored inside the variable. The values of the properties of the
    // object can change because the final keyword does not make the object itself immutable. But the final keyword is supposed to keep the value
    // of a variable unchanged, which it is doing in this case, but it is doing it for the reference value, not the actual object. Hence, using the
    // final keyword is counter-intuitive in case the case of objects and their reference variables.
    // But because the final keyword guarantees that the reference to the object cannot change, you also cannot assign a different object to the variable.
    // Which means that you cannot do something like:
    // s3 = new Student(8, "Different Naam", 78.2f);
    // or even s3 = s1, where s1 is another object.
    // This will throw an error. Hence, the final keyword is useful for object reference variables in this case.

    // Also, you cannot just declare a final variable, you always have to initialize it with some value.

    // Finalize method for garbage collection:
    // Garbage collection is the process of deleting unused objects from the memory to make space for more useful operations.
    // Unlike C++, in Java, the garbage collection process is initiated automatically. The user has no control over when the
    // garbage collection process will start. But the user can have some control over what happens when the garbage collection starts.
    // This is where the finalize method comes in. Java calls the garbage collector and the finalize method right before the object occupied
    // space is to be freed. The finalize method can be written for each class, and it is called whenever an object of that particular class
    // is supposed to be freed.
    // Note that the finalize method was deprecated in Java 18. But if you want to know about it, watch this:-
    // https://youtu.be/BSVKUk58K6U?si=SvRUMHFlTJT1fpf-&t=5810
