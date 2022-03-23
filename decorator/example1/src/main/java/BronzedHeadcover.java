public class BronzedHeadcover extends Gear{
    public BronzedHeadcover(Character character) {
        this.character = character;
        if (!isHeadEquipped()){
            this.name = "bronzed headcover";
            this.defense = 3;
            setHeadEquipped(true);
        }
    }
}
