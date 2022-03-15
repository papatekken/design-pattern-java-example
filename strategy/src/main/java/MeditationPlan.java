public class MeditationPlan implements IHealthPlan {
    public int execute(String name, int health){
        System.out.println(name + " is doing quiet meditation");
        return health+1;
    };
}
