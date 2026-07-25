package OOPs;

 class Driver {
     static int minAge=18;// variable of class
     int age;
     String name;
     public  boolean isAllowed(){
         return this.age>=minAge;
     }

     static void main() {
         Driver driver = new Driver();
         driver.age=18;
         driver.name="John";
         System.out.println(driver.isAllowed());
         System.out.println(minAge);
         System.out.println(Driver.minAge);// can be accessed using class name
     }
}
