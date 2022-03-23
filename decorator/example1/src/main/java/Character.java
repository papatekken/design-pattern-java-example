public abstract class Character {
    String name ="dummy";

    boolean headEquipped = false;
    boolean bodyEquipped = false;
    boolean handEquipped = false;
    boolean feetEquipped = false;
    int health;
    int defense;
    int attack;

    public String getDescription(){ return this.name + " equipped nothing";};

    public abstract boolean isHeadEquipped();
    public abstract boolean isBodyEquipped();
    public abstract boolean isHandEquipped();
    public abstract boolean isFeetEquipped();
    
    public abstract void setHeadEquipped(boolean status);
    public abstract void setBodyEquipped(boolean status);
    public abstract void setHandEquipped(boolean status);
    public abstract void setFeetEquipped(boolean status);

    public abstract  int getHealth();
    public abstract  int getDefense();
    public abstract  int getAttack();

}
