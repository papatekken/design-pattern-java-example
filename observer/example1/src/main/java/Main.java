public class Main {
    public static void main(String[] args){
            SecretOrganization kingsman = new SecretOrganization("Kingsman");
            Spy galahad = new Spy("Galahad");
            Spy percival = new Spy("Percival");
            Spy lancelot = new Spy("Lancelot");
            kingsman.join( galahad);
            kingsman.join( percival);
            kingsman.join( lancelot);
            kingsman.notifyMission(new Mission("Investigate THE PLAN","Investigate the plan of the criminal mastermind"));
            kingsman.terminate( lancelot);
            kingsman.notifyMission(new Mission("Stop THE PLAN","Stop the plan and save the world"));
    }
}
