public class Main {

    public static void main(String[] args) {


        //Strategy Design Pattern example
        //Alex, Betty and Clark want to get healthier, and each of them have different strategy for that.

        //Alex like to jog every day.
        //Betty like to work out in gym every day.
        //Clark like to swim every day.

        //On every 7th days,
        //Alex go swimming, Betty go jogging and Clark go to gym


        int day = 1;
        Person[] people = new Person[3];
        people[0] = new Person("Alex");
        people[1] = new Person("Betty");
        people[2] = new Person("Clark");


        System.out.println("\n*** Start of plan ***");
        while (!isEveryoneHealthy(people)) {

            System.out.println("\nDay " + day);
            showEveryoneHealth(people);
            if (day % 7 == 0) {
                people[0].setHealthPlan(new SwimPlan());
                people[0].doExercise();
                people[1].setHealthPlan(new JogPlan());
                people[1].doExercise();
                people[2].setHealthPlan(new GymPlan());
                people[2].doExercise();
            }

            people[0].setHealthPlan(new JogPlan());
            people[0].doExercise();
            people[1].setHealthPlan(new GymPlan());
            people[1].doExercise();
            people[2].setHealthPlan(new SwimPlan());
            people[2].doExercise();

            day++;
        }

        System.out.println("\n*** End of plan ***");

        showEveryoneHealth(people);

    }

    public static void showEveryoneHealth(Person[] people) {
        for (Person person : people) {
            person.showHealth();
        }
    }

    public static boolean isEveryoneHealthy(Person[] people) {
        boolean outputAllHealthy = true;
        for (Person person : people) {
            if (!person.isHealthy())
                outputAllHealthy = false;
        }
        return outputAllHealthy;
    }
}
