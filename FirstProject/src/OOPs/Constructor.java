package OOPs;

// Constructors are special methods use to initialize object attributes
// Has same name as name of class
// constructor has no return type
// it is automatically called when instance of class is created (Object)


// Default constructor
//     Used for setting default values
//     no need of explicit declaration
//     used for initializing instance variables
 class Default {
     int age;
     float fuel;
     Default() {
         System.out.println("Default Constructor");
         this.age = 0;
         this.fuel = 0;
     }
}

// used for making some parameters mandatory at time of object creation
// Allow user to initialize object at time of creation
class parameterized{
     int age;
     float fuel;
     parameterized(int age, float fuel) {
         this.age = age;
         this.fuel = fuel;
     }
}

// Chaining of constructor (polymorphism)
// multiple constructors with differ param , type

class Car2{
     String color;
     int wheel;
     String name;
     Car2(String color,int wheel,String name){
         this.wheel=wheel;
         this.color=color;
         this.name=name;
     }
     Car2(String color,int wheel){
         this.color=color;
         this.wheel=wheel;
           name="gadi";
//      OR   this(color,wheel,"gadi");
     }
     Car2(){
         this("black",4,"thar");
         //OR color="black"; wheel=4; name="thar";
     }
}