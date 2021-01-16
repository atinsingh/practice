// class is blueprint
public class Human {
    // declare and define variables
    int age; // instance variable
    String name = "default name";


    // we can write method
    // Constructor is not a method
//    //  to allocate and initialize memory for an object
//    public Human(int age, String name){
//        this.age = age;
//        this.name = name;
//    }

    public void speak() {
        System.out.println(this.name +" is speaking ");
    }

    public void eat() {

    }
}
