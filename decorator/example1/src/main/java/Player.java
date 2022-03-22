public class Player extends Character{
    public Player(String name){
        this.name = name;
        this.health = 10;
        this.defense = 10;
        this.attack = 10;
    };
    public   int getHealth(){return this.health;};
    public   int getDefense(){return this.defense;};
    public   int getAttack(){return this.attack;};
}
