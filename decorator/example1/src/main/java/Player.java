public class Player extends Character{
    public Player(String name){
        this.name = name;
        this.health = 10;
        this.defense = 10;
        this.attack = 10;
    };
    public int getHealth(){return this.health;};
    public int getDefense(){return this.defense;};
    public int getAttack(){return this.attack;};

    public boolean isHeadEquipped(){return this.headEquipped;}
    public boolean isBodyEquipped(){return this.bodyEquipped;}
    public boolean isHandEquipped(){return this.handEquipped;}
    public boolean isFeetEquipped(){return this.feetEquipped;}

    public void setHeadEquipped(boolean status){ this.headEquipped =status;}
    public void setBodyEquipped(boolean status){ this.bodyEquipped =status;}
    public void setHandEquipped(boolean status){ this.handEquipped =status;}
    public void setFeetEquipped(boolean status){ this.feetEquipped =status;}
}
