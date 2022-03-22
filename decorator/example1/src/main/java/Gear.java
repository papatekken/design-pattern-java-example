public abstract class Gear extends Character {
    Character character;
    String name = "";
    int health = 0;
    int defense =0;
    int attack =0;

    public String getDescription(){
        String output = character.getDescription();
        int subIndex = output.lastIndexOf("nothing");
        if(subIndex>=0)
            return output.substring(0,subIndex) + name;
        else
            return output +", " + name;


    };
    public int getHealth(){return character.health +this.health;};
    public int getDefense(){return character.defense +this.defense;};
    public int getAttack(){return character.attack + this.attack;};
}
