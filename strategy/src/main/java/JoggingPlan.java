public class JoggingPlan implements IHealthPlan{
    public int execute(String name, int health){
        System.out.println(name + " jogging for an hour");
        return health+3;
    };
}
