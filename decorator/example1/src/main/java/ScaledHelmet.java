public class ScaledHelmet extends Gear{
    public ScaledHelmet(Character character) {
        this.character = character;
        if (!isHeadEquipped()){
            this.name = "scaled helmet";
            this.defense = 5;
            setHeadEquipped(true);
        }
    }
}
