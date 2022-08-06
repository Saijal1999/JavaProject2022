package Problem2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

//Transformation Company is considered the parent class of Autobots and Deception and the properties defined
//are extended in the child class.

public class TheTransformationCompany {

    protected String Name;
    protected String FirstCharacter;
    protected int Strength;
    protected int intelligence;
    protected int speed;
    protected int Endurance;
    protected int Rank;
    protected int courage;
    protected int Firepower;
    protected int skill;

    public TheTransformationCompany(String Name, String FirstCharacter, int strength, int intelligence, int speed, int Endurance, int Rank, int courage, int Firepower, int skill) {
        this.Name = Name;
        this.FirstCharacter = FirstCharacter;
        this.intelligence = intelligence;
        this.Strength = strength;
        this.speed = speed;
        this.Endurance = Endurance;
        this.Rank = Rank;
        this.courage = courage;
        this.Firepower = Firepower;
        this.skill = skill;
    }


    public String getName() {
        return Name;
    }

    public String getFirstCharacter() {
        return FirstCharacter;
    }

    public int getStrength() {
        return Strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEndurance() {
        return Endurance;
    }

    public int getRank() {
        return Rank;
    }

    public int getCourage() {
        return courage;
    }

    public int getFirepower() {
        return Firepower;
    }

    public int getSkill() {
        return skill;
    }

    public int getOverallRating(){
        return this.Strength+this.intelligence+this.speed+this.Endurance+this.Firepower;
    }
}



