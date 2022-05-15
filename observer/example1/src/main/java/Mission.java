public class Mission {
    private  String name;
    private String objective;

    public Mission(String name,String objective){
        this.name = name;
        this.objective = objective;
    }

    public String getName(){
        return this.name;
    }
    public String getObjective(){
        return this.objective;
    }
}
