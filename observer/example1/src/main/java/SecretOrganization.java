import java.util.HashSet;


public class SecretOrganization {
    public String name  ="";
    public HashSet<Spy> agents;
    public SecretOrganization(String name){
        this.name =name;
    }

    public void join(Spy agent){
        agents.add(agent);
    }


    public void terminate(Spy agent){}
    public Mission createMission(){ return null;}
    public void sendMission(){}

}
