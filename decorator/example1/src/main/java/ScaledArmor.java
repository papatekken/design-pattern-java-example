public class ScaledArmor extends Gear{
    public ScaledArmor(Character character) {
        this.character = character;
        if (!isBodyEquipped()){
            this.name = "scaled armor";
            this.defense = 7;
            this.health  =2 ;
            setBodyEquipped(true);
        }
    }
}
