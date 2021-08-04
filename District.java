/*ask 1.

        Copy the Hero class in the new project. Delete the variable workingDistrict and related code parts.

        Create a new class District as shown in the diagram:

class: District
        attributes

        - title: String

        - city: String

        - districtID: int

        - heroesInTheDistrict: hero[]

 */

import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtID;
    ArrayList<Hero> heroesInTheDistrict = new ArrayList<Hero>();// dynamic array , check it!!!!!!!!!!!

    public District() {
    }


    public District(String title, String city, int districtID, ArrayList<Hero> heroesInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.heroesInTheDistrict = heroesInTheDistrict;
    }
public boolean addNewHero(Hero hero){
        heroesInTheDistrict.add(hero);//add - an option in the array
        return heroesInTheDistrict.add(hero); //returns true if add succseeded
}
public Hero removeHero(int index){
        return heroesInTheDistrict.remove(index);//returns hero



}



//TO STRING
    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }

    //GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Hero> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<Hero> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;
    }
}
