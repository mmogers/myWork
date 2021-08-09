//lesson18, animal, CAt, Bird
public class Animal {
    private String name;
    private int food;
    public int foodLimit;

    public void sleep() {
        System.out.println("ZZZZZZZZZ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food > foodLimit)
            System.out.println("I cannot eat so much");
        this.food = food;
    }

}

