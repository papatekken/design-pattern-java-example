public class Main {

    public static void main(String[] args){

        Character player1 = new Player("Player1");
        printCharacter(player1);


        Character player2 = new Player("Player2");
        player2 = new Helmet(player2);

        printCharacter(player2);

    }

    public static void printCharacter(Character character){
        System.out.println(character.getDescription()+"\n");
        System.out.println("Health:" + character.getHealth());
        System.out.println("Attack:" + character.getAttack());
        System.out.println("Defense:" + character.getDefense());
    }
}
