import java.util.LinkedList;

public class SecretOrganization {
    public String name  ="";
    public LinkedList<Spy> agents;
    public SecretOrganization(String name){
        this.name =name;
    }

    public void join(Spy agent){}
    public void terminate(Spy agent){}
    public Mission createMission(){ return null;}
    public void sendMission(){}

}
