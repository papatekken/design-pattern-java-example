public class Main {

    public static void main(String[] args){


        //Strategy Design Pattern example
        //Alex, Betty and Clark want to get healthier, and each of them have different strategy for that.

        //Alex like jogging once per week, he always sleeps at regular time and do meditation every day.
        //Betty like to work out in gym once per week and eat cook healthy food by herself
        //Clark like to work out in gym and stay away from technology once per week, and jogging every day.

        int day = 1;
        Person[] people = new Person[3];
        people[0] = new Person("Alex");
        people[1] = new Person("Betty");
        people[2] = new Person("Clark");


        System.out.println("\n*** Start of plan ***");
        while(!isEveryoneHealthy(people)){

            System.out.println("\nDay " +day);
            showEveryoneHealth(people);
            if(day%7==0){
                people[0].setHealthPlan(new SleepRegularPlan());
                people[0].doHeahlthPlan();
                people[0].setHealthPlan(new MeditationPlan());
                people[0].doHeahlthPlan();
                people[1].setHealthPlan(new GymPlan());
                people[1].doHeahlthPlan();
                people[2].setHealthPlan(new GymPlan());
                people[2].doHeahlthPlan();
                people[2].setHealthPlan(new TechnologyBreakOut());
                people[2].doHeahlthPlan();
            }

            people[0].setHealthPlan(new JoggingPlan());
            people[0].doHeahlthPlan();
            people[1].setHealthPlan(new GymPlan());
            people[1].doHeahlthPlan();
            people[2].setHealthPlan(new GymPlan());
            people[2].doHeahlthPlan();
            people[2].setHealthPlan(new TechnologyBreakOut());
            people[2].doHeahlthPlan();
            day++;
        }

        System.out.println("\n*** End of plan ***");

        showEveryoneHealth(people);

    }

    public static void showEveryoneHealth(Person[] people){
        for(Person person:people){
            person.showHealth();
        }
    }
    public static boolean isEveryoneHealthy(Person[] people){
        boolean outputAllHealthy= true;
        for(Person person:people){
            if(!person.isHealthy())
                outputAllHealthy= false;
        }
        return outputAllHealthy;
    }
}
