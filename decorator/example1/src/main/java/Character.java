public abstract class Character {
    String name ="dummy";

    int health;
    int defense;
    int attack;

    public String getDescription(){ return this.name + " equipped nothing";};
    public abstract  int getHealth();
    public abstract  int getDefense();
    public abstract  int getAttack();

}
