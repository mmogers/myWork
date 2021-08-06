//Hero, HeroType, District, HeroApp17, HeroAppMarinaMRun
public class HeroAppMarinaMRun {
    public static void main(String[] args) {

        //initializing 3 heroes
        Hero hero1 = new Hero("Artjoms", "Petrovs", "Aliexpressman", 12345678, HeroType.Hero, 100);
        Hero hero2 = new Hero("fh", "Black", "FastWing", 123321, HeroType.Hero, 30);
        //Hero hero3 = new Hero("Waterman", "Cooper", "BabyShark", 111111, HeroType.Villian, (short)30);
        Hero hero3 = new Hero();
        hero3.setHeroID(111111);
        hero3.setName("Waterman");
        hero3.setSurname("Cooper");
        hero3.setNickname("BabyShark");
        hero3.setHeroType(HeroType.Villian);
        hero3.setDeedTime(30);


        //System.out.println(" The name of h1 is : " + hero1.getName());
        //System.out.println(" The nickname of h2 is: " + hero2.getNickname());
        //System.out.println(" The number of hours of h3 id: " + hero3.getDeedTime());
        //System.out.println(" Hero h1: " + hero1.toString ());
        //System.out.println(" The level of h2 is: " + hero2.calculatedLevel());

        //MAKING array metropole of 3 heroes
        Hero[] metropole = new Hero[3];
        metropole[0] = hero1;
        metropole[1] = hero2;
        metropole[2] = hero3;

        //how many heroes with level 1:
        int counter = 0;
        for (Hero hero : metropole) {
            if (hero.calculatedLevel() == 1) {
                counter++;
            }
        }
        System.out.println("The number of level 1 heroes is: " + counter);

        //more than 1 level heroes
        counter = 0;
        for (Hero hero : metropole) {
            if (hero.calculatedLevel() > 1) {
                counter++;
            }
        }
        System.out.println("The number of level more than 1 heroes is: " + counter);
        //if there is name John
        counter = 0;
        //for (int i = 0; i < 3; i++) {
        //    if(metropole[i].getName() == "John"){
        //        counter = 1;
        //    }
        //}
        boolean isJohn = false;
        for (Hero hero : metropole) {
            if (hero.getName() == "John") {
                isJohn = true;
                break;
            }
        }
        if (isJohn) {
            System.out.println("There is a hero with John name");
        } else {
            System.out.println("There is no hero with the name John");
        }
        //district1
        District district1 = new District();
        district1.getHeroesInTheDistrict().add(hero1);
        district1.getHeroesInTheDistrict().add(hero2);
        district1.getHeroesInTheDistrict().add(hero3);
        System.out.println(district1.toString());
        district1.getHeroesInTheDistrict().remove(0);
        System.out.println(district1.toString());

        //int avg = district1.calculateAvgLevelInDistrict();
        System.out.println("the average number of district 1 is: " + district1.calculateAvgLevelInDistrict());


    }
}
