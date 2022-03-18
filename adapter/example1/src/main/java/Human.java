public class Human implements IHuman{
    private String name ;

    public Human(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void communicate(IHuman human){
        System.out.println(this.getName() + " communicates with " + human.getName() + ".");
    };

}
