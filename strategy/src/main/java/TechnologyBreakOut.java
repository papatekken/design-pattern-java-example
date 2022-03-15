public class TechnologyBreakOut implements IHealthPlan{
    public int execute(String name, int health){
        System.out.println(name +" turns off the phone and computer today");
        return health+1;
    };
}
