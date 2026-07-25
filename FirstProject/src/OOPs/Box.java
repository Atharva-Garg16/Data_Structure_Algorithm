package OOPs;

public class Box {
    int width;
    int length;
    int depth;
    public int volume() {
         int vol=this.length*this.depth*this.width;
         return vol;
    }

}
class Test{
    public static void main(String[] args) {
        Box box = new Box();// object created in heap memory
        // calling constructor of class Box() ,Array is also object
        box.width = 100;// property
        box.length = 100;
        box.depth = 100;
        System.out.println(box.volume());// method
        // general practise keep data members (property) as private and methods as public
        // . operator used for access properties and method
    }
}
