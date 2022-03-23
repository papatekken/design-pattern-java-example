public abstract class Gear extends Character {
    Character character;
    String name = "";
    int health = 0;
    int defense =0;
    int attack =0;


    public String getDescription(){
        String output = character.getDescription();
        if(this.name!="") {
            int subIndex = output.lastIndexOf("nothing");
            if (subIndex >= 0)
                return output.substring(0, subIndex) + name;
            else
                return output + ", " + name;
        }
        return output;
    };

    public int getHealth(){return this.character.getHealth()+ this.health;};
    public int getDefense(){return this.character.getDefense()+this.defense;};
    public int getAttack(){return  this.character.getAttack()+this.attack;};

    public boolean isHeadEquipped(){return this.character.isHeadEquipped();}
    public boolean isBodyEquipped(){return this.character.isBodyEquipped();}
    public boolean isHandEquipped(){return this.character.isHandEquipped();}
    public boolean isFeetEquipped(){return this.character.isFeetEquipped();}

    public void setHeadEquipped(boolean status){ this.character.setHeadEquipped(status);}
    public void setBodyEquipped(boolean status){ this.character.setBodyEquipped(status);}
    public void setHandEquipped(boolean status){ this.character.setHandEquipped(status);}
    public void setFeetEquipped(boolean status){ this.character.setFeetEquipped(status);}
}
