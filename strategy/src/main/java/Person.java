public class Person {

    private final int HEALTH_TARGET = 50;
    private final String name;
    private int health = 5;
    private IHealthPlan healthPlan;

    public Person(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return this.health >= HEALTH_TARGET;
    }

    public void showHealth() {
        System.out.println(this.name + "'s health:" + health);
    }

    public void setHealthPlan(IHealthPlan healthPlan) {
        this.healthPlan = healthPlan;
    }

    public void doExercise() {
        if (this.healthPlan == null)
            System.out.println(this.name + " do nothing.");
        else
            this.health = healthPlan.execute(this.name, this.health);
    }
}
