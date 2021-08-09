//lesson18, animal, CAt, Bird
//protected- only readable by children
//private - cannot be changed from outside, only inside the class
// super() calls a constructor of the parent
// we can override the body of the parent class
//object is a parent of all parents it has its methods
public class Lesson18 {
    public static void main(String[] args) {
        System.out.println("Lesson 18");
        Animal myAnimal = new Animal();
        myAnimal.sleep();

        Cat myCat = new Cat();
        myCat.setName("Muris");
        myCat.sleep();

        Bird myBird = new Bird();


        String flyAwayMessage = myBird.flyAway();
        System.out.println(flyAwayMessage);
        System.out.println(myBird.flyAway()); // the same
        myBird.sleep();
        myBird.foodLimit = 100;
        myBird.setFood(150);

    }
}
