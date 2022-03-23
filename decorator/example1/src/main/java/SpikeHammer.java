public class SpikeHammer extends Gear{
    public SpikeHammer(Character character) {
        this.character = character;
        if (!isHandEquipped()){
            this.name = "spike hammer";
            this.attack = 8;
            setHandEquipped(true);
        }
    }
}
