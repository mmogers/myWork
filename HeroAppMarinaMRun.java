public class HeroAppMarinaMRun {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero("Birdy", "Black", "FastWing", 123321, "Hero", (short)43);
        Hero h3 = new Hero("Waterman", "Cooper", "BabyShark", 111111, "Villian", (short)12);
        System.out.println("The name of h1 is : " + h1.getName());
        System.out.println("The nickname of h2 is: " + h2.getNickname());
        System.out.println("The number of hours of h3 id: " + h3.getDeedTime());
        System.out.println("Hero h1: " + h1.toString ());
        System.out.println("The level of h2 is: " + h2.calculatedLevel());
    }
}
