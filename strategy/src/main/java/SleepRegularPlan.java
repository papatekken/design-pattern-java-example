public class SleepRegularPlan implements IHealthPlan {
    public int execute(String name, int health){
        System.out.println(name +" sleeps in regular pattern.");
        return health+2;
    };
}
