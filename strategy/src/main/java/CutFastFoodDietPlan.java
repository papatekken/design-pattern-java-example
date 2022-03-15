public class CutFastFoodDietPlan implements IHealthPlan {
    public int execute(String name, int health){
        System.out.println(name + " has a healthy meal");
        return health+2;
    };

}
