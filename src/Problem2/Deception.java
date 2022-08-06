package Problem2;

public class Deception extends TheTransformationCompany{

    public Deception(String Name, String FirstCharacter, int strength, int intelligence, int speed, int Endurance, int Rank, int courage, int Firepower, int skill) {
        super(Name, FirstCharacter, strength, intelligence, speed, Endurance, Rank, courage, Firepower, skill);
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


    @Override
    public String toString() {
        return "["+this.Name+","+ this.FirstCharacter+","+ this.Strength+","+this.intelligence+","+this.speed+","+this.Endurance+","+this.Rank+","+this.courage+","+this.Firepower+","+this.skill+"]";
    }



}

