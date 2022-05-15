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

    public void terminate(Spy agent){
        agents.remove(agent);
    }

    public Mission createMission(String name, String objective){
        return new Mission(name, objective);
    }

    public void notifyMission(Mission mission){
        for(Spy spy:agents)
            spy.receive(mission);
    }

}
