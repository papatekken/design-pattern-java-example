public class SwimPlan implements IHealthPlan {
    public int execute(String name, int health) {
        System.out.println(name + " swims.");
        return health + 4;
    }
}
