public class Main {

    public static void main(String[] args){

        Character player1 = new Player("Player1");
        printCharacter(player1);

        Character player2 = new Player("Player2");
        player2 = new BronzedHeadcover(player2);
        player2 = new SpikeHammer(player2);
        player2 = new BronzedHeadcover(player2); //head gear equipped already so ignore this request
        player2 = new GreatSword(player2); //hand gear equipped already so ignore this request
        printCharacter(player2);

        Character player3 = new Player("Player3");
        player3 = new RangerBoots(player3);
        player3 = new ScaledArmor(player3);
        player3 = new GreatSword(player3);
        player3 = new ScaledHelmet(player3);
        printCharacter(player3);

    }

    public static void printCharacter(Character character){
        System.out.println("\n"+character.getDescription());
        System.out.println("Health:" + character.getHealth());
        System.out.println("Attack:" + character.getAttack());
        System.out.println("Defense:" + character.getDefense());
    }
}
