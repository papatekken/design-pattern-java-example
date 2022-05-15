public class Main {
    public static void main(String[] args){
            SecretOrganization kingsman = new SecretOrganization("Kingsman");
            Spy galahad = new Spy("Galahad");
            Spy percival = new Spy("Percival");
            Spy lancelot = new Spy("Lancelot");
            kingsman.join( galahad);
            kingsman.join( percival);
            kingsman.join( lancelot);
    }
}
