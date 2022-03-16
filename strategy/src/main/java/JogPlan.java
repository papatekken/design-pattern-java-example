public class JogPlan implements IHealthPlan {
    public int execute(String name, int health) {
        System.out.println(name + " jogs");
        return health + 3;
    }
}
