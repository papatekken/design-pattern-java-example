import java.util.HashSet;

public class Spy {
    String name  ="";
    HashSet<Mission> toDoList = new HashSet<Mission>();
    public Spy(String name){
        this.name =name;
    }
    public void receive(Mission mission){
        toDoList.add(mission);
        System.out.println(this.name + " received mission [" + mission.getName() +"]");
    }

}
