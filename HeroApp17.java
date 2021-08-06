import java.util.ArrayList;

public class HeroApp17 {
    public static void main(String[] args) {
        //7 heroes
        Hero heroOne = new Hero ("Joe", "Black", "Tall", 111, HeroType.Villian, 10);
        Hero heroTwo = new Hero ("John", "Leibovsky", "Fat", 222, HeroType.Hero, 10);
        Hero heroThree = new Hero ("Bob", "Kaplan", "Nice", 333, HeroType.Hero, 100);
        Hero heroFour = new Hero ("Dany", "Cooper", "Angry", 444, HeroType.Villian, 30);
        Hero heroFive = new Hero ("Ben", "Button", "Smiley", 555, HeroType.Hero, 30);
        Hero heroSix = new Hero ("Peter", "Parker", "Clever", 666, HeroType.Hero, 30);
        Hero heroSeven = new Hero ("Harry", "Potter", "GoodBoy", 777, HeroType.Villian, 30);
        //2districts
        District districtOne = new District();
        districtOne.setTitle("Southern district");
        districtOne.setCity("Riga");
        districtOne.setDistrictID(121212);

        District districtTwo = new District();
        districtTwo.setTitle("Northern district");
        districtTwo.setCity("Riga");
        districtTwo.setDistrictID(343434);
        //add 3 heroes to the 1 district and the rest to the 2 district
        districtOne.heroesInTheDistrict.add(heroOne);
        districtOne.heroesInTheDistrict.add(heroTwo);
        districtOne.heroesInTheDistrict.add(heroThree);

        districtTwo.heroesInTheDistrict.add(heroFour);
        districtTwo.heroesInTheDistrict.add(heroFive);
        districtTwo.heroesInTheDistrict.add(heroSix);
        districtTwo.heroesInTheDistrict.add(heroSeven);

        //printout
        System.out.println(districtOne.toString());
        System.out.println(districtTwo.toString());

        //remove one hero from the second district
        districtTwo.removeHero(2);
        //System.out.println(districtTwo.toString());

        //calculate average level for each district
        districtOne.calculateAvgLevelInDistrict();
        System.out.println("the average level for the district 1 is: " + districtOne.calculateAvgLevelInDistrict());
        districtTwo.calculateAvgLevelInDistrict();
        System.out.println("the average level for the district 2 is: " + districtTwo.calculateAvgLevelInDistrict());

//count the number of heroes in total in all districts
        ArrayList<District> districtsInTheList = new ArrayList<District>();

        //add districts to array
        districtsInTheList.add(districtOne);
        districtsInTheList.add(districtTwo);
        //count how many districts are in the district array
        int totalHeroes = 0;
        for(District district: districtsInTheList){
            totalHeroes += district.NumberOfHeroesInTheDistrict();
        }
        System.out.println("There are: " + totalHeroes + " heroes in total in all districts");

        //calculate the avg level in both districts
        float avg =0; //will calculate the sum of averages
        for (District district: districtsInTheList){
            avg += district.calculateAvgLevelInDistrict() * district.NumberOfHeroesInTheDistrict();//avg*amount
        }
        float totalAvg = avg / totalHeroes;
        System.out.println(totalAvg + " : An average for all the heroes in all the districts");

//find out which district is the best
        float theBest=0;
        String theName="";
        for (District district: districtsInTheList){
            if (district.calculateAvgLevelInDistrict() > theBest){
                theBest = district.calculateAvgLevelInDistrict();
                theName = district.getTitle();
            }
        }
        System.out.println(theName + " is the best district to live in");

        //delete the first district
        //????????????

    }
}
