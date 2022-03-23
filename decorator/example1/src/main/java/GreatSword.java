public class GreatSword extends Gear{
    public GreatSword(Character character) {
        this.character = character;
        if (!isHandEquipped()){
            this.name = "great sword";
            this.attack = 12;
            setHandEquipped(true);
        }
    }
}
