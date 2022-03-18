public class Main {

    public static void main(String[] args){

        //human can communicate with human, navi can communicate with navi
        //human can't communicate with navi, and need avatar adapter to  do so
        Human human = new Human("Jake Sully");
        Human human2 = new Human("Miles Quaritch");
        Navi navi = new Navi("Neytiri");
        Navi navi2 = new Navi("Eytukan");

        human.communicate(human2);
        navi.communicate(navi2);

        // compile error - incompatible types
        // human.communicate(navi);

        Avatar avatar = new Avatar(human);

        //now it works
        avatar.communicate(navi);
        avatar.communicate(human2);
    }
}
