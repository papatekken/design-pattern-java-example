public class GymPlan implements IHealthPlan {
    public int execute(String name, int health) {
        System.out.println(name + " works out in gym");
        return health + 5;
    }
}
