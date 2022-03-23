public class RangerBoots extends Gear{
    public RangerBoots(Character character) {
        this.character = character;
        if (!isFeetEquipped()){
            this.name = "ranger boots";
            this.defense = 3;
            setFeetEquipped(true);
        }
    }
}
